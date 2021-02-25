package wyjatki1;

public class FakePlayerRepository {

    private FakePlayer fakePlayer = new FakePlayer();

    public String getPlayerDescriptionFromRepository(String player) {
        String result = "pusty result";

        //scenariusz 1 obslugujemy wyjatek, drukujemy komunikat, program dziala dalej
//        try {
//            result = fakePlayer.getDescription();
//        } catch (IllegalArgumentException e){
//            System.out.println(e.getMessage());
//            System.out.println("Check if argument player is valid " + player);
//        }

        result = fakePlayer.getDescription();

        return result;
    }
}
