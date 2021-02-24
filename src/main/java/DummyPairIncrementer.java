class DummyPairIncrementer implements Runnable {
    private final Pair pair;

    public DummyPairIncrementer(final Pair pair) {
        this.pair = pair;
    }

    @Override
    public void run() {
        for (int idx = 0; idx < 100; idx++) {
            pair.incrementLeft();
            System.out.println(Thread.currentThread().getName() + " - " +pair.getLeft());
            pair.incrementRight();
            System.out.println(Thread.currentThread().getName() + " - " +pair.getRight());
        }
        System.out.println(Thread.currentThread().getName() + " - " +
                pair.getLeft() + " " + pair.getRight());
    }
}