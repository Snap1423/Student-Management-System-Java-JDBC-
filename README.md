# Student Management System (Java + JDBC)

A console-based Student Management System built using Java and JDBC.

## Features
- Add Student
- View All Students
- Update Student
- Delete Student

## Tech Stack
- Java
- JDBC
- MySQL

## Concepts Used
- OOP
- DAO Pattern
- PreparedStatement
- ResultSet Mapping
- Layered Architecture

## How to Run
1. Create MySQL database:
   CREATE DATABASE student_db;

2. Create students table:
   CREATE TABLE students (
       id INT PRIMARY KEY AUTO_INCREMENT,
       name VARCHAR(100),
       email VARCHAR(100),
       course VARCHAR(100)
   );

3. Update DBConnection with your credentials.
4. Run App.java
