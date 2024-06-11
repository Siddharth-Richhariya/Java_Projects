package OOPsProblem.ExampleInheritance.MultiLevelInheritance;

public class Main {
    public static void main(String[] args) {
        child c1 = new child();
        c1.printInfo();
        c1.printInfo1();
        c1.printInfo2();
        System.out.println(c1.name);
        System.out.println(c1.name1);
        System.out.println(c1.name2);
    }
}
