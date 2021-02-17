import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle();
        System.out.println(c.toString());
        Shape c1 = new Circle("RED" , true,5f);
        System.out.println(c1.toString());

        Shape r = new Rectangle();
        System.out.println(r.toString());
        Shape r1 = new Rectangle("blue", true, 5, 7);
        System.out.println(r1.toString());
        System.out.println(r1.getArea());

        Shape s = new Square("brown", true, 9);
        System.out.println(s.toString());
        Shape s1 = new Square();
        System.out.println(s1.toString());


        System.out.println("----------------");

        List<Shape> shapes = new ArrayList<>(Arrays.asList(c, c1, r, r1, s, s1));

        for (Shape shape : shapes) {
            System.out.println(shape);
            System.out.println(shape.getArea());
            System.out.println(shape.getPerimeter());
        }
    }
}
