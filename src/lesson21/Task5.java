package lesson21;

import java.net.Inet4Address;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        List<Person> personList = List.of(
                new Person("Alex", "Anisimov", 29),
                new Person("Sveta", "Svetikova", 32),
                new Person("Anna", "Annuskina", 27),
                new Person("Petr", "Petrov", 40),
                new Person("Evgenii", "Pont", 45)

        );
        personList.stream()
                .filter(person -> person.getFillName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFillName)
                .ifPresent(System.out::println);

//        String[] names = {"Alex", "Sveta", "Anna", "Petr"};
//        Stream.of(names)
//                .filter(name -> name.startsWith("A"))
//                //.sorted()
//                //  .forEach(System.out::println);
//                .forEach(System.out::println);

//            Arrays.stream(new int[] {2,4,6,8,10})
//                    .map(x->x*x)
//                    .average()
//                    .ifPresent(System.out::println);

        List<String> strings = List.of("Alex", "Sveta", "Anna", "Petr");
        strings.stream()
                .map(String::toLowerCase)
                .filter(x-> x.startsWith("a"))
                .collect(Collectors.toList());
             strings.forEach(System.out::println);


    }
}
