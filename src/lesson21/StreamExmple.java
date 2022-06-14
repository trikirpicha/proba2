package lesson21;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExmple {
    public static void main(String[] args) {
//        List<String> integers = List.of("1", "3", "4", "5", "6", "7", "9", "10", "15", "25");
//        IntSummaryStatistics intSummaryStatistics = integers.stream()
//                .map(Integer::valueOf)
//                .filter(value -> value % 2 == 0)
//                .map(value -> value + value)
//                .mapToInt(Integer::valueOf)
//                //.mapToObj(Integer::valueOf)
//
//                // .skip(1)
////                .limit(2)
////                .forEach(System.out::println);
////                .average();
//                .summaryStatistics();
//
//
//
//        System.out.println(intSummaryStatistics);

//        Stream.of("1", "3", "4", "5", "6", "7", "9", "10")
//                .peek(System.out::println)
//                .collect(Collectors.toList())

        IntStream.iterate(0, operand -> operand + 3)
                .skip(10)
                .limit(5)
                .forEach(System.out::println);


    }

}
