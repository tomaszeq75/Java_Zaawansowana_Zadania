public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(int radius) {
        super();
        setRadius(radius);
    }

    @Override
    public void resize(int percent) {
        setRadius(getRadius() * percent / 100);
    }
}
