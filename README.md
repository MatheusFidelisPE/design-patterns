# Design Patterns in Java

## 📖 Introduction
Design patterns are well-established solutions to common software design problems. They encapsulate best practices and provide a structured approach to building robust, maintainable, and scalable systems. This project demonstrates the implementation of several design patterns in **Java**, showcasing their practical use and benefits.

---

## ✨ Why Design Patterns Matter
1. **Reusability**: Simplify development by reusing solutions that have been tried and tested.
2. **Maintainability**: Make the codebase easier to read, understand, and modify.
3. **Scalability**: Facilitate the addition of new features without major refactoring.
4. **Collaboration**: Establish a shared design language across teams.

---

## 🛠️ Patterns Implemented

### 1. **Creational Patterns**
Creational patterns focus on the process of object creation.

- **Abstract Factory**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Builder**: Separates the construction of a complex object from its representation, enabling the same construction process to create different representations.
- ~~Prototype~~: Create new objects by copying existing ones.
- ~~Singleton~~: Ensure a class has only one instance and provides a global access point to it.
- ~~Factory Method~~: Define an interface for creating an object but allow subclasses to alter the type of objects that will be created.

### 2. **Structural Patterns**
Structural patterns focus on object composition and define relationships between entities.

- **Decorator**: Dynamically add responsibilities to objects without modifying their structure.
- ~~Adapter~~: Bridge the gap between incompatible interfaces, allowing them to work together.
- ~~Composite~~: Compose objects into tree structures to represent part-whole hierarchies.
- ~~Proxy~~: Provide a surrogate or placeholder for another object to control access to it.
- ~~Bridge~~: Decouple an abstraction from its implementation so that the two can vary independently.
- ~~Flyweight~~: Use sharing to support large numbers of fine-grained objects efficiently.
- ~~Facade~~: Provide a simplified interface to a larger body of code, such as a library or framework.

### 3. **Behavioral Patterns**
Behavioral patterns focus on the interaction and responsibility between objects.

- **State**: Allow an object to alter its behavior when its internal state changes.
- ~~Observer~~: Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified.
- ~~Strategy~~: Define a family of algorithms, encapsulate each one, and make them interchangeable.
- ~~Command~~: Encapsulate a request as an object, enabling parameterization of clients with different requests.
- ~~Chain of Responsibility~~: Pass a request along a chain of handlers, where each handler decides to process it or pass it to the next handler.
- ~~Template Method~~: Define the skeleton of an algorithm in an operation, deferring some steps to subclasses.
- ~~Interpreter~~: Given a language, define a representation for its grammar and provide a way to interpret sentences in the language.
- ~~Iterator~~: Provide a way to access elements of an aggregate object sequentially without exposing its underlying representation.
- ~~Mediator~~: Define an object that encapsulates how a set of objects interact.
- ~~Memento~~: Capture and externalize an object's state without violating encapsulation so it can be restored later.
- ~~Visitor~~: Represent an operation to be performed on elements of an object structure, allowing new operations to be defined without changing the classes of the elements.

---

## 🚀 How to Use This Repository
1. Clone the repository:
   ```bash
   git clone git@github.com:MatheusFidelisPE/design-patterns.git
