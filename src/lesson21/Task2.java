package lesson21;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of(
                        "String12",
                        "String",
                        "String25",
                        "String251212",
                        "String169",
                        "String16"
                        );
        int size = strings.stream()
                .filter(s -> s.length() > 8)
                .collect(Collectors.toSet())
                .size();
        System.out.println(size);

        long count = strings.stream()
                .filter(s -> s.length() > 8)
                .distinct()
                .count();
        System.out.println(count);
    }
}
