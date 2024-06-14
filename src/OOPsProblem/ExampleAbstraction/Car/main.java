package OOPsProblem.ExampleAbstraction.Car;

public class main {
    public static void main(String[] args) {
        Car C1 = new Car();
        C1.setName("Tata", "Nexon", 180);
        C1.StartACar();
        C1.CarSpecs();
        /*
        output>>>
        Engine Started
        Car Started
        Tata, Nexon, 180
         */
    }
}
