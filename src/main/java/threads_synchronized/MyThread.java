package threads_synchronized;

public class MyThread extends Thread {

    private Repository repository;

    public MyThread(Repository repository) {
        this.repository = repository;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            repository.sort();
        }
    }
}