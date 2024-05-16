package OOPsProblem;

import java.util.*;

public class AgeDefineUsingConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the upcoming Test Numbers: ");
        int testNumbers = sc.nextInt();
        System.out.println("Enter the Age : ");
        int age = sc.nextInt();
        Person person = new Person(age);

        for(int i = 0; i < testNumbers; i++){
            person.amIOld();
            person.yearPasses();
        }
        sc.close();
    }
}
class Person {
    private int age;
    public Person(int initialAge){
        if (initialAge < 0){
            this.age = 0;
            System.out.println("Age is not valid, setting age to 0.");
        }
        else{
            this.age= initialAge;
        }
    }
    void yearPasses(){
        this.age+=1;
    }
    void amIOld(){
        if(this.age <13){
            System.out.println("You are young.");
        }
        else if (this.age < 18){
            System.out.println("You are a teenager.");
        }
        else{
            System.out.println("You are old.");
        }
    }
}

