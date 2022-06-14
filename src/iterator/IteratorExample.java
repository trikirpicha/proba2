package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(5);
        integers.add(7);
        integers.add(5);
        integers.add(10);


        for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext();) {
            Integer next = iterator.next();
            if (next ==5 || next ==7) {
                iterator.remove();
            }
        }
        System.out.println(integers);
//        List<String> strings = List.of("Hello World!", "Alex");
////
//        for (Integer integer : integers) {
//            System.out.println(integer);
////        }
////
////        for (String string : strings) {
////            System.out.println(string);
//
//        }


        }
    }

