# Observer Design Pattern in Java

This repository provides a clear and practical implementation of the **Observer Design Pattern** in Java. This pattern is essential for building loosely coupled systems where objects can react to state changes in other objects without being directly dependent on them.

[![Java](https://img.shields.io/badge/Language-Java-blue.svg?style=for-the-badge&logo=java)](https://www.java.com)
[![Pattern](https://img.shields.io/badge/Pattern-Behavioral-orange.svg?style=for-the-badge)]()

---

## 🎯 What is the Observer Pattern?

The Observer pattern defines a one-to-many dependency between objects. When one object (the **Subject**) changes its state, all its dependents (the **Observers**) are notified and updated automatically. This allows for a dynamic relationship where observers can be added or removed at runtime.

### The Problem It Solves

Imagine you have an object whose state is important to other objects. When that state changes, you would need to manually find and update all the dependent objects. This creates tight coupling, making the code hard to maintain, extend, and reuse. The Subject would need explicit knowledge of its dependents.

### The Solution

The Observer pattern solves this by creating a subscription mechanism.

1.  **Subject (Observable):** An object that maintains a list of its dependents (observers) and provides an interface to attach and detach observers.
2.  **Observer:** An object that wishes to be notified of the subject's state changes. It provides an `update()` method that the subject calls.

When the Subject's state changes, it iterates through its list of observers and calls their `update()` method, passing along the new state.

---

## 📂 Project Structure

This project simulates a classic example: a **Weather Station** (the Subject) that notifies various **Display Clients** (the Observers) when weather conditions change.

```
src
├── Subject.java            // The interface for the subject (observable).
├── Observer.java           // The interface for all observers.
├── WeatherStation.java     // The ConcreteSubject that tracks weather data.
├── PhoneDisplay.java       // A ConcreteObserver that displays data on a phone.
├── WebDisplay.java         // A ConcreteObserver that displays data on a web dashboard.
└── Main.java               // The client code to demonstrate the pattern.
```

### Key Components

- `Subject.java`: Defines the contract for attaching (`registerObserver`), detaching (`removeObserver`), and notifying (`notifyObservers`) observers.
- `Observer.java`: Defines the `update(temperature, humidity, pressure)` method that all observers must implement.
- `WeatherStation.java`: Implements `Subject`. It holds the weather data and a list of `Observer` objects. When its `setMeasurements()` method is called, it notifies all registered observers.
- `PhoneDisplay.java` & `WebDisplay.java`: Implement `Observer`. They register with the `WeatherStation` and display the updated weather data whenever their `update()` method is called.
- `Main.java`: Creates instances of the `WeatherStation` and the display observers, registers them, and simulates a weather change to trigger the notification process.

---

## 🚀 How to Run

You can compile and run this project from your terminal.

1.  **Clone the repository (if it's on GitHub):**

    ```bash
    git clone https://github.com/nouran-Omar/Observer-Pattern.git
    cd Observer-Pattern
    ```

2.  **Navigate to the source directory:**

    ```bash
    cd src
    ```

3.  **Compile all Java files:**

    ```bash
    javac *.java
    ```

4.  **Run the `Main` class to see the output:**
    ```bash
    java Main
    ```

### Expected Output

You will see console output demonstrating that both the `PhoneDisplay` and `WebDisplay` receive and print the new weather data after the `WeatherStation`'s state is updated.

```
Phone Display: New weather data -> Temperature: 25.5°C, Humidity: 65.0%
Web Display: Updating dashboard with new data -> Temp: 25.5 | Humidity: 65.0 | Pressure: 1012.5
--- Weather has changed again! ---
Phone Display: New weather data -> Temperature: 28.0°C, Humidity: 60.0%
Web Display: Updating dashboard with new data -> Temp: 28.0 | Humidity: 60.0 | Pressure: 1010.0
```
