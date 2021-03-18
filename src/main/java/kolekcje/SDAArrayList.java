package kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SDAArrayList<E> {
    List<E> data;

    public SDAArrayList() {
        this.data = new ArrayList<>();
    }

    public void add(E item) {
        data.add(item);
    }

    public E remove(int index) {
        return data.remove(index);
    }

    public E get(int index) {
        return data.get(index);
    }

    public void display() {
        System.out.println("\n---");

        for (int i = 0; i < data.size(); i++) {
            E t =  data.get(i);
            System.out.println(t + " " + t.getClass().getSimpleName());
        }

        String s = data.stream().map(in -> in.toString()).collect(Collectors.joining(", "));
        System.out.println(s);
    }

}
