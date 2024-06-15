package OOPsProblem.ExampleStaticKeyword;

public class innerClass {
    static class innXclass{
        static class innYclass{
            void display(){
                System.out.println("This is inner class example");
            }
            static void displayMess(){
                System.out.println("This Is inner class Static method");
            }
        }
    }
}
