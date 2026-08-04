# 🎨 Java Design Patterns

> A beginner-friendly guide to the **23 Gang of Four (GoF) Design Patterns** in Java. This repository explains each design pattern with its definition, advantages, disadvantages, and common use cases to help understand when and why to use them.

---

# 📚 Table of Contents

- [🏠 Introduction](#-java-design-patterns)

## 🏗️ Creational Design Patterns
- [Singleton Pattern](#1️⃣-singleton-pattern)
- [Factory Method Pattern](#2️⃣-factory-method-pattern)
- [Abstract Factory Pattern](#3️⃣-abstract-factory-pattern)
- [Builder Pattern](#4️⃣-builder-pattern)
- [Prototype Pattern](#5️⃣-prototype-pattern)

## 🧩 Structural Design Patterns
- [Adapter Pattern](#6️⃣-adapter-pattern)
- [Bridge Pattern](#7️⃣-bridge-pattern)
- [Composite Pattern](#8️⃣-composite-pattern)
- [Decorator Pattern](#9️⃣-decorator-pattern)
- [Facade Pattern](#-facade-pattern)
- [Flyweight Pattern](#1️⃣1️⃣-flyweight-pattern)
- [Proxy Pattern](#1️⃣2️⃣-proxy-pattern)

## 🤝 Behavioral Design Patterns
- [Chain of Responsibility Pattern](#1️⃣3️⃣-chain-of-responsibility-pattern)
- [Command Pattern](#1️⃣4️⃣-command-pattern)
- [Interpreter Pattern](#1️⃣5️⃣-interpreter-pattern)
- [Iterator Pattern](#1️⃣6️⃣-iterator-pattern)
- [Mediator Pattern](#1️⃣7️⃣-mediator-pattern)
- [Memento Pattern](#1️⃣8️⃣-memento-pattern)
- [Observer Pattern](#1️⃣9️⃣-observer-pattern)
- [State Pattern](#2️⃣0️⃣-state-pattern)
- [Strategy Pattern](#2️⃣1️⃣-strategy-pattern)
- [Template Method Pattern](#2️⃣2️⃣-template-method-pattern)
- [Visitor Pattern](#2️⃣3️⃣-visitor-pattern)

## 📖 Summary
- [🎯 Conclusion](#-conclusion)

---

# 🏗️ Creational Design Patterns

Creational Design Patterns focus on **how objects are created**. They help make object creation more flexible, efficient, and reusable while reducing unnecessary object instantiation.

---

# 1️⃣ Singleton Pattern

## 📖 Definition

The **Singleton Pattern** ensures that a class has **only one instance** throughout the application and provides a global point of access to that instance. It prevents multiple objects from being created and is useful for managing shared resources.

### ✅ Advantages

- Saves memory by creating only one object.
- Ensures consistent access to shared resources.
- Provides a centralized access point.
- Easy to implement for shared services.

### ❌ Disadvantages

- Makes unit testing more difficult.
- Can introduce global state.
- Requires thread-safe implementation in multi-threaded applications.

### 🎯 Use Cases

- Application configuration
- Logging service
- Cache manager
- Thread pool manager
- Printer spooler

---

# 2️⃣ Factory Method Pattern

## 📖 Definition

The **Factory Method Pattern** provides an interface for creating objects without exposing the object creation logic to the client. Instead of using the `new` keyword directly, object creation is delegated to a factory method.

### ✅ Advantages

- Reduces tight coupling.
- Hides object creation logic.
- Makes code easier to extend.
- Supports the Open/Closed Principle.

### ❌ Disadvantages

- Introduces additional classes.
- Can increase code complexity.
- Not suitable for very small projects.

### 🎯 Use Cases

- Creating different types of notifications.
- Payment gateway selection.
- Database driver creation.
- Document generation.

---

# 3️⃣ Abstract Factory Pattern

## 📖 Definition

The **Abstract Factory Pattern** provides an interface for creating families of related objects without specifying their concrete classes. It ensures that compatible objects are created together.

### ✅ Advantages

- Maintains consistency between related objects.
- Easy to switch between object families.
- Encourages loose coupling.
- Supports scalability.

### ❌ Disadvantages

- Adds extra abstraction.
- Difficult to modify existing product families.
- More classes are required.

### 🎯 Use Cases

- Cross-platform UI components.
- Theme-based applications.
- Database provider families.
- Cloud provider implementations.

---

# 4️⃣ Builder Pattern

## 📖 Definition

The **Builder Pattern** constructs complex objects step by step instead of using large constructors. It improves readability and makes object creation easier when many optional fields are involved.

### ✅ Advantages

- Improves code readability.
- Avoids large constructors.
- Supports immutable objects.
- Easy to add optional parameters.

### ❌ Disadvantages

- Requires additional builder classes.
- Slightly increases code size.
- Unnecessary for simple objects.

### 🎯 Use Cases

- User registration objects.
- REST API request objects.
- Configuration objects.
- Complex DTO creation.

---

# 5️⃣ Prototype Pattern

## 📖 Definition

The **Prototype Pattern** creates new objects by copying an existing object instead of creating them from scratch. It is useful when object creation is expensive or time-consuming.

### ✅ Advantages

- Improves performance.
- Reduces object creation cost.
- Simplifies object duplication.
- Supports dynamic object creation.

### ❌ Disadvantages

- Cloning complex objects can be difficult.
- Deep copying requires extra effort.
- Managing cloned objects may become complex.

### 🎯 Use Cases

- Game development.
- Graphic editors.
- Document templates.
- Object caching.

---

# 🧩 Structural Design Patterns

Structural Design Patterns focus on **how classes and objects are organized** to build larger and more flexible systems.

---

# 6️⃣ Adapter Pattern

## 📖 Definition

The **Adapter Pattern** allows two incompatible interfaces to work together by acting as a bridge between them. It converts one interface into another that the client expects.

### ✅ Advantages

- Reuses existing classes.
- Improves compatibility.
- Reduces code duplication.
- Promotes flexibility.

### ❌ Disadvantages

- Adds an extra layer of abstraction.
- Can increase code complexity.

### 🎯 Use Cases

- Legacy system integration.
- Third-party API integration.
- Payment gateway adapters.
- Data format conversion.

---

# 7️⃣ Bridge Pattern

## 📖 Definition

The **Bridge Pattern** separates abstraction from implementation so that both can evolve independently. It reduces dependency between abstraction and implementation.

### ✅ Advantages

- Improves flexibility.
- Promotes loose coupling.
- Easier maintenance.
- Supports independent extensions.

### ❌ Disadvantages

- More classes are required.
- Can make simple designs unnecessarily complex.

### 🎯 Use Cases

- Remote controls and devices.
- Cross-platform applications.
- Payment processing systems.
- Graphics rendering.

---

# 8️⃣ Composite Pattern

## 📖 Definition

The **Composite Pattern** allows individual objects and groups of objects to be treated uniformly. It is commonly used to represent tree-like hierarchical structures.

### ✅ Advantages

- Simplifies hierarchical structures.
- Easy to add new components.
- Uniform treatment of objects.
- Improves code reuse.

### ❌ Disadvantages

- Can make the design overly generic.
- Harder to restrict component types.

### 🎯 Use Cases

- File systems.
- Organization hierarchy.
- Menu structures.
- HTML/XML document trees.

---
# 🎨 Decorator Pattern

## 📖 Definition

The **Decorator Pattern** allows you to dynamically add new functionality to an object without modifying its existing code. Instead of changing the original class, additional behavior is wrapped around the object at runtime.

### ✅ Advantages

- Adds functionality without modifying existing code.
- Follows the Open/Closed Principle.
- More flexible than inheritance.
- Multiple decorators can be combined.

### ❌ Disadvantages

- Increases the number of classes.
- Can make the code difficult to understand if overused.

### 🎯 Use Cases

- Java I/O Streams
- Adding logging or security
- Notification systems
- Text formatting

---

# 🚪 Facade Pattern

## 📖 Definition

The **Facade Pattern** provides a simplified interface to a complex system. Instead of interacting with multiple classes, the client communicates with a single facade class that handles all internal operations.

### ✅ Advantages

- Simplifies complex systems.
- Reduces dependencies between client and subsystem.
- Improves code readability.
- Makes maintenance easier.

### ❌ Disadvantages

- Facade can become a large class.
- May hide useful subsystem features.

### 🎯 Use Cases

- Banking systems
- Hotel booking systems
- E-commerce checkout
- Spring service layer

---

# 🪶 Flyweight Pattern

## 📖 Definition

The **Flyweight Pattern** reduces memory usage by sharing common objects instead of creating duplicate instances. It is useful when an application needs a large number of similar objects.

### ✅ Advantages

- Saves memory.
- Improves application performance.
- Reduces object creation.
- Efficient for large datasets.

### ❌ Disadvantages

- Increases implementation complexity.
- Shared objects must remain immutable.

### 🎯 Use Cases

- Text editors
- Game development
- Icons and images
- Character rendering

---

# 🛡️ Proxy Pattern

## 📖 Definition

The **Proxy Pattern** provides a placeholder or substitute for another object to control access to it. The proxy performs additional operations such as security, logging, caching, or lazy loading before forwarding the request.

### ✅ Advantages

- Controls object access.
- Supports lazy initialization.
- Improves security.
- Adds caching and logging.

### ❌ Disadvantages

- Introduces extra classes.
- Slightly increases response time.

### 🎯 Use Cases

- Spring AOP
- Hibernate Lazy Loading
- Security checks
- Remote service access

---

# 🤝 Behavioral Design Patterns

Behavioral Design Patterns focus on **how objects communicate and collaborate** with each other. They help improve flexibility by defining clear interaction between objects.

---

# ⛓️ Chain of Responsibility Pattern

## 📖 Definition

The **Chain of Responsibility Pattern** passes a request through a chain of handlers until one of them processes it. Each handler decides whether to handle the request or forward it to the next handler.

### ✅ Advantages

- Reduces coupling between sender and receiver.
- Easy to add new handlers.
- Improves flexibility.
- Supports dynamic request processing.

### ❌ Disadvantages

- Requests may go unhandled.
- Debugging long chains can be difficult.

### 🎯 Use Cases

- Authentication
- Authorization
- Logging filters
- Exception handling

---

# 🎮 Command Pattern

## 📖 Definition

The **Command Pattern** converts a request into an object, allowing requests to be stored, queued, executed, or undone independently of the object that performs the action.

### ✅ Advantages

- Decouples sender from receiver.
- Supports undo and redo operations.
- Easy to add new commands.
- Improves flexibility.

### ❌ Disadvantages

- Creates additional command classes.
- Can increase project complexity.

### 🎯 Use Cases

- Remote controls
- Menu actions
- Task scheduling
- Undo/Redo functionality

---

# 📝 Interpreter Pattern

## 📖 Definition

The **Interpreter Pattern** defines a grammar for a language and provides an interpreter to evaluate expressions based on that grammar. It is mainly used for parsing and interpreting structured input.

### ✅ Advantages

- Easy to extend grammar.
- Simplifies expression evaluation.
- Good for simple languages.

### ❌ Disadvantages

- Not suitable for complex grammars.
- Performance decreases with large expressions.

### 🎯 Use Cases

- SQL parsing
- Mathematical expressions
- Rule engines
- Formula evaluation

---

# 🔄 Iterator Pattern

## 📖 Definition

The **Iterator Pattern** provides a way to access elements of a collection sequentially without exposing its internal structure. It separates traversal logic from the collection itself.

### ✅ Advantages

- Simplifies collection traversal.
- Hides internal implementation.
- Supports multiple traversal methods.
- Improves code readability.

### ❌ Disadvantages

- Adds extra iterator objects.
- Slight overhead for simple collections.

### 🎯 Use Cases

- Java Collections Framework
- List traversal
- Tree traversal
- Graph traversal

---
# 🤝 Mediator Pattern

## 📖 Definition

The **Mediator Pattern** defines a central object that manages communication between multiple objects. Instead of objects communicating directly with each other, they interact through the mediator, reducing dependencies and improving maintainability.

### ✅ Advantages

- Reduces coupling between objects.
- Simplifies communication.
- Makes the system easier to maintain.
- Centralizes interaction logic.

### ❌ Disadvantages

- Mediator can become overly complex.
- May become a single point of failure.

### 🎯 Use Cases

- Chat applications
- Air traffic control systems
- Online meeting platforms
- GUI components

---

# 💾 Memento Pattern

## 📖 Definition

The **Memento Pattern** captures and stores an object's state so it can be restored later without exposing its internal details. It is commonly used to implement undo and rollback functionality.

### ✅ Advantages

- Supports undo and rollback operations.
- Preserves object encapsulation.
- Simplifies state restoration.
- Improves user experience.

### ❌ Disadvantages

- Can consume significant memory.
- Managing many snapshots can become difficult.

### 🎯 Use Cases

- Text editors
- Game save points
- Version control systems
- Transaction rollback

---

# 📢 Observer Pattern

## 📖 Definition

The **Observer Pattern** establishes a one-to-many relationship between objects. When one object changes its state, all subscribed objects are automatically notified and updated.

### ✅ Advantages

- Promotes loose coupling.
- Automatically notifies dependent objects.
- Easy to add or remove subscribers.
- Supports event-driven programming.

### ❌ Disadvantages

- Too many observers can affect performance.
- Debugging notifications can be difficult.

### 🎯 Use Cases

- Event notification systems
- Stock market updates
- Email subscriptions
- Social media notifications

---

# 🔄 State Pattern

## 📖 Definition

The **State Pattern** allows an object to change its behavior when its internal state changes. Instead of using multiple conditional statements, different states are represented as separate classes.

### ✅ Advantages

- Eliminates large if-else or switch statements.
- Improves code readability.
- Makes adding new states easier.
- Follows the Open/Closed Principle.

### ❌ Disadvantages

- Increases the number of classes.
- Can be unnecessary for simple state changes.

### 🎯 Use Cases

- ATM machines
- Traffic light systems
- Media players
- Order processing systems

---

# 🎯 Strategy Pattern

## 📖 Definition

The **Strategy Pattern** defines a family of algorithms, encapsulates each one separately, and allows them to be selected at runtime. This makes it easy to switch between different implementations without modifying the client code.

### ✅ Advantages

- Eliminates complex conditional logic.
- Easy to add new algorithms.
- Promotes code reusability.
- Supports the Open/Closed Principle.

### ❌ Disadvantages

- Increases the number of classes.
- Clients must know which strategy to use.

### 🎯 Use Cases

- Payment methods
- Sorting algorithms
- Data compression
- Authentication mechanisms

---

# 📋 Template Method Pattern

## 📖 Definition

The **Template Method Pattern** defines the overall structure of an algorithm in a base class while allowing subclasses to implement or customize specific steps without changing the algorithm's flow.

### ✅ Advantages

- Encourages code reuse.
- Reduces duplication.
- Ensures consistent workflow.
- Easy to customize individual steps.

### ❌ Disadvantages

- Limited flexibility due to inheritance.
- Changes to the template may affect subclasses.

### 🎯 Use Cases

- Report generation
- Data processing
- File parsing
- Workflow management

---

# 👤 Visitor Pattern

## 📖 Definition

The **Visitor Pattern** separates operations from the objects they operate on. It allows new operations to be added without modifying the existing object structure, making it useful when operations change more frequently than the objects themselves.

### ✅ Advantages

- Easy to add new operations.
- Keeps object classes focused on their core responsibilities.
- Improves maintainability.
- Supports the Open/Closed Principle.

### ❌ Disadvantages

- Adding new object types is difficult.
- Can increase code complexity.

### 🎯 Use Cases

- Compiler design
- Document processing
- File system operations
- Object structure traversal

---

# 🎯 Conclusion

Design Patterns are **proven software design solutions** that help developers solve recurring problems in a structured and maintainable way. They improve **code reusability, scalability, flexibility, and maintainability** while promoting object-oriented design principles.

### 🏗️ Creational Patterns
Focus on **how objects are created**.
- Singleton
- Factory Method
- Abstract Factory
- Builder
- Prototype

### 🧩 Structural Patterns
Focus on **how classes and objects are organized**.
- Adapter
- Bridge
- Composite
- Decorator
- Facade
- Flyweight
- Proxy

### 🤝 Behavioral Patterns
Focus on **how objects communicate and interact**.
- Chain of Responsibility
- Command
- Interpreter
- Iterator
- Mediator
- Memento
- Observer
- State
- Strategy
- Template Method
- Visitor

---

# 📖 Quick Reference

| Category | Purpose | Patterns |
|----------|---------|----------|
| 🏗️ Creational | Object Creation | Singleton, Factory Method, Abstract Factory, Builder, Prototype |
| 🧩 Structural | Class & Object Composition | Adapter, Bridge, Composite, Decorator, Facade, Flyweight, Proxy |
| 🤝 Behavioral | Object Communication | Chain of Responsibility, Command, Interpreter, Iterator, Mediator, Memento, Observer, State, Strategy, Template Method, Visitor |

---


**Happy Learning! 🚀**
