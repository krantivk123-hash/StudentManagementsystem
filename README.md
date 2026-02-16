#  Student Information System

## Project Title
Student Information System (Console-Based Java Application)

##  Project Overview

The Student Information System is a console-based Java application developed using Object-Oriented Programming principles.  
This system allows users to manage student records efficiently with proper data validation and formatted output.
The application supports full CRUD operations:
- Add Student
- View Students
- Update Student
- Delete Student

##  Technical Requirements Implemented

✔ Student class with attributes:
- Name
- Age
- Grade
- Student ID
- Contact Information

✔ Data Validation:
- Age must be a positive number
- Grade must be within valid range
- Student ID must be unique

✔ Menu-driven Interface using Scanner

✔ Operations:
- Add new student
- View all students
- Search student by ID
- Update student details
- Delete student record

✔ Formatted console output

✔ Exception handling for invalid inputs

## Technologies Used

- Java
- OOP Concepts (Encapsulation, Classes, Objects)
- ArrayList
- Scanner Class
- Exception Handling

##  Project Structure
StudentManagementSystem/
│
├── src/
│   ├── Student.java
│   ├── StudentManager.java
│   ├── ValidationUtils.java
│   └── StudentInformationSystem.java
│
├── README.md

##  Class Description

### 1️ Student.java
Represents the Student entity with attributes:
- name
- age
- grade
- studentId
- contact

Includes:
- Constructors
- Getters & Setters
- toString() method

---

### 2️ StudentManager.java
Handles:
- Adding students
- Updating students
- Deleting students
- Searching students
- Displaying all students

Uses ArrayList to store student records.

---

### 3️ ValidationUtils.java
Contains methods for:
- Validating age
- Validating grade
- Checking valid input formats

---

### 4️ StudentInformationSystem.java
Main class containing:
- Menu-driven interface
- Scanner input
- Application execution logic

---

##  How to Run the Project

1. Clone the repository
2. Open in Eclipse or IntelliJ IDEA
3. Navigate to:
   
   StudentInformationSystem.java
   
4. Run the program
5. Use menu options to manage student records

---

##  Sample Menu Output


===== Student Information System =====
1. Add Student
2. View Students
3. Search Student
4. Update Student
5. Delete Student
6. Exit
Enter your choice:
