package OOPsProblem.ExampleInterFace;

public class Robot implements Movable, Speakable{


    @Override
    public void speak() {
        System.out.println("Robot Starts Speaking");
    }

    @Override
    public void move() {
        System.out.println("Robot Starts Moving");
    }
}
