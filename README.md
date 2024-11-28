### Central Confidential Consistency Checking Framework

This repository contains a prototype implementation of a central confidential consistency checking (CCCC) framework for model-based systems engineering (MBSE) projects. 
The CCCC facilitates the detection of inconsistencies between different models (possibly modeled by different modeling tools) while preserving data confidentiality. 
Below is a brief overview of the directory structure:

- **executable**: Built JAR file of the CCCC with all dependencies included to have an executable CCCC library. It can be started, but the whole process only works fully with the consistency adapters for which their modeling tools including licenses are needed, which is why we do not provide them here.
- **generated-src**: Generated Java source files based on the model definitions.
- **generatedViewtypes**: Generated consistency viewtype definitions to have a minimal viewtype collection for testing purpose.
- **lib**: External libraries used in the project.
- **model**: Model definitions for the CCCC.
- **res**: Resource files, including, e.g., configuration settings and consistency rule definitions. They were created only for testing purpose (especially the security keys should usually be saved in a secure location, e.g., with key manager services).
- **src**: Source code for the CCCC.

**As already stated, we cannot provide for now a whole test setup, because this requires having access to all the modeling tools of the consistency adapters. Therefore, this repository can only be used as lookup of the source code of the CCCC.**

The CCCC is started by creating an instance of the `org.fortiss.consistency.ConsistencyEnvironment` (with a path to the current resource (res) directory) and using it to call its start() method. 
You can try this out with a JRE by using our executable:
```
java -jar .\executable\consistency-app-1.0-jar-with-dependencies.jar .\res
```

Afterwards, consistency adapters can connect with the `org.fortiss.consistency.communication.ConsistencyServer` via TLS socket (default testing configuration: 127.0.0.1:5000) and send a check request. As explained above, this is something you cannot perform with this repository. The request is received here: `org.fortiss.consistency.communication.ConsistencyServer.ClientRequestListener.run()`. From there, you can follow the process flow if wanted (the server will create a `org.fortiss.consistency.checking.ConsistencyCheckingProcess` and call its `org.fortiss.consistency.checking.ConsistencyCheckingProcess.checkConsistency()` which performs the main checking process).

For more documentation, please check out the class and method descriptions/headers in each module/class.
