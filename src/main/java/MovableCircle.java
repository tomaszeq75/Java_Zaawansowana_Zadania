public class MovableCircle implements Movable {

    MovablePoint center;
    int radius;

    @Override
    public String toString() {
        return center + ", radius = " + radius;
    }

    public MovableCircle(MovablePoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
