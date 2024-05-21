package OOPsProblem;


public class EncapsulationExample {

    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 12345, 50000.0);
// Accessing employee details through getters
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Salary: " + employee.getSalary());
// Modifying employee salary through setter
        employee.setSalary(60000.0);
// Displaying updated employee details
        employee.displayEmployeeDetails();
    }
}

class Employee {
    private String name;
    private int employeeId;
    private double salary;

// Constructor
    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

// Getters
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }
// Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

// Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}
/*Explanation:

Private Variables: The name, employeeId, and salary variables are declared as private. This means they can only be accessed within the Employee class.
Getters and Setters: The getName, getEmployeeId, getSalary, setName, setEmployeeId, and setSalary methods are public methods that provide controlled access to the private variables.
Data Protection: This code demonstrates encapsulation by hiding the internal data (private variables) and providing controlled access through public methods (getters and setters).

By using encapsulation, you can:
Protect data from unauthorized access.
Enforce data integrity.
Make code more maintainable and flexible.

This code snippet demonstrates how encapsulation helps protect and manage data within a class, ensuring that data is accessed and modified in a controlled and predictable manner.

 */