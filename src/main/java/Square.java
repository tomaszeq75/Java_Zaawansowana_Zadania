public class Square extends Rectangle {

    public Square() {
        super();
    }

    public Square(String color, boolean isFilled, double width) {
        super(color, isFilled, width, width);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return String.format("Square with width=%f which is a subclass off %s",
                width, super.toString());
    }

}
