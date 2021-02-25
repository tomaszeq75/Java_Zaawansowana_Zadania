package threads_sorting;

import java.util.Collections;
import java.util.List;

public class MyInterfaceThread implements Runnable {

    private List<String> names;

    public MyInterfaceThread(List<String> names) {
        this.names = names;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Collections.sort(names);
        }
    }
}
