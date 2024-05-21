package JavaBasicCodes;

public class FibonacciSeries {
    public static void main(String[] args) {
        FSeries(8);
    }
    static void FSeries(int num){
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i =1; i <= num; i++){
            System.out.print(a+ ", ");
            a = b;
            b = c;
            c = a +b;

        }
    }
}
