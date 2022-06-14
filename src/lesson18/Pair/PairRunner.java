package lesson18.Pair;

import java.util.List;

public class PairRunner {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10,"123f");
        System.out.println(pair);

        Pair<String, Integer> swapPair = PairUtil.swap(pair);
        System.out.println(swapPair);

        List<Integer> list = new java.util.ArrayList<>(List.of(1, 3, 5, 6, 7, 8, 13, 20));
        list.removeIf(s -> (s % 2 != 0));
        list.forEach(s -> System.out.print(s + " "));

    }

}
