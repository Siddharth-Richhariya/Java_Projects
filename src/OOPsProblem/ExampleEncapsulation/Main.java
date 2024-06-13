package OOPsProblem.ExampleEncapsulation;

public class Main {
    public static void main(String[] args) {
     LoginPage lp = new LoginPage();
     lp.setUserName("Admin");
     lp.setPassWord("Test123!", true);
     String Username = lp.getUserName();
     String Password = lp.getPassWord();
        System.out.println(Username);
        System.out.println(Password);
    }
}
