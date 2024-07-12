/*-------------------------------------------------------------------------+
| Copyright 2024 fortiss GmbH                                              |
|                                                                          |
| Licensed under the Apache License, Version 2.0 (the "License");          |
| you may not use this file except in compliance with the License.         |
| You may obtain a copy of the License at                                  |
|                                                                          |
|    http://www.apache.org/licenses/LICENSE-2.0                            |
|                                                                          |
| Unless required by applicable law or agreed to in writing, software      |
| distributed under the License is distributed on an "AS IS" BASIS,        |
| WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. |
| See the License for the specific language governing permissions and      |
| limitations under the License.                                           |
+--------------------------------------------------------------------------*/
package org.fortiss.consistency.security.encryption;

import static com.google.crypto.tink.TinkJsonProtoKeysetFormat.parseKeyset;
import static java.nio.file.Files.readAllBytes;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

import org.fortiss.consistency.configuration.ConsistencyConfiguration;
import org.fortiss.consistency.exceptions.FailedDecryptionException;
import org.fortiss.consistency.exceptions.FailedEncryptionException;
import org.fortiss.consistency.model.communication.ToolAdapterRegistrationEntry;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.InsecureSecretKeyAccess;
import com.google.crypto.tink.KeysetHandle;
import com.google.crypto.tink.config.TinkConfig;

/**
 * Class containing all methods relevant for the encryption and decryption needed during the
 * consistency checking process. This is mainly needed for the additional encryption of the message
 * bodies sent between the adapters and the central consistency checking instance.
 * 
 * @author bergemann
 */
public class TinkEncryptionManager implements IEncryptionManager {

	/** Map that contains the public key (handle) for every registered agent. */
	protected Map<String, KeysetHandle> publicKeysPerAgent;
	/** Map that contains the private key (handle) for every registered agent. */
	protected Map<String, KeysetHandle> privateKeysPerAgent;
	/** The configuration that has all the basic consistency information. */
	protected ConsistencyConfiguration config;

	/**
	 * Constructor.
	 * 
	 * @param config
	 *            The configuration with all the information needed for this class.
	 */
	public TinkEncryptionManager(ConsistencyConfiguration config) {
		this.config = config;
		this.publicKeysPerAgent = new HashMap<>();
		this.privateKeysPerAgent = new HashMap<>();
	}

	/** {@inheritDoc} */
	@Override
	public boolean performInitialSetup() {
		try {
			TinkConfig.register();

			// Get own keys.
			KeysetHandle ownPrivateKey =
					getKeysetHandleFromResFile(config.getPathOfPrivateEncryptionKeyFile());
			KeysetHandle ownPublicKey =
					getKeysetHandleFromResFile(config.getPathOfPublicEncryptionKeyFile());
			privateKeysPerAgent.put(config.getConsistencyCheckerIdentifier(), ownPrivateKey);
			publicKeysPerAgent.put(config.getConsistencyCheckerIdentifier(), ownPublicKey);

			// Get adapters keys.
			Map<String, ToolAdapterRegistrationEntry> registeredAdapters =
					config.getRegisteredAdapters();
			for(ToolAdapterRegistrationEntry toolAdapterRegistration : registeredAdapters
					.values()) {
				String adapterIdentifier = toolAdapterRegistration.getAdapterIdentifier();
				KeysetHandle publicKey = deserializeKeysetHandle(
						toolAdapterRegistration.getSerializedAdapterPublicKey());
				publicKeysPerAgent.put(adapterIdentifier, publicKey);
			}

			return true;
		} catch(GeneralSecurityException | IOException e) {
			return false;
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Encrypts the given plaintext string into a ciphertext byte array in a hybrid way that only
	 * the given target can decrypt it, i.e., the plaintext is encrypted with an every time newly
	 * generated symmetric key and this symmetric key is encrypted with the public key of the given
	 * target so that (only) the target can decrypt the symmetric key with its private key and use
	 * it to decrypt the actual message.
	 * 
	 * Used template: https://developers.google.com/tink/exchange-data
	 */
	@Override
	public byte[] encryptFor(String plaintext, String targetIdentifier)
			throws FailedEncryptionException {
		byte[] plaintextBytes = config.encodeAsBytes(plaintext);
		byte[] emptyContext = new byte[0];
		HybridEncrypt encryptor = null;
		try {
			encryptor = getHybridEncryptionPrimitiveOf(targetIdentifier);
			if(encryptor != null) {
				return encryptor.encrypt(plaintextBytes, emptyContext);
			}
		} catch(GeneralSecurityException e) {
			throw new FailedEncryptionException(e.getMessage());
		}
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Decrypts the given ciphertext byte array into a plaintext string in a hybrid way, i.e., the
	 * own given private key is used to decrypt the symmetric key with which the plaintext was
	 * initially encrypted and the latter key is then used to decrypt the actual text.
	 * This only works if the ciphertext was meant for this agent, i.e., that the own public key was
	 * used to encrypt it.
	 * 
	 * Used template: https://developers.google.com/tink/exchange-data
	 */
	@Override
	public String decryptFor(byte[] ciphertext, String ownIdentifier)
			throws FailedDecryptionException {
		byte[] emptyContext = new byte[0];
		HybridDecrypt decryptor = null;
		try {
			decryptor = getHybridDecryptionPrimitiveOf(ownIdentifier);
			if(decryptor != null) {
				byte[] plaintextBytes = decryptor.decrypt(ciphertext, emptyContext);
				return config.decodeBytes(plaintextBytes);
			}
		} catch(GeneralSecurityException e) {
			e.printStackTrace();
			throw new FailedDecryptionException(e.getMessage());
		}
		return null;
	}

	/** {@inheritDoc} */
	@Override
	public String getSerializedKeyFromFile(String absoluteKeyFilePath) throws IOException {
		Path keyFilePath = Paths.get(absoluteKeyFilePath);
		return new String(readAllBytes(keyFilePath), config.getByteEncoding());
	}

	/**
	 * Returns a deserialized keyset handle of the given serialized keyset string.
	 * 
	 * @param serializedKey
	 *            The key as serialized string.
	 * 
	 * @return Keyset handle from the serialized key string.
	 * 
	 * @throws GeneralSecurityException
	 */
	private KeysetHandle deserializeKeysetHandle(String serializedKey)
			throws GeneralSecurityException {
		// InsecureSecretKeyAccess only needed if it is a private keyset file. Private keyset files
		// should, of course, be stored properly and not as clear text, but how this is done with a
		// key management service (KMS) is very user/scenario dependent and just a technical
		// decision (not relevant here).
		return parseKeyset(serializedKey, InsecureSecretKeyAccess.get());
	}

	/**
	 * Returns the keyset handle from the key file of the given path that can only be an
	 * internal path inside the resource directory.
	 * 
	 * @param internalPathInRes
	 *            The path to the key file from which the keyset is wanted. The path must be an
	 *            internal/relative path inside the resource directory.
	 * 
	 * @return Keyset handle from the key file of the given path.
	 * 
	 * @throws GeneralSecurityException
	 * @throws IOException
	 */
	protected KeysetHandle getKeysetHandleFromResFile(String internalPathInRes)
			throws GeneralSecurityException, IOException {
		String absoluteKeyFilePath =
				config.getAbsolutePathOfInternalResourceFile(internalPathInRes);
		String serializedKey = getSerializedKeyFromFile(absoluteKeyFilePath);
		// InsecureSecretKeyAccess only needed if it is a private keyset file. Private keyset files
		// should, of course, be stored properly and not as cleartext, but how this is done with a
		// key management service (KMS) is very user/scenario dependent and just a technical
		// decision.
		return parseKeyset(serializedKey, InsecureSecretKeyAccess.get());
	}

	/**
	 * Returns the public key as keyset handle for the given agent identifier if it was registered.
	 * 
	 * @param identifier
	 *            The identifier of the agent from which the public key is wanted.
	 * 
	 * @return The keyset handle of the public key or null if none is registered.
	 */
	private KeysetHandle getRegisteredPublicKeysetHandle(String identifier) {
		return publicKeysPerAgent.get(identifier);
	}

	/**
	 * Returns the private key as keyset handle for the given agent identifier if it was registered.
	 * 
	 * @param identifier
	 *            The identifier of the agent from which the private key is wanted.
	 * 
	 * @return The keyset handle of the private key or null if none is registered.
	 */
	private KeysetHandle getRegisteredPrivateKeysetHandle(String identifier) {
		return privateKeysPerAgent.get(identifier);
	}

	/**
	 * Returns the hybrid encryption primitive for the given agent identifier if it can be found.
	 * This primitive is used to encrypt data that is meant for the given agent.
	 * 
	 * @param identifier
	 *            The identifier of the agent for which the encryption primitive is wanted.
	 * 
	 * @return The encryption primitive or null if none could be found/created.
	 */
	private HybridEncrypt getHybridEncryptionPrimitiveOf(String identifier)
			throws GeneralSecurityException {
		KeysetHandle publicKeysetHandle = getRegisteredPublicKeysetHandle(identifier);
		if(publicKeysetHandle != null) {
			return publicKeysetHandle.getPrimitive(HybridEncrypt.class);
		}
		return null;
	}

	/**
	 * Returns the hybrid decryption primitive for the given agent identifier if it can be found.
	 * This primitive is used to decrypt data that is meant for the given agent.
	 * 
	 * @param identifier
	 *            The identifier of the agent for which the decryption primitive is wanted.
	 * 
	 * @return The decryption primitive or null if none could be found/created.
	 */
	private HybridDecrypt getHybridDecryptionPrimitiveOf(String identifier)
			throws GeneralSecurityException {
		KeysetHandle privateKeysetHandle = getRegisteredPrivateKeysetHandle(identifier);
		if(privateKeysetHandle != null) {
			return privateKeysetHandle.getPrimitive(HybridDecrypt.class);
		}
		return null;
	}
}
