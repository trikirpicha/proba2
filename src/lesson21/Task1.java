package lesson21;

import java.util.List;
import java.util.OptionalDouble;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 15, 25, 35);
        OptionalDouble average = integers.stream()
                .filter(s -> s % 2 != 0 && s % 5 == 0)
                .mapToInt(Integer::intValue)
                .average();
                average.ifPresent(System.out::println);
        System.out.println();
    }

}
