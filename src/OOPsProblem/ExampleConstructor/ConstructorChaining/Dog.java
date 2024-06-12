package OOPsProblem.ExampleConstructor.ConstructorChaining;

public class Dog {
    private String type;
    private String Breed;

    Dog(){
        System.out.println("This is DOG Class");
    }
    Dog(String type){
        this();
        this.type = type;
    }
    Dog(String Breed, String type){
        this(type);
        this.Breed = Breed;
    }
    void display(){
        System.out.println("Type : "+ type + "\nBreed : "+ Breed);
    }
}
