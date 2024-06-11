package OOPsProblem.ExampleInheritance.hierarchicalInheritance;

public class Main {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.print1();
        c1.print();
        System.out.println(c1.str);
        System.out.println(c1.name);
        System.out.println();

        Child2 c2 = new Child2();
        c2.print2();
        c2.print();
        System.out.println(c2.str);
        System.out.println(c2.name);
    }


}
