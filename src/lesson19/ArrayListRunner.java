package lesson19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        List<String> integers = new ArrayList<>(5);
        integers.add("1");
        integers.add("2");

        integers.iterator().forEachRemaining(System.out::println);
        integers.forEach(System.out::println);


    }




//    public static void prepeareForLesson() {
//        List<String> name = new ArrayList<>(4);
//
//        name.add(0, "Alex");
//        name.add(1, "Anna");
//        name.add(2, "Bob");
//        name.add(3, "Nina");
//
//        for (String value : name) {
//            System.out.println(value);
//        }
//
//        name.forEach(System.out::println);
//        String string = name.toString();
//        System.out.println(string);
//
//
//    }
}
