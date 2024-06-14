package OOPsProblem.ExampleAbstraction.Car;

abstract class Base {
    String carName;
    String Model;
    int topSpeed;

    abstract void engine();

    void StartACar() {
        engine();
        System.out.println("Car Started");
    }

    void setName(String carName, String Model,int topSpeed) {
        this.topSpeed = topSpeed;
        this.Model = Model;
        this.carName = carName;
    }

     void CarSpecs() {
        System.out.println(carName + ", " + Model + ", " + topSpeed);
    }
}




