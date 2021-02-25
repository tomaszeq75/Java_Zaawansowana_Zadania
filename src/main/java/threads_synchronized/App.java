package threads_synchronized;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class App {

    public static void main(String[] args) throws InterruptedException {

        final List<String> names = new ArrayList<>(4);
//        final List<String> names = new Vector<>(4);
        names.add("Zenon");
        names.add("Adam");
        names.add("Damian");
        names.add("Batman");

        Repository repository = new Repository(names);

        MyThread thread1 = new MyThread(repository);
        Thread thread2 = new Thread(new MyInterfaceThread(repository));

        System.out.println(names);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(names);
    }

}
/*
Mamy kilka scenariuszy:
1.Do repository przekazujemy Vector, ktory jest synchronizowany i nie potrzebujemy
synchronizacji na poziomie metody sort w Repository aby dobrze dzialalo
2. Jesli przekazy ArrayListe, aby program dobrze dzialal potrzebujemy synchronizacji
na poziomie meotdy sort w Repository
3. Jesli uzyjemy ArrayListy bez sychronizacji wysypie nam bledem
4. Generalnie nie ma potrzeby podwojnej synchronizacji, czyli jesli bedziemy uzywali Vector
to nie musimy synchronizowac metody. Mozemy wymusic przekazywanie listy Vector i nie synchronizowac metody.
Trzeba wtedy zmienic pole w Repository na private Vector<String> names;
*/