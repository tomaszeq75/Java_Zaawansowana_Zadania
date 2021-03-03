import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println(StreamGenerator.generateStringsOfInts(10));
        StreamGenerator.generate999();

        StreamGenerator sg = new StreamGenerator();
        List<Integer> ints = Stream.of(sg, sg, sg)
                .flatMap(x -> x.values.stream())
                .collect(Collectors.toList());
        System.out.println(ints);

        String[] znaki = "safdafsdasfdasfsdgafsdgfadgfaagsfdgfdafgasf".split(".");
        System.out.println(Arrays.toString(znaki));

//        Stream.of("safdafsdasfdasfsdgafsdgfadgfaagsfdgfdafgasf")
//                .map(st -> st.split("."))
//                .collect(Collectors.groupingBy(String::chars))
//                .forEach((key, value) -> System.out.println(key + " " + value));
    }

    private static void nestedClassDemo() {
        NestedClass nestedClass = new NestedClass();
    }

    private static void threadsDemo1() {
        final Pair pair = new Pair(0, 0);
        new Thread(new DummyPairIncrementer(pair)).start();
        new Thread(new DummyPairIncrementer(pair)).start();
    }

    private static void tryCatchDemo() {
        try {
            System.out.println("try");
            throw new ArithmeticException("Wyjątek");
        } catch (ArithmeticException e) {
            System.out.println("catch");
            e.printStackTrace();
            System.out.println("after e");
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("finally");
        }
    }

    private static void circlesDemo() {

        MovablePoint p1 = new MovablePoint(100, 100, 10, 20);
        MovableCircle c1 = new MovableCircle(p1, 50);

        System.out.println(c1);
        c1.moveDown();
        System.out.println(c1);
        c1.moveRight();
        System.out.println(c1);
        c1.moveLeft();
        System.out.println(c1);
        c1.moveUp();
        System.out.println(c1);

        Movable c2 = new MovableCircle(10, 10, 1, 2, 5);
        System.out.println(c2);

        ResizableCircle rc = new ResizableCircle(100);
        System.out.println("\nrc: " + rc);
        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());

        rc.resize(15);
        System.out.println("\nrc: " + rc);
        System.out.println(rc.getArea());
        System.out.println(rc.getPerimeter());
    }

    private static void lineDemo() {
        Point2D startPoint = new Point2D(10, 10);
        Point2D endPoint = new Point2D(410, 310);

        Line l1 = new Line(startPoint, endPoint);
        System.out.println("length: " + l1.getLength());
        System.out.println("middle point: " + l1.getMiddlePoint());

        Line l2 = new Line(endPoint, startPoint);
        System.out.println("length: " + l2.getLength());
        System.out.println("middle point: " + l2.getMiddlePoint());

        Line l3 = new Line(10, 10, 310, 410);
        System.out.println("length: " + l3.getLength());
        System.out.println("middle point: " + l3.getMiddlePoint());

        l3 = new Line(310, 10, 10, 410);
        System.out.println("length: " + l3.getLength());
        System.out.println("middle point: " + l3.getMiddlePoint());
        System.out.println("middle point: " + l3.getMiddlePointB());
        System.out.println(l3.getStartPoint() + " - " + l3.getEndPoint());
    }
}
