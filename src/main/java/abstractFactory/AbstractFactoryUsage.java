package abstractFactory;

public class AbstractFactoryUsage {
    public static void main(String[] args) {
//        CarType carType = CarType.valueOf(args[0]); // np. AUDI_A4
        CarType carType = CarType.valueOf("AUDI_A4"); // np. AUDI_A4

        System.out.println("User wants to produce a " + carType); // User wants to produce a AUDI_A4

        CarFactory factory = new FactoryProvider().createFactory(carType);
        Car combi = factory.createCombi();

        System.out.println("There is your combi " + combi); // output: There is your combi Car: Audi A4 COMBI has 6 cylinders and engine: 2.7 and trunk with size 540 litres
    }
}

