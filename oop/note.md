# Object-Oriented Programming in Java
- Java: mostly used for enterprise-level and Android software development
- The basic entities in object-oriented programming are classes and objects.
- Divide a complex program into a bunch of objects talking to each other.
- The use of classes makes it easier to maintain the different parts of an application since it's easier to make changes in classes.
## Anatomy of Objects and Classes
- Objects have state and behavior --> "where do these objects come from?"
- A `Class` can be thought of as a blueprint for creating objects.
- The state of the objects is generally modeled using variables in class and the behavior is modeled by implementing the methods.

### Fields
- A static field resides in a class. All the objects will share this field and its value
- Non-static fields are located in the instances of the class. Each instance of the class can have its own values for these fields.
- A final field can't have its value changed once it's assigned.

### Methods
- A method is a group of statements that performs some operation and may or may not return a result.
- Overloading refers to making a method perform different operations based on the nature of its arguments.
  - Makes code cleaner and readable
  - Allows the implementation of polymorphism

### Constructors
- A constructor's name must be exactly the same as the name of its class
- The `this` reference variable exists for every class. It refers to the class object itself.
- The `this` keyword followed by parentheses means that another constructor in the same Java class is being called.