package wyjatki1;

public class App {

    public static void main(String[] args) {

        FakePlayerRepository repository = new FakePlayerRepository();

        String result = null;

        try {
            result = repository.getPlayerDescriptionFromRepository("John");
        } catch (IllegalArgumentException e) {
            //scenariusz 1 obslugujemy wyjatek, drukujemy komunikat, program dziala dalej
//            System.out.println(e.getMessage());
//            System.out.println("Check if argument player is valid");
//        }
        }

        System.out.println(result);
    }
}
