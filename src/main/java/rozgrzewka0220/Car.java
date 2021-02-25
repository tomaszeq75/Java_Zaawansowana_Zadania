package rozgrzewka0220;

public class Car {

    private String model = "audi";

    //antywzrorzec
    public void printModel(String model) {
        model = "opel";
        System.out.println(model);
    }

    //to tak powinno wygladac
    public void printModel() {
        System.out.println(model);
    }

    //lub statycznie
    public static void print_model(String model) {
        System.out.println(model);
    }

    public static void main(String[] args) {
        new Car().printModel("porsche");
        new Car().printModel();
        Car.print_model("static");

    }

}
