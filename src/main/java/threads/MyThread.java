package threads;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello from thread ID: " + getId());
        try {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(400);
                System.out.println("iterator " + i + " " + getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread end");
    }
}
