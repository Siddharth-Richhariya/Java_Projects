package Generics;

public class GenericsClass {
    public static void main(String[] args) {
        Test T1 = new Test("Sid");
        System.out.println(T1.getObj());

        Test T2 = new Test(12344);
        System.out.println(T2.getObj());
    }
}
class Test<T>{
    T obj;
    Test (T obj){
        this.obj = obj;
    }

    public T getObj() {
        return this.obj;
    }
}