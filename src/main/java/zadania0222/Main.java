package zadania0222;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Computer c1 = new Computer("Intel", "GeForce", "Dell", "1", 16, 2400);
        Computer c2 = new Computer("AMD", "GeForce", "Dell", "2", 8, 3000);
        Computer c3 = new Computer("AMD", "GeForce", "Dell", "3", 8, 2800);
        Computer c4 = new Computer("AMD", "GeForce", "Dell", "4", 16, 3000);
        Computer c5 = new Computer("AMD", "GeForce", "Dell", "5", 8, 2400);
        Computer c6 = new Computer("AMD", "GeForce", "Dell", "6", 16, 2400);
        System.out.println();

        List<Computer> computers = Arrays.asList(c1, c2, c3, c4, c5, c6);
        System.out.println(computers);

        Collections.sort(computers);
        System.out.println(computers);

        Laptop laptop = new Laptop("AMD", "GeForce", "Dell", "2", 8, 3000, 5000);
        System.out.println("--------------");
        System.out.println(laptop);

    }

    private static void sortListZADemo() {
        List<String> strings = Arrays.asList(new String[]{"aAA", "bbb", "aaa", "Aaa", "ccc", "Ddd"});
        System.out.println(strings);

        SortListZA.sortZA(strings);
        System.out.println(strings);

        SortListZA.sortZAIgnoreCase(strings);
        System.out.println(strings);
    }


}
