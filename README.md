# <h1 align = "center">  TODO APP </h1>
___ 
<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.1.3-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">

<!-- Project Description -->
## Overview
<p align="center">This project,   Insta Basic ," is a robust Spring Boot application designed for managing user data efficiently. It provides a set of API endpoints that allow you to perform various operations on user records, such as adding, retrieving, updating, and deleting user information. 
</p>

<!-- Table of Contents -->
## Table of Contents
1. [Technologies Used](#technologies-used)
2. [Key Features](#key-features)
3. [Usage](#usage)
4. [API reference](#api-reference)
5. [License](#license)
6. [Acknowledgments](#acknowledgments)
7. [Contact](#contact)

<!-- Technologies Used -->
## Technologies Used
- Java 8
- Spring Boot
- Spring Web Initializer
- Maven
- Spring Web Dependency
- SQL DRIVER
- JPA
- SWAGGER
-

## Model Classes
- TOdo Entity :-The Todo entity represents an todo record in your Spring Boot application. It is used to store information about a user's todo,
-  including details such as name, Id,status.

## Controller Class
# Todo Controller

The `TodoController` is a part of a Spring Boot application responsible for handling TODO-related operations. It defines several RESTful endpoints for creating, retrieving, updating, and deleting TODO items.

## Table of Contents

- [Endpoints](#endpoints)
- [Usage](#usage)
- [Example Usage](#example-usage)

## Endpoints

The `TodoController` provides the following endpoints for managing TODO items:

- **POST** `/post`: Create a new TODO item.

  - Request: Send a JSON object containing the `TODO` item to be created.
  - Response: A message indicating the result of the operation.

- **GET** `/get`: Retrieve a list of all TODO items.

  - Response: Returns a list of TODO items.

- **PUT** `/update`: Update a TODO item.

  - Request: Pass `id` and `name` as query parameters to update the name of a TODO item with the given `id`.
  - Response: A message indicating the result of the update operation.

- **DELETE** `/DELETE`: Delete a TODO item.

  - Request: Pass the `id` as a query parameter to delete the TODO item with the specified `id`.
  - Response: A message indicating the result of the delete operation.

## Usage

The `TodoController` is used to interact with your TODO application by providing a RESTful API. You can use various HTTP clients, such as Postman, cURL, or client libraries, to send requests to these endpoints.

## Service Class
# Todo Service

The `TodoService` is a Spring service class responsible for managing and providing operations related to TODO items in your application. It encapsulates the business logic for creating, retrieving, updating, and deleting TODO items.

## Table of Contents

- [Methods](#methods)
- [Usage](#usage)
- [Example Usage](#example-usage)

## Methods

The `TodoService` provides the following methods for managing TODO items:

- `AddTodo(TODO newTodo)`: Add a new TODO item.
  - Parameters: `newTodo` - The new TODO item to be added.
  - Returns: A message indicating the result of the operation.

- `getAll()`: Retrieve a list of all TODO items.
  - Returns: A list of TODO items.

- `UpdateData(Integer id, String name)`: Update the name of a TODO item by ID.
  - Parameters: `id` - The ID of the TODO item to update. `name` - The new name for the TODO item.
  - Returns: A message indicating the result of the update operation.

- `DELETEDATA(Integer id)`: Delete a TODO item by ID.
  - Parameters: `id` - The ID of the TODO item to delete.
  - Returns: A message indicating the result of the delete operation.

## Usage

The `TodoService` is used to provide the core functionality for managing TODO items. It serves as the bridge between the `TodoController` and the underlying data repository (presumably, an `ITodorepo`).

## Example Usage

Here are some examples of how to use the methods provided by the `TodoService`:

### Add a TODO Item

```java
TODO newTodo = new TODO();
newTodo.setTodoName("Buy groceries");
newTodo.setTodoStatus(false);

String result = todoService.AddTodo(newTodo);
