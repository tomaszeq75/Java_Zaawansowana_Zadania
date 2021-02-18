public class Line {
    Point2D startPoint, endPoint;

    public Line(Point2D startPoint, Point2D endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public Line(float startX, float startY, float endX, float endY) {
        startPoint = new Point2D(startX, startY);
        endPoint = new Point2D(endX, endY);
    }

    public Point2D getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(Point2D startPoint) {
        this.startPoint = startPoint;
    }

    public Point2D getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point2D endPoint) {
        this.endPoint = endPoint;
    }

    public double getLength() {
        double x = Math.pow(endPoint.getX() - startPoint.getX(), 2d);
        double y = Math.pow(endPoint.getY() - startPoint.getY(), 2d);
        return Math.sqrt(x + y);
    }

    public Point2D getMiddlePoint() {
        float x = (endPoint.getX() - startPoint.getX()) / 2 + startPoint.getX();
        float y = (endPoint.getY() - startPoint.getY()) / 2 + startPoint.getY();
        return new Point2D(x, y);
    }

    public Point2D getMiddlePointB() {
        float x = (endPoint.getX() + startPoint.getX()) / 2;
        float y = (endPoint.getY() + startPoint.getY()) / 2;
        return new Point2D(x, y);
    }

}
