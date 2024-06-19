package CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Shabbir Kaderi", 12, 9734614734L));
        students.add(new Student("Siddharth Richhariya", 13, 9519233944L));
        students.add(new Student("Gourav Vashishtha", 11, 9740023944L));
        students.add(new Student("Taha Merchant", 14, 9743823444L));
        students.add(new Student("Yash Jain", 15, 9737516547L));
        students.add(new Student("Shuptanu Chakraworthy", 17, 9734614912L));
        students.add(new Student("Doremoen", 16, 9734614123L));
        students.add(new Student("Ashish Patil", 10, 9734614546L));
        students.add(new Student("Noor Sabha", 19, 9734614987L));
        students.add(new Student("Token", 24, 8764614123L));

        for(Student s1: students){
            System.out.println(s1);
        }
        students.sort(new SortByIDAsc());   //Return ID in Ascending Order
        //students.sort(new SortByIDDesc()); //Return ID in Descending Order
        //students.sort(new SortByNameAsc());   //Return Student Name in Ascending Order
        //students.sort(new SortByNameDesc());  //Return Student Name in Descending Order
        //students.sort(new SortByPhoneNumberAsc());    //Return Student Phone Number in Ascending Order
        //students.sort(new SortByPhoneNumberDesc());   //Return Student Phone Number in Descending Order
        System.out.println();
        for(Student s1: students){
            System.out.println(s1);
        }
    }
}
