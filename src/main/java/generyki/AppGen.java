package generyki;

public class AppGen {
    public static void main(String[] args) {

        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        ClassA.staticMathod();
        ClassB.staticMathod();


        Generics<ClassA> gA = new Generics<>();
        Generics<ClassB> gB = new Generics<>();

        gA.setItem(classA);
        gA.printAB();

        gA.setItem(classB);
        gA.printAB();

    }
}
