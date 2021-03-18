package kolekcje;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SDAArrayListOK<E> {
    private int initialSize = 3;
    private Object[] array;
    private int currenIndex;


    public SDAArrayListOK() {
        array = new Object[initialSize];
    }

    public void add(E item) {
        if (currenIndex == array.length) {
            increseSize();
        }
        array[currenIndex++] = item;
    }

    public E remove(int index) {
        E removedObj = (E) array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
            if (i + 2 == array.length) {
                array[i + 1] = null;
            }
        }
        if (--currenIndex == array.length / 2) {
            decreseSize();
        }
        return removedObj;
    }

    public E get(int index) {
        return (E) array[index];
    }

    public void display() {
        for (int i = 0; i < currenIndex; i++) {
            System.out.println(array[i]);
        }
        System.out.println("---");
        String toString = Arrays.stream(array)
                .filter(a -> a != null)
                .map(x -> x.toString())
                .collect(Collectors.joining(", "));
        System.out.println(toString);
        System.out.println("- - -");
    }

    private void increseSize() {
        array = Arrays.copyOf(array, array.length * 2);
        System.out.println("incresed length: " + array.length);
    }

    private void decreseSize() {
        array = Arrays.copyOf(array, array.length / 2);
        System.out.println("decresed length: " + array.length);
    }
}
