[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

Hotel Booking System

## Problem Statement (max 150 words)

Managing hotel reservations manually can lead to errors, inefficiency, and difficulty in tracking bookings. Hotels require a system that can efficiently manage room availability, customer details, and reservations. The Hotel Booking System is a Java-based application designed to automate the booking process. It allows users to view available rooms, make reservations, and manage booking records. The system reduces manual workload, improves accuracy, and ensures better organization of data. It also helps hotel staff handle customer requests quickly and maintain proper booking history.

## Target User

Hotel Customers (for booking rooms)
Hotel Staff / Admin (for managing bookings and rooms)

## Core Features

- View available rooms
- Book and cancel reservations
- Store and manage customer details
-Display booking records

---

## OOP Concepts Used

- Abstraction:Abstract class User is used to define common properties and methods for users.
- Inheritance:Classes like Customer and Admin inherit from the User class.
- Polymorphism:Method overriding is used in subclasses to define specific behaviors.
- Exception Handling:Handles invalid inputs and booking errors using try-catch blocks.
- Collections / Threads:ArrayList is used to store room and booking data dynamically.



## Proposed Architecture Description

The system follows a modular object-oriented design. It consists of multiple classes such as User, Customer, Room, and Booking. The User class serves as a base class, while Customer extends it. The Room class manages room details, and the Booking class handles reservation logic. Data is stored using collections like ArrayList. The main class controls program execution and user interaction through a menu-driven interface.

## How to Run

1.Open the project in VS Code or any Java IDE.
2.Ensure Java (JDK) is installed.
3.Compile all .java files:
javac *.java
4.Run the main class:
java Main
5.Follow the menu options to interact with the system.

## Git Discipline Notes
 10 meaningful commits required.

-Minimum 10 meaningful commits will be maintained.
-Each commit will represent a specific feature or improvement (e.g., "Added Room Class", "Implemented Booking Logic", "Fixed Input Handling").
-Proper commit messages will be used for clarity and version tracking.
