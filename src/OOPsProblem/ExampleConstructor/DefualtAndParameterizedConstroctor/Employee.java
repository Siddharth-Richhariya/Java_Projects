package OOPsProblem.ExampleConstructor.DefualtAndParameterizedConstroctor;

public class Employee {
    String name;
    String companyName;;
    int empID;
    double salary;
    String BU;
    String designation;


    Employee(String Name, int empID, String companyname,double salary, String BU, String Designation){
        this.name = Name;
        this.empID = empID;
        this.salary = salary;
        this.BU = BU;
        this.designation = Designation;
        this.companyName = companyname;

    }

    void printDetails ()
    {
        System.out.println("Employee name ->" +name);
        System.out.println("Employee ID ->" +empID);
        System.out.println("Employee Company Name ->" +companyName);
        System.out.println("Employee salary ->" +salary);
        System.out.println("Employee BU ->" +BU);
        System.out.println("Employee Designation ->" +designation);
    }
}
