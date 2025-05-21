# mapper_poc

A Java project demonstrating the use of the MapStruct library for object mapping.

## Overview

This project is a proof of concept (POC) for using MapStruct, a code generator that greatly simplifies the implementation of mappings between Java bean types based on a convention-over-configuration approach. The project is built with Maven and uses Java 21.

## Key Technologies

- **Java 21**: The project is configured to use Java version 21.
- **Maven**: For project management and build automation.
- **MapStruct**: Version 1.5.5.Final is used for automatic generation of type-safe mappers.
- **Lombok**: Version 1.18.38 is used to reduce boilerplate code in Java classes.

## MapStruct

[MapStruct](https://mapstruct.org/) is a Java annotation processor for the generation of type-safe bean mapping classes. It allows you to automatically generate mapping code between Java beans, which is especially useful for converting between DTOs and entities in layered architectures.

### Why MapStruct?

- Eliminates the need for manual mapping code.
- Generates fast and type-safe mappers at compile time.
- Integrates easily with other frameworks and libraries.

### How MapStruct is Used in This Project

- The `mapstruct` and `mapstruct-processor` dependencies are included in the `pom.xml`.
- Annotated interfaces are used to define mapping methods.
- The MapStruct processor generates the implementation classes during the build process.

## Dependencies

The main dependencies in this project are:

```xml
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>1.5.5.Final</version>
</dependency>
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct-processor</artifactId>
    <version>1.5.5.Final</version>
</dependency>
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.18.38</version>
</dependency>
```

## Building the Project

To build the project, run:

```sh
mvn clean install
```

## Getting Started

1. Clone the repository.
2. Ensure you have Java 21 and Maven installed.
3. Build the project using Maven.
4. Explore the source code to see how MapStruct is used for object mapping.

## License

This project is for demonstration purposes. 