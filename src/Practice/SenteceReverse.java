package Practice;

public class SenteceReverse {
    public static void main(String[] args) throws Exception {
        String a = "I Love my India";
        String[] b = a.split(" ");
        String rev ="";
        for(int i = b.length; i >=0; i--){
            try{
                rev += b[i];
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception Catched");
            }
            finally {
                System.out.println("Pata nahi");
            }

            if(i!= 0){
                rev+= " ";
            }
        }
        System.out.println(rev);
    }
}
