package lesson19.map;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(3, "Ivan", "Ivanov");
        Person petr = new Person(5, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        System.out.println(map.get(3));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());

        for (Person person : map.values()) {
            System.out.println(person.getFirstName());
        }

        for (Map.Entry<Integer, Person> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }

        System.out.println(map.containsKey(3));
    }

}
