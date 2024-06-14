package OOPsProblem.ExampleInterFace;

public interface Speakable {
    void speak();
    default void mute(){
        System.out.println("Muting Sound");
    }
}
