package OOPsProblem.ExampleAbstraction.BasicExample;

abstract class AbstractClass {
    String bookname;
    String author;
    int price;
    abstract void displaybook(String bookname, String author, int price);

    void abstractclassDisplay(){
        System.out.println("This method inherited from Abstract class");
    }


}
