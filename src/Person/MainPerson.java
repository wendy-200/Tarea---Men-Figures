package Person;

import exception.DuplicatedNameException;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person("Mar", "Aro", 15 );
        Person p2 = new Person("Lucas", "Segovia", 21);

        Person p3 = new Person();
        p3.setName("Joel");
        p3.setLastname("Paredes");

        printPersonProperties(p1);
        printPersonProperties(p3);
        printPersonProperties(p2);

        List<Person> personList = new ArrayList<>();
        Person p4 = new Person("Wendy", "Ortiz", 18);
        try {
            addPerson(p1, personList);
            addPerson(p2, personList);
            addPerson(p3, personList);
            addPerson(p4, personList);
        } catch (DuplicatedNameException de) {
            System.out.println(de.getMessage());
        }
    }

    public static void addPerson(Person p, List<Person> personList) throws DuplicatedNameException {
        for(Person per : personList) {
            if(per.getName().equalsIgnoreCase(p.getName())) {
                throw new DuplicatedNameException("Person Name " + p.getName() + " , already exists. PersonList: " + personList);
            }
        }
        personList.add(p);
    }

    public static void printPersonProperties(Person p) {
        try {
            System.out.println("-----------------------------------");
            System.out.println("Name: " + p.getName());
            System.out.println("Lastname: " + p.getLastname().toUpperCase());
            System.out.println("Age: " + (p.getAge() + 1));
        } catch (NullPointerException ne) {
            System.out.println("Person Attribute is null. Exception Message: " + ne.getMessage());
        }
    }
}
