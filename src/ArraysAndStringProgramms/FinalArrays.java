package ArraysAndStringProgramms;

public class FinalArrays {
    public static void main(String[] args) {
        final String [] car = new String[5];
        car[0]= "Nano";
        car[1]= "Volvo";
        car[2]= "Civic";
        car[3]= "City";
        car[4]= "Thar";
        for (String s : car) {
            System.out.println(s);
        }
        car[1] = "Aventador";
        System.out.println("After Updated: ");
        for (String s: car){
            System.out.println(s);
        }
        //car = new String[6];
        //Size can't be changed but value could be after using with Final keyword with array
    }
}
