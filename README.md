# Central Confidential Consistency Checking Framework

This repository contains a prototype implementation of a central confidential consistency checking (C4 or CCCC) framework for model-based systems engineering (MBSE) projects. 
The C4 facilitates the detection of inconsistencies between different models (possibly modeled by different modeling tools) while prevent direct data exchange between different parties and preserving data confidentiality. 
Below is a brief overview of the directory structure.

## Literature Reference
This prototype was first described in this paper: 

["Modular Consistency Checking Between Heterogeneous Models Without Direct Data Exchange Between Collaborators", 2024, by Sebastian Bergemann and Nina Benkendorf](https://dl.acm.org/doi/10.1145/3652620.3688554)

## Directory Overview
- **executable**: Built JAR file of the C4 with all dependencies included to have an executable C4 library. It can be started, but the whole process only works fully with the consistency adapters for which their modeling tools including licenses are needed, which is why we do not provide them here.
- **generated-src**: Generated Java source files based on the model definitions.
- **generatedViewtypes**: Generated consistency viewtype definitions to have a minimal viewtype collection for testing purpose.
- **lib**: External libraries used in the project.
- **model**: Model definitions for the C4.
- **res**: Resource files, including, e.g., configuration settings and consistency rule definitions. They were created only for testing purpose (especially the security keys should usually be saved in a secure location, e.g., with key manager services).
- **src**: Source code for the C4.

**As already stated, we cannot provide for now a whole test setup, because this requires having access to all the modeling tools of the consistency adapters. Therefore, this repository can only be used as lookup of the source code of the C4.**

## C4 Executable Launch
The C4 is started by creating an instance of the `org.fortiss.consistency.CentralConsistencyEnvironment` (with a path to the current resource (res) directory) and using it to call its start() method. 
You can try this out with a JRE (tested with Java 11.0.21) by using our executable:
- Winodws:
```
java -jar .\executable\consistency-app-1.0-jar-with-dependencies.jar .\res
```
- Linux:
```
java -jar ./executable/consistency-app-1.0-jar-with-dependencies.jar ./res
```

Afterwards, consistency adapters can connect with the `org.fortiss.consistency.communication.ConsistencyServer` via REST API and send a check request. As explained above, this is something you cannot perform with this repository. The request is received here: `org.fortiss.consistency.communication.ConsistencyServer.ConsistencyServerController.checkConsistency()`. From there, you can follow the process flow if wanted (the server will create a `org.fortiss.consistency.checking.ConsistencyCheckingProcess` and call its `org.fortiss.consistency.checking.ConsistencyCheckingProcess.checkConsistency()` which performs the main checking process).

For more documentation, please check out the class and method descriptions/headers in each module/class.

## Consistency Rule Tests
The following consistency rules were tested (12.07.2024):

### R1
#### Natural Language
The execution unit / platform mount modeled in a CAD model must contain enough spaces, i.e. placeholders, to carry the number of execution units, i.e., Raspberry Pis, modeled inside corresponding technical architecture model.
#### User-specified rule
```
#executionPlatform#.containedElements->select(e | e.oclIsTypeOf(architectureElements::PlatformExecutionElement))->size() <= #mountGeometry#.containedElements->select(e | e.oclIsTypeOf(geometryElements::PlaceholderElement))->size()
```
#### Modified rule for final OCL evaluator
```
self.contextElements.at('executionPlatform').oclAsType(architectureElements::Platform).containedElements->select(e | e.oclIsTypeOf(architectureElements::PlatformExecutionElement))->size() <= self.contextElements.at('mountGeometry').oclAsType(geometryElements::Geometry).containedElements->select(e | e.oclIsTypeOf(geometryElements::PlaceholderElement))->size()
```

### R2
#### Natural Language
The stored platform weight value inside the logical model, which is used within the modeled behavior, must be identical with the modeled weight of all corresponding platform parts in the CAD model(s).
#### User-specified rule
```
if #dictEntry#.name = 'PLATFORM_WEIGHT' then
    #dictEntry#.oclAsType(dictionary::AbsoluteTermEntry).absoluteTerm.oclAsType(types::ValueDouble).value = #platformGeo#.containedElements->collect(elem : geometryElements::GeometryElement | elem.weight)->sum()
else
    -- If it is not this specific dictionary entry, we can ignore the rule.
    true
endif
```
#### Modified rule for final OCL evaluator
```
if self.contextElements.at('dictEntry').oclAsType(dictionary::DictionaryElement).name = 'PLATFORM_WEIGHT' then
    self.contextElements.at('dictEntry').oclAsType(dictionary::DictionaryElement).oclAsType(dictionary::AbsoluteTermEntry).absoluteTerm.oclAsType(types::ValueDouble).value = self.contextElements.at('platformGeo').oclAsType(geometryElements::Geometry).containedElements->collect(elem : geometryElements::GeometryElement | elem.weight)->sum()
else
    -- If it is not this specific dictionary entry, we can ignore the rule.
    true
endif
```

### R3
#### Natural Language
The offset of the laser sensor origin to the front of the rover, which is stored and used inside the logical model, must be identical with the modeled corresponding sensor offset based on the geometry in the CAD model(s).
#### User-specified rule
```
if #dictEntry#.name = 'FRONT_LASER_OFFSET' then
    #dictEntry#.oclAsType(dictionary::AbsoluteTermEntry).absoluteTerm.oclAsType(types::ValueDouble).value = (#roverGeo#.containedElements->select(geometryElem | geometryElem.name = 'Chassis')->first().origin.x - #roverGeo#.containedElements->select(geometryElem | geometryElem.name = 'FrontLaserSensor')->first().origin.x).abs()
else
    -- If it is not this specific dictionary entry, we can ignore the rule.
    true
endif
```
#### Modified rule for final OCL evaluator
```
if self.contextElements.at('dictEntry').oclAsType(dictionary::DictionaryElement).name = 'FRONT_LASER_OFFSET' then
    self.contextElements.at('dictEntry').oclAsType(dictionary::DictionaryElement).oclAsType(dictionary::AbsoluteTermEntry).absoluteTerm.oclAsType(types::ValueDouble).value = (self.contextElements.at('roverGeo').oclAsType(geometryElements::Geometry).containedElements->select(geometryElem | geometryElem.name = 'Chassis')->first().origin.x - self.contextElements.at('roverGeo').oclAsType(geometryElements::Geometry).containedElements->select(geometryElem | geometryElem.name = 'FrontLaserSensor')->first().origin.x).abs()
else
    -- If it is not this specific dictionary entry, we can ignore the rule.
    true
endif
```

### R4
#### Natural Language
The corresponding components inside the component architecture and the logical model must have the same name when the prefix "Task_" is ignored for the one in the logical model.
#### User-specified rule
```
if #componentAF3#.name.substring(1, ('Task_'.size())) = 'Task_' then
    #componentAF3#.name = 'Task_'.concat(#componentOM#.name)
else
    if #componentOM#.name.substring(1, ('Task_'.size())) = 'Task_' then
        #componentOM#.name = 'Task_'.concat(#componentAF3#.name)
    else
        false
    endif
endif
```
#### Modified rule for final OCL evaluator
```
if self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).name.substring(1, ('Task_'.size())) = 'Task_' then
    self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).name = 'Task_'.concat(self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).name)
else
    if self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).name.substring(1, ('Task_'.size())) = 'Task_' then
        self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).name = 'Task_'.concat(self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).name)
    else
        false
    endif
endif
```

### R5
#### Natural Language
The corresponding components inside the component architecture and the logical model must have the same interface, i.e., the same input ports based on their names.
#### User-specified rule
```
#componentAF3#.inputConnectors->size() = #componentOM#.inputConnectors->size() 
and 
#componentOM#.inputConnectors->collect(port : architectureElements::Connector | port.name)->includesAll(#componentAF3#.inputConnectors->collect(port : architectureElements::Connector | port.name))
```
#### Modified rule for final OCL evaluator
```
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).inputConnectors->size() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).inputConnectors->size() 
and 
self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).inputConnectors->collect(port : architectureElements::Connector | port.name)->includesAll(self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).inputConnectors->collect(port : architectureElements::Connector | port.name))
```

### R6
#### Natural Language
The corresponding components inside the component architecture and the logical model must have the same interface, i.e., the same output ports based on their names.
#### User-specified rule
```
#componentAF3#.outputConnectors->size() = #componentOM#.outputConnectors->size() 
and 
#componentOM#.outputConnectors->collect(port : architectureElements::Connector | port.name)->includesAll(#componentAF3#.outputConnectors->collect(port : architectureElements::Connector | port.name))
```
#### Modified rule for final OCL evaluator
```
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).outputConnectors->size() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).outputConnectors->size() 
and 
self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).outputConnectors->collect(port : architectureElements::Connector | port.name)->includesAll(self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).outputConnectors->collect(port : architectureElements::Connector | port.name))
```

### R7
#### Natural Language
The corresponding components inside the component architecture and the logical model must have the same interface, i.e., the same input port signal types.
#### User-specified rule
```
#componentAF3#.inputConnectors->size() = #componentOM#.inputConnectors->size() 
and 
#componentAF3#.inputConnectors->forAll(type.oclType() = #componentOM#.inputConnectors->select(port | port.name = name)->first().type.oclType())
```
#### Modified rule for final OCL evaluator
```
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).inputConnectors->size() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).inputConnectors->size() 
and 
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).inputConnectors->forAll(type.oclType() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).inputConnectors->select(port | port.name = name)->first().type.oclType())
```

### R8
#### Natural Language
The corresponding components inside the component architecture and the logical model must have the same interface, i.e., the same output port signal types.
#### User-specified rule
```
#componentAF3#.outputConnectors->size() = #componentOM#.outputConnectors->size() 
and 
#componentAF3#.outputConnectors->forAll(type.oclType() = #componentOM#.outputConnectors->select(port | port.name = name)->first().type.oclType())
```
#### Modified rule for final OCL evaluator
```
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).outputConnectors->size() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).outputConnectors->size() 
and 
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).outputConnectors->forAll(type.oclType() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).outputConnectors->select(port | port.name = name)->first().type.oclType())
```

### R9
#### Natural Language
The corresponding components inside the component architecture and the logical model must have the same interface, i.e., the same input port signal units modeled as comment.
#### User-specified rule
```
#componentAF3#.inputConnectors->size() = #componentOM#.inputConnectors->size() 
and 
#componentAF3#.inputConnectors->forAll(comment = #componentOM#.inputConnectors->select(port | port.name = name)->first().comment)
```
#### Modified rule for final OCL evaluator
```
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).inputConnectors->size() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).inputConnectors->size() 
and 
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).inputConnectors->forAll(comment = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).inputConnectors->select(port | port.name = name)->first().comment)
```

### R10
#### Natural Language
The corresponding components inside the component architecture and the logical model must have the same interface, i.e., the same output port signal units modeled as comment.
#### User-specified rule
```
#componentAF3#.outputConnectors->size() = #componentOM#.outputConnectors->size() 
and 
#componentAF3#.outputConnectors->forAll(comment = #componentOM#.outputConnectors->select(port | port.name = name)->first().comment)
```
#### Modified rule for final OCL evaluator
```
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).outputConnectors->size() = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).outputConnectors->size() 
and 
self.contextElements.at('componentAF3').oclAsType(architectureElements::LogicalElement).outputConnectors->forAll(comment = self.contextElements.at('componentOM').oclAsType(architectureElements::LogicalElement).outputConnectors->select(port | port.name = name)->first().comment)
```

### R11
#### Natural Language
A component inside the component architecture must exist for every task inside the corresponding task architecture with this name pattern `Task\_<componentName>`. Phrased slightly different: If a task in a task architecture exists than a component in the corresponding component architecture must exists that has the same name (without the prefix 'Task_').
#### User-specified rule
```
-- With closure() you can do recursion on features!
let components : Collection(architectureElements::LogicalElement) = #topComponent#.containedElements->closure(containedElements),
    componentNames : Collection(String) = components->asSequence()->iterate(component : architectureElements::LogicalElement; names : Collection(String) = Collection{} | names->including(component.name))
in
-- "Task_" has five chars, which is why the start index should be 6 to ignore it.
#taskArch#.containedElements->forAll(task | componentNames->includes(task.name.substring(('Task_'.size() + 1),task.name.size())))
```
#### Modified rule for final OCL evaluator
```
-- With closure() you can do recursion on features!
let components : Collection(architectureElements::LogicalElement) = self.contextElements.at('topComponent').oclAsType(architectureElements::LogicalElement).containedElements->closure(containedElements),
    componentNames : Collection(String) = components->asSequence()->iterate(component : architectureElements::LogicalElement; names : Collection(String) = Collection{} | names->including(component.name))
in
-- "Task_" has five chars, which is why the start index should be 6 to ignore it.
self.contextElements.at('taskArch').oclAsType(architectureElements::TaskArchitecture).containedElements->forAll(task | componentNames->includes(task.name.substring(('Task_'.size() + 1),task.name.size())))
```
    
