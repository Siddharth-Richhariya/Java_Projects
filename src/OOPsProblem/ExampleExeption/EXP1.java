package OOPsProblem.ExampleExeption;

public class EXP1 {
    public static void main(String[] args) throws Exception {
        try {
            String a = args[0]; //ArrayIndexOutOfBoundsException
            int b = 10 / 0; // ArithmeticException
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        String a = null;
        if (a.equals(null)){
            throw new Exception("InvalidComparison");
        }


    }

}
