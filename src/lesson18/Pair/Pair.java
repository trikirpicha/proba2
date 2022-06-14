package lesson18.Pair;

/**
 * Создать класс Pair, параметризованный двумя
 * параметрами K и V. Класс должен хранить две
 * переменные типов K и V соответственно. У
 * класса должен быть конструктор,
 * принимающий 2 параметра типов K и V, а
 * также набор соответствующих
 * геттеров/сеттеров, toString (для отображения состояния текущего объекта типа Pair)
 */
public class Pair <K, V> {
    private K value1;
    private V value2;

    public Pair(K value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public K getValue1() {
        return value1;
    }

    public void setValue1(K value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value1=" + value1 +
                ", value2=" + value2 +
                '}';
    }
}
