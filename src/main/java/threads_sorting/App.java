package threads_sorting;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) throws InterruptedException {

        final List<String> names = new ArrayList<>(4);
//        final List<String> names = new Vector<>(4);
        names.add("Zenon");
        names.add("Adam");
        names.add("Damian");
        names.add("Batman");

        MyThread thread1 = new MyThread(names);
        Thread thread2 = new Thread(new MyInterfaceThread(names));

        System.out.println("1. " + names);

        thread1.start();
        thread2.start();

        System.out.println("2. " + names);

        thread1.join();
        thread2.join();

        System.out.println("3. " + names);
    }

}
