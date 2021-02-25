package threads_synchronized;

public class MyInterfaceThread implements Runnable {

    private Repository repository;

    public MyInterfaceThread(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            repository.sort();
        }
    }
}