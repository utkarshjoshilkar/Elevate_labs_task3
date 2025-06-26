# Library Management System

A simple console-based Library Management System implemented in Java that allows users to manage books in a library through basic CRUD operations.

## Features

- **Add Books**: Add new books to the library collection
- **View All Books**: Display all books with their current status
- **Issue Books**: Issue available books to users
- **Return Books**: Return previously issued books
- **User Management**: Basic user information handling
- **Book Status Tracking**: Track whether books are issued or available

## Project Structure

```
src/
└── com/elevateLabs/
    ├── Book.java          # Book entity class
    ├── Library.java       # Library management operations  
    ├── Person.java        # Abstract person class
    ├── User.java          # User implementation extending Person
    └── main.java          # Main application entry point
```

## Classes Overview

### Book
- Represents a book entity with title, author, and issue status
- Methods: `issue()`, `returnBook()`, getters and setters

### Library
- Manages the collection of books
- Operations: `addBook()`, `showAllBooks()`, `issueBook()`, `returnBook()`

### Person (Abstract)
- Base class for user entities
- Contains common properties like name

### User
- Extends Person class
- Represents a library user with ID and name

### main
- Entry point of the application
- Handles user interaction through console menu

## How to Run

1. **Prerequisites**: Java Development Kit (JDK) 8 or higher

2. **Compile the program**:
   ```bash
   javac -d bin src/com/elevateLabs/*.java
   ```

3. **Run the application**:
   ```bash
   java -cp bin com.elevateLabs.main
   ```

## Usage

1. **Start the application** and enter your name and ID
2. **Choose from the menu options**:
   - `1`: Add a new book to the library
   - `2`: View all books in the library
   - `3`: Issue a book (if available)
   - `4`: Return a previously issued book
   - `5`: Exit the system

## Example Interaction

```
Enter your name: John Doe
Enter your ID: 123

Welcome to the Library, John Doe!
User: John Doe [id=123]

Menu
1. Add book
2. Show all books
3. Issue book
4. Return book
5. Exit

Enter your choice: 1
Enter Book title: The Great Gatsby
Enter Author name: F. Scott Fitzgerald
Added: The Great Gatsby
```

## Key Features

- **Case-insensitive book search**: Book titles are matched regardless of case
- **Duplicate issue prevention**: Cannot issue an already issued book
- **Return validation**: Cannot return a book that wasn't issued
- **Empty library handling**: Appropriate messages when no books are available

## Technical Details

- **Language**: Java
- **Architecture**: Object-Oriented Programming with inheritance and abstraction
- **Data Structure**: ArrayList for book storage
- **Input Handling**: Scanner for console input
- **Package**: `com.elevateLabs`

## Future Enhancements

- Add book search functionality
- Implement user-specific book tracking
- Add book categories and filtering
- Persist data to files or database
- Add due date tracking for issued books
- Implement user authentication
---
