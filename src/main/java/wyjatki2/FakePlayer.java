package wyjatki2;

public class FakePlayer {

    public String getDescription() throws InterruptedException {

        Thread.sleep(10000);

        return "player description";
//        throw new Exception("zly argument");
    }
}
