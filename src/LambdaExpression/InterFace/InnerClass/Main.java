package LambdaExpression.InterFace.InnerClass;

public class Main {


    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass() {
            @Override
            public String sayHello() {
                return "Hello";
            }

            @Override
            public String sayBye() {
                return "Bye";
            }
        };
        System.out.println(innerClass.sayBye());
        System.out.println(innerClass.sayHello());
    }
}
