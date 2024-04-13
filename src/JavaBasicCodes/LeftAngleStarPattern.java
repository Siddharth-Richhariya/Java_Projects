package JavaBasicCodes;

public class LeftAngleStarPattern {
    public static void main(String[] args) {
        int num = 7;
        for (int i = num; i >=1 ; i--){
            for (int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
