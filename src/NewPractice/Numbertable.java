package NewPractice;

public class Numbertable {
   public static void tablePrint(int x){
       for(byte i = 1; i <= 10; i++){
           System.out.println(x+" * "+ i+ " = "+ (x*i));
       }
   }
   public static void main (String[] args){
        tablePrint(5);
   }
}
