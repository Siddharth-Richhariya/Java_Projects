package Practice;

import java.util.Calendar;
import java.util.Date;

public final class Person {
    private final String name;
    private final int age;
    private final Date birthDate;

    public Person(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        // Defensive copy to preserve immutability
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        // Return a defensive copy to prevent external changes
        return new Date(birthDate.getTime());
    }
}
class main {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(1997, Calendar.FEBRUARY,3);
        Date det = cal.getTime();
        Person p = new Person("Siddharth", 28, det);
        System.out.println(p.getAge());
        System.out.println(p.getBirthDate());
        System.out.println(p.getName());
    }
}
