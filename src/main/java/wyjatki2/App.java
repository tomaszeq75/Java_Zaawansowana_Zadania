package wyjatki2;

public class App {

    public static void main(String[] args) {

        FakePlayerRepository repository = new FakePlayerRepository();

        String result = null;

        try {
            result = repository.getPlayerDescriptionFromRepository("John");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        throw new TurboAppException("jak zyc");

//        System.out.println(result);
    }
}
