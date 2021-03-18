package kolekcje;

public class App {
    public static void main(String[] args) {


    }

    private static void zadanie_1_ok() {
        SDAArrayListOK<Integer> ints = new SDAArrayListOK<>();
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
//        System.out.println(ints.get(0));

        ints.display();

        System.out.println("remowed: " + ints.remove(1));
        System.out.println("remowed: " + ints.remove(1));
        ints.display();
    }

    private static void zadanie_1() {

        // nie o to chodziło w tym zadaniu
        SDAArrayList<Integer> ints = new SDAArrayList<>();
        ints.add(77);
        ints.add(11);
        ints.add(99);
        ints.remove(0);
        System.out.println(ints.get(0));
        ints.display();

        SDAArrayList<String> texts = new SDAArrayList<String>();
        texts.add("a77");
        texts.add("a11");
        texts.add("a99");
        texts.display();

        // też działa brak podaego typu
        SDAArrayList texts2 = new SDAArrayList();
        texts2.add("a77");
        texts2.add(true);
        texts2.add(9.0);
        texts2.add(999);
        texts2.display();
    }
}
