package OOPsProblem.ExamplePolymorphism.Overloading;

public class main extends BaseClass{
    public static void main(String[] args) {
        record();                                                           //No Input
        record("John");                                             //John
        record(01, "Alex");                                   //Roll No . - 1, Name - Alex
        record(02, "Bob", 'C');                         //Roll No . - 2, Name - Bob, Grade - C
        record(03, "Charlie",'A',92);         //Roll No . - 3, Name - Charlie, Grade - A, Attandance - 92.0%
    }
}
