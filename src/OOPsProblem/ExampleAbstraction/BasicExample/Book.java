package OOPsProblem.ExampleAbstraction.BasicExample;

public class Book extends AbstractClass {

    @Override
    void displaybook(String bookname, String author, int price) {
        System.out.println(bookname +", " +author +", "+price);
    }
}
