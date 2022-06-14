package lesson21;

import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "string-123", 10,
                "string", 10,
                "string--", 15,
                "string-11", 20
        );
        int sum = map.entrySet().stream()
                .filter(entry -> entry.getKey().length() > 7)
                .mapToInt(Map.Entry::getValue)
                .sum();


        System.out.println(sum);

    }
}
