package OOPsProblem.ExampleStaticKeyword;

public class objectClass {
    public static void main(String[] args) {
        Call m1 = new Call();
        Base.WebDriver = "Driver";
        Base.openChrome();
        Call.openChrome();
        Base m2 = new Base();
        Base m3 = new Base();

        System.out.println();

        innerClass in = new innerClass();
        innerClass.innXclass in1 = new innerClass.innXclass();
        innerClass.innXclass.innYclass in2 = new innerClass.innXclass.innYclass();
        in2.display();
        innerClass.innXclass.innYclass.displayMess();
    }
}
