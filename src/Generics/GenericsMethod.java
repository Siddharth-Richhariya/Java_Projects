package Generics;

public class GenericsMethod {
    private static <T> void functionName(T i, T i2){
        System.out.println(i);
        System.out.println(i2);
    }

    public static void main(String[] args) {
        functionName(123, "Sid");
    }
}
