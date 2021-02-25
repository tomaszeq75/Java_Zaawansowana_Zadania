package threads;

public class MyInterfaceThread implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello from interface thread");
        try {
            for (int i = 0; i < 20; i++) {
                Thread.sleep(400);
                System.out.println("interface thread iterator " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread end");
    }
}
