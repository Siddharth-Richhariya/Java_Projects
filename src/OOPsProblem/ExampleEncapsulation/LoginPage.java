package OOPsProblem.ExampleEncapsulation;

public class LoginPage {
    private  String userName;
    private  String passWord;

    public String getUserName(){
        return userName;
    }
    void setUserName(String userName){
        this.userName = userName;
    }
    public String getPassWord(){
        return passWord;
    }
    void setPassWord(String passWord, boolean isAuth){
        if (isAuth){
        this.passWord = passWord;
    }
        else {
            System.out.println("Try Again");
        }
    }
}
