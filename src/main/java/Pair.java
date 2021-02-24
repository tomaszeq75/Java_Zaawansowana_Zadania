
class Pair {
    private Integer left;
    private Integer right;

    public Pair(final Integer left, final Integer right) {
        this.left = left;
        this.right = right;
    }

    public synchronized void incrementLeft() {
        left++;
    }

    public synchronized void incrementRight() {
        right++;
    }

    public Integer getLeft() {
        return left;
    }

    public Integer getRight() {
        return right;
    }
}

