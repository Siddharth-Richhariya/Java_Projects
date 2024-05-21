package OOPsProblem;

public class OverrideExample {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
/*
Method Overriding:

Concept: Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.
 */