package OOPsProblem.ExampleAnonymousClassUsing;

public class ObjectClass {
    public static void main(String[] args) {
        abstractClass.display();
    }
    abstractClass A1 = new abstractClass() {
        @Override
        void Display() {
            System.out.println("This is Extended Abstract Class, But showing As Object");
        }
        //abstractClass.display(); //Not Possible
    };
    InterFace I1 = new InterFace() {
        @Override
        public void Display() {
            System.out.println("This is Implemented InterFace, But showing As Object");
        }
        //I1.display();  // Not Possible
    };
}
