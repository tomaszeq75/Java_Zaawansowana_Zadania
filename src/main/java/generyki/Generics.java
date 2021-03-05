package generyki;

public class Generics<T> {

    T item;

//    public Generics(T item) {
//        this.item = item;
//    }

    public void setItem(T item) {
        this.item = item;
    }

    public T getClassA() {
        return item;
    }

    public void printAB() {
        System.out.println(item.getClass().getName());
    }

}



