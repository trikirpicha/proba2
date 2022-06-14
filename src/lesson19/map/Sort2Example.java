package lesson19.map;

import java.util.*;

public class Sort2Example {
    public static void main(String[] args) {
//        List<Person> personList = Arrays.asList(
//                new Person(1, "Ivan", "ivanov"),
//                new Person(29, "petr", "petrov"),
//                new Person(3, "Sveta", "Svetikova")
//
//        );
//        personList.sort(Comparator.comparing(Person::getFirstName));
//        Collections.sort(personList);

        List<Person> person = new ArrayList<>();
        person.add(new Person(1, "Ivan", "ivanov"));
        person.add(new Person(29, "Sveta", "Svetikova"));
        person.add(new Person(2, "Sveta", "Svetikova"));

        Collections.sort(person);
        person.sort(Comparator.comparing(Person::getId));

    }
}
