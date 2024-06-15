package OOPsProblem.ExampleStaticKeyword;

public class Base {
    static String WebDriver;
    static void openChrome(){
        System.out.println("Chrome Open");
    }

    public static void main(String[] args) {
        openChrome();
        WebDriver = "driver";
    }
    static {//SIB - Static Initialization Block
        System.out.println("This will appear once when class is loaded");
    }
    {//IIB - Instance Initialization Block
        System.out.println("This will apear again and again whenever Class is loaded as Object");
    }

}
