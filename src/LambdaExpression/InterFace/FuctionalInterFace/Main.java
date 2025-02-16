package LambdaExpression.InterFace.FuctionalInterFace;

public class Main {
    public static void main(String[] args) {
        FunctionalInterFace fi = () -> {
            return 10;
        };
        System.out.println(fi.display());
    }
}
