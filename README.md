# Dependency Chain Validator

## Overview
The Dependency Chain Validator is a Java application designed to ensure the integrity of dependency chains, where composite nodes (such as multi-digit numbers or words) are validated based on their constituent single-digit or single-letter nodes.

## Structure
The project is structured into main packages under `src/main/java/org/com/chain/`:

- `model`: Contains the data models for the nodes.
  - `Node.java`: Interface that defines the structure of a node.
  - `CompositeNode.java`: Represents composite nodes that have dependencies.
  - `SimpleNode.java`: Represents simple nodes without dependencies.

- `ChainValidator`: Contains the logic to validate the nodes ensuring that composite nodes have their dependencies within the chain.

- `NodeChainValidatorRunner`: A runner class that includes a main method to demonstrate the validation logic with sample node chains.

## Running the Application
To execute the Dependency Chain Validator:

1. Navigate to the project's root directory.
2. Compile the code using:
    ```sh
    javac -d . src/main/java/org/com/chain/*.java src/main/java/org/com/chain/model/*.java
    ```
3. Run the application:
    ```sh
    java org.com.chain.NodeChainValidatorRunner
    ```

## Examples
The validator supports chains such as:

- Valid numeric chain: `36`, `6`, `24`, `4`, `47`, `7`, `2`, `3`, `27`
- Valid alphabetic chain: `p`, `aba`, `a`, `b`, `perso`, `o`, `r`, `e`, `s`
- Invalid chain example: `35`, `5`, `65`, `6`, `24`, `4` (missing the node `2`).

