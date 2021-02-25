package wyjatki1;

public class FakePlayer {

    public String getDescription() {
//        return "player description";
        throw new IllegalArgumentException("zly argument");
    }
}
