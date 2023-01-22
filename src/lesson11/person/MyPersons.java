package lesson11.person;

import java.util.ArrayList;
import java.util.List;

public class MyPersons {
    public static void main(String[] args) {

//        Person person = new Person("Alex", "Komanov", 34, true);
//        person.whatIsYourName();

        Child child = new Child("child", "child", 12, false, "Israel");

        Person childPerson = new Child("person", "person", 45, true, "Israel");

        Student student = new Student("Alexander", "Komanov", 38, true, 30);

        List<Person> list = new ArrayList<>();
        list.add(childPerson);
        list.add(student);
        list.add(child);

        student.whoAreYou();
        child.whoAreYou();
        System.out.println();
        list.forEach(someOne -> someOne.whoAreYou());



    }
}
