package threads_sorting;

import java.util.Collections;
import java.util.List;

public class MyThread extends Thread {

    private List<String> names;

    public MyThread(List<String> names) {
        this.names = names;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Collections.sort(names);
        }
    }
}
