package threads;

public class App {

    public static void main(String[] args) {

        MyThread thread1 = new MyThread();
        Thread thread2 = new Thread(new MyInterfaceThread());

        thread1.start();
        thread2.start();
    }

}
