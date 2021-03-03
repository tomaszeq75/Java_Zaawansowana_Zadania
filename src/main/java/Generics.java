public class Generics<T> {
    public static void main(String[] args) {
        Generics<String> g = new Generics<>();
        Generics<A> a = new Generics<>();
        Generics<B> b = new Generics<>();

        A aa = new A();
        B bb = new B();

        a.printAB(aa);
        a.printAB(bb);

    }

    public void printAB(T item) {
        System.out.println(item.getClass().getName());
    }

}



