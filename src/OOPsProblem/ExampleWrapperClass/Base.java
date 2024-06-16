package OOPsProblem.ExampleWrapperClass;

public class Base {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a);
        System.out.println(b);
        String c = String.valueOf(a);
        System.out.println(c);
        int s = b;
        if (b.equals(c)){
            System.out.println("Both are same");
        }
        else {
            System.out.println("Not Same ");
        }
    }
}
