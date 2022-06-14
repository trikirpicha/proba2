package lesson19.map;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class SortExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("123", "345", "14", "678");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(
                new Person(1, "Ivan", "ivanov"),
                new Person(29, "petr", "petrov"),
                new Person(3, "Sveta", "Svetikova")

        );
        Collections.sort(personList);
        personList.sort(Comparator.comparing(Person::getFirstName));
      //  personList.sort(Comparator.comparing(Person::getId));
        System.out.println(personList);

    }
}
