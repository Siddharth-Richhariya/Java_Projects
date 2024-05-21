package OOPsProblem;

public class Singleton {
    private static Singleton instance;
    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello, I am a singleton!");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();
    }
}
/*Singleton Class:

Concept: A singleton class restricts the instantiation of a class to a single object. This is useful when exactly one object is needed to coordinate actions across the system.
*/