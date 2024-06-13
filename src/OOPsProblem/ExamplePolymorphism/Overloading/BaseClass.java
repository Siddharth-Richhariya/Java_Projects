package OOPsProblem.ExamplePolymorphism.Overloading;

public class BaseClass {

    public static void record(){
        System.out.println("No Input");
    }
    public static void record(String student){
        System.out.println(student);
    }
    public static void record(int rollNo, String student){
        System.out.println("Roll No . - "+rollNo+", Name - "+student);
    }
    public static void record(int rollNo, String student,char Grade){
        System.out.println("Roll No . - "+rollNo+", Name - "+student+", Grade - "+Grade);
    }
    public static void record(int rollNo, String student,char Grade,  float Attendance){
        System.out.println("Roll No . - "+rollNo+", Name - "+student+", Grade - "+Grade+", Attendance - "+Attendance+"%");
    }

}
