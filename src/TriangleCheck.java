public class TriangleCheck {
    public static void triangle(int a, int b, int c){
        if(a + b + c ==180){
            System.out.println("Its a Triangle");
        }
        else{
            System.out.println("not a Triangle");
        }
    }

    public static void main(String[] args) {
        triangle(30,60,90);
    }
}
