public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());
        Circle c1 = new Circle("RED" , true,5f);
        System.out.println(c1.toString());

        Rectangle r = new Rectangle();
        System.out.println(r.toString());
        Rectangle r1 = new Rectangle("blue", true, 5, 7);
        System.out.println(r1.toString());
        System.out.println(r1.getArea());

        Square s = new Square("brown", true, 9);
        System.out.println(s.toString());
        Square s1 = new Square();
        System.out.println(s1.toString());


    }
}
