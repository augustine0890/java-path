# Object Oriented Programming
- Type of computer programming based on the premise that all programs are essentially computer-based simulations of real-world or abstract concepts.
- A class is code that defines the behavior of a Java programming element called an object.
## Objects
- Both in the real world and in the world of programming: are entities that have certain basic characteristics (identity, type, state, and behavior).
- Every occurrence of a particular type of object -- called an _instance_. Every object in an object-oriented program has an _identity_.
- Have type, state, behavior.
## Life Cycle of an Object
1. A class is loaded the first time you create an object from the class or the first time you access a static field or method of the class.
2. An object is created from a class when you use the `new` keyword. The constructor is like a method but is called only once, when the object is created.
   - The constructor is responsible for doing any processing required to initialize the object
3. The object lives its life, providing access to its public methods and fields to whoever wants and needs them.
4. When it's time for the object to die, the object is removed from memory. A special part of the Java runtime called the _garbage collector_ takes care of destroying all objects when they are no longer in scope.
## Inheritance
- The technique that lets you use one class as the basis for another.
- The existing class is called the _base class_, _superclass_, or _parent class_. The new class that's derived from it is called the _derived class_, _subclass_, or _child class_.
- The subclass is automatically given all the visible methods and fields of its superclass.
## Interfaces
- An interface is a set of methods and fields that a class must provide to implement the interface (just a set of method and field signatures).
- The interface itself is simply a set of public method and field declarations that are given a name.
- A class can have only one base class, but a class can implement as many interface as necessary.
## Designing a Program with Objects
- One common way to design object-oriented applications is to divide the application into several distinct _layers_ or _tiers_ that provide distinct types of functions.
### Three-Layered Approach
- __Presentation__: The objects in the layer handle all the direct interaction with users.
- __Logic__: The object in this layer represent the core objects of the application. For a typical business-type application, this layer includes objects that represent business entities such as customer, products, orders, suppliers, and the like.
- __Database__: The objects in this layer handle all the details of interacting with whatever form of data storage is used by the application.