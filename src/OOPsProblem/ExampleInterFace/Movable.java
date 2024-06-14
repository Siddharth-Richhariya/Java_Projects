package OOPsProblem.ExampleInterFace;

public interface Movable {

    void move();
     default void stop(){
         System.out.println("Stopping Movement");
     }
}
