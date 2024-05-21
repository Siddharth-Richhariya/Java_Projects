package OOPsProblem;

public class OverloadExample {
    public void display(int a) {
        System.out.println("Argument: " + a);
    }

    public void display(int a, int b) {
        System.out.println("Arguments: " + a + " and " + b);
    }

    public void display(String a) {
        System.out.println("Argument: " + a);
    }

    public static void main(String[] args) {
        OverloadExample obj = new OverloadExample();
        obj.display(10);
        obj.display(10, 20);
        obj.display("Hello");
    }
}
/*Method Overloading:

Concept: Method overloading in Java occurs when two or more methods in the same class have the same name but different parameters (different type, number, or both).*/