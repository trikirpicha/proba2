package lesson19.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Person ivan = new Person(3, "Ivan", "Ivanov");
        Person petr = new Person(29, "Petr", "Petrov");
        Person sveta = new Person(5, "Sveta", "Svetikova");

        Map<Integer, Person> map = new TreeMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);
        map.put(sveta.getId(), sveta);

//        System.out.println(map.get(3));
//
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//        System.out.println(map.entrySet());

//        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + "=" + entry.getValue());
//
//        }
        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }

    }
}
