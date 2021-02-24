public class ThreadExample implements Runnable {

    @Override
    public void run() {

        System.out.println("thread start");
        try {
            Thread.sleep(1000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Inside thread " + Thread.currentThread().getName() +
                " - id: " + Thread.currentThread().getId());
    }
}
