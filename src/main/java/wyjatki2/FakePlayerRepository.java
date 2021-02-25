package wyjatki2;

public class FakePlayerRepository {

    private FakePlayer fakePlayer = new FakePlayer();

    public String getPlayerDescriptionFromRepository(String player) throws InterruptedException {
        String result = "pusty result";

        result = fakePlayer.getDescription();

        return result;
    }


}
