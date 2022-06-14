package lesson18;

import java.util.Iterator;

public class List<T> implements Iterable<T>{
    private T[] objects;
    private int size;

    public int getSize() {
        return size;
    }

    public List(int initialSize) {
        this.objects = (T[]) new Object[initialSize];
    }

    public void add(T element) {
        objects[size++] = element;
    }

    public T get(int index) {
        return objects[index];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class ListIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public T next() {
            return null;
        }
    }

}
