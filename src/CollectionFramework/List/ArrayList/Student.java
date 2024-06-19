package CollectionFramework.List.ArrayList;

import java.util.Comparator;

class SortByIDAsc implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.getId().compareTo(s2.getId());
    }
}

class SortByIDDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s2.getId().compareTo(s1.getId());
    }
}

class SortByNameAsc implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.getStudent().compareTo(s2.getStudent());
    }
}

class SortByNameDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s2.getStudent().compareTo(s1.getStudent());
    }
}

class SortByPhoneNumberAsc implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.getPhoneNumber().compareTo(s2.getPhoneNumber());
    }
}

class SortByPhoneNumberDesc implements Comparator<Student> {
    public int compare(Student s1, Student s2){
        return s1.getPhoneNumber().compareTo(s2.getPhoneNumber());
    }
}


public class Student {
    private String student;
    private int id;
    private long phoneNumber;
    Student (String student, int id, long phoneNumber){
    this.id= id;
    this.student=student;
    this.phoneNumber = phoneNumber;
    }
    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public String toString(){
        return "Student ID: "+id+", Student Name: "+student+", Student Phone Number: "+phoneNumber;

    }



}
