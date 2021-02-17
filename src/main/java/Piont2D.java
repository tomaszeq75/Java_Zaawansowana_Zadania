import java.lang.reflect.Array;
import java.util.Arrays;

public class Piont2D {
    protected float x;
    protected float y;

    public Piont2D() {
        this.x = this.y = 0;
    }

    public Piont2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{this.x, this.y};
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%.0f, %.0f)", x, y);
    }
}
