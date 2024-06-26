package OOPsProblem.ExamplePolymorphism.Overriding;

public class Main {
    public static void main(String[] args) {
        GTR GTR = new GTR();
        GTR.engine();           //V6 Engine
        GTR.Brake();            //Disc
        GTR.Transmission();     //Manual
        GTR.Tyre();             //Michelin Primacy MXM4
    }
}
class Vehicle {
    void engine(){
        System.out.println("V8 Engine");
    }
    void Tyre(){
        System.out.println("PILOT SPORT GT P2L");
    }
    void Brake(){
        System.out.println("Disc");
    }
    void Transmission(){
        System.out.println("Manual");
    }
}
class GTR extends Vehicle{
    void engine(){
        System.out.println("V6 Engine");
    }
    void Tyre(){
        System.out.println("Michelin Primacy MXM4");
    }
    void Brake(){
        super.Brake();
    }
    void Transmission(){
        super.Transmission();
    }
}
