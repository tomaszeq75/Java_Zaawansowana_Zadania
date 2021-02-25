package enums;

public enum Transport {

    CAR(100, 77), TIR(50, 77), PLAIN(1000, 11);

    Transport(int speed, int code) {
        this.speed = speed;
        this.code = code;
    }

    private int speed;
    private int code;

    public int getSpeed() {
        return speed;
    }

    public int getCode() {
        return code;
    }

    boolean isTheSameCode(Transport o) {
        return getCode() == o.getCode();
    }
}