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

import java.io.IOException;

import org.fortiss.consistency.exceptions.FailedDecryptionException;
import org.fortiss.consistency.exceptions.FailedEncryptionException;

/**
 * Interface for the encryption and decryption needed during the consistency checking process. This
 * is mainly needed for the additional encryption of the message bodies sent between the adapters
 * and the central consistency checking instance.
 * 
 * @author bergemann
 */
public interface IEncryptionManager {

	/**
	 * Sets up the security environment, e.g., registering the external library configs, or getting
	 * all the public and private keys needed for further communication.
	 * 
	 * @return True if the setup was successful, otherwise false.
	 */
	public boolean performInitialSetup();

	/**
	 * Encrypts the given plaintext string into a ciphertext byte array that only the given target
	 * can decrypt it.
	 * 
	 * @param plaintext
	 *            The plaintext as string that should be encrypted.
	 * @param targetIdentifier
	 *            The target that should only be able to decrypt it.
	 * 
	 * @return The encrypted plaintext as byte array for the target.
	 * 
	 * @throws FailedEncryptionException
	 */
	public byte[] encryptFor(String plaintext, String targetIdentifier)
			throws FailedEncryptionException;

	/**
	 * Decrypts the given ciphertext byte array into a plaintext string.
	 * 
	 * @param ciphertext
	 *            The ciphertext that should be decrypted.
	 * @param ownIdentifier
	 *            The target for which it should be decrypt (usually the own identifier).
	 * 
	 * @return The decrypted plaintext as string.
	 * 
	 * @throws FailedDecryptionException
	 */
	public String decryptFor(byte[] ciphertext, String ownIdentifier)
			throws FailedDecryptionException;

	/**
	 * Returns the serialized key(set) from the key file of the given path.
	 * This method will be used to get the public keys from all adapters stored in key files.
	 * 
	 * @param absoluteKeyFilePath
	 *            The path to the key file from which the keyset is wanted.
	 * 
	 * @return Serialized key(set) from the key file of the given path.
	 * 
	 * @throws IOException
	 */
	public String getSerializedKeyFromFile(String absoluteKeyFilePath) throws IOException;
}
