package NewPractice;

public class GreaterValue {
    public static Boolean greaterValues(int a, int b, int c, int d){
        if(a+b> c+d){
            return true;
        } else if (a+b== c+d) {
            System.out.println("They Are Equals");
            return null;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        System.out.println(greaterValues(22,20,22,20));
    }
}
