package threads_synchronized;

import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class Repository {

    private List<String> names;
//    private Vector<String> names;

    public Repository(List<String> names) {
//    public Repository(Vector<String> names) {
        this.names = names;
    }

    public void sort() {
//    public synchronized void sort() {
        Collections.sort(names);
    }
}