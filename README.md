# Dependency Chain Validator

## Overview
This project provides a Java implementation for validating chains of dependent nodes. It can handle chains composed of either numerical digits or lowercase alphabetic characters, ensuring that each composite element (be it a number with multiple digits or a word with multiple letters) has its dependencies satisfied by other single elements present in the list.

## Structure
The project is structured into two main packages within the `src/main/java/org/com/` directory:

- `model`: Contains the interfaces and classes that represent individual and composite nodes.
  - `NodeInterface.java` (or `Node.java`): Interface for node entities.
  - `ElementaryNode.java` (or `AtomicNode.java`): Represents a single character or digit node.
  - `CompositeNode.java`: Represents a node that is a composition of other nodes.
- `chain`: Contains the business logic to validate node chains.
  - `DependencyChainValidator.java`: Service class to validate the dependencies of the node chain.
- `runner`: Contains the main execution class.
  - `NodeChainValidatorRunner.java`: Main class to run validation tests.

## How to Run
To test the validation logic, compile and execute the `NodeChainValidatorRunner` class. This class contains a main method that demonstrates the validation process with predefined node lists. The output will display whether the given chains are valid or not.

1. Compile the code:
    ```sh
    javac NodeChainValidatorRunner.java
    ```
2. Run the compiled class:
    ```sh
    java NodeChainValidatorRunner
    ```

## Examples
The application validates chains such as the following:

- Valid chain (numbers): `36`, `6`, `24`, `4`, `47`, `7`, `2`, `3`, `27`
- Valid chain (letters): `p`, `aba`, `a`, `b`, `perso`, `o`, `r`, `e`, `s`
- Invalid chain: `35`, `5`, `65`, `6`, `24`, `4` (number `2` is missing).
