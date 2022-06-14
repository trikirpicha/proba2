package lesson18.Pair;

public final class PairUtil {
    private PairUtil (){

    }
    public static <K, V> Pair <V, K> swap(Pair<K, V> source){
        V value2 = source.getValue2();
        K value1 = source.getValue1();
        return new Pair<>(value2, value1);
    }
}
