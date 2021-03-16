package interfejsy_klasy;

public class App {
    public static void main(String[] args) {
        // zadania z pliku java zaawansowana zadania
        // klasi i interfejsy

        User user = new User();
        user.setSurname("ala");
        System.out.println(user);

        user.setSurname("Ala");
        System.out.println(user);


    }

    private static void zadanie_3() {
        Car car = new Car("BMW", Car.CarType.LUXURY);
        System.out.println(car);

        Car car1 = new Car("BMW", Car.CarType.ORDINARY);
        System.out.println(car1);
    }

    private static void zadanie_2() {
        Movie movie = new MovieCreator()
                .withTitle("Psy")
                .withDirector("Pasikowski")
                .withGenre("Sensacja")
                .withPublisher("Wydawca")
                .withYear(1998)
                .create();
        System.out.println(movie);

        movie = new MovieCreator()
                .withTitle("Psy")
                .withDirector("Pasikowski")
                .withYear(1998)
                .create();
        System.out.println(movie);
    }

    private static void zadanie_1() {
        UserValdator.validateEmails("aaa@wp.pl", "a@o2.pl");
        UserValdator.validateEmails("aaa.aa@wp.pl", "@o2.pl");
        UserValdator.validateEmails("aaawp.pl", "a@o2.pl");
    }
}
