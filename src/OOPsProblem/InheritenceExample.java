package OOPsProblem;

public class InheritenceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}

class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    private final Engine engine;
    public Car() {
        engine = new Engine(); // Car has an Engine
    }
    public void startCar() {
        engine.start(); // Using the Engine's start method
        System.out.println("Car started");
    }
}
/*
Types of Inheritance Relationships

Single Inheritance: A class inherits from one superclass.
Multilevel Inheritance: A class inherits from a superclass, which itself is a subclass of another class.
Hierarchical Inheritance: Multiple classes inherit from a single superclass.
Multiple Inheritance (via interfaces): A class implements multiple interfaces.
Hybrid Inheritance: A combination of two or more types of inheritance.

Example of Has-A Relationship
Has-A Relationship (Composition):
Concept: Has-A relationship is established when a class contains a reference to another class as an instance variable. This is also known as composition.
 */