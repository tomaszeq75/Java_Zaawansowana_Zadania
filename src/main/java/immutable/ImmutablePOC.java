package immutable;

import java.util.ArrayList;
import java.util.List;

public class ImmutablePOC {

    public static void main(String[] args) {

        List<Hobby> hobbies = new ArrayList<>();
        Hobby hobby = new Hobby("football");
        hobbies.add(hobby);
        ImmutablePlayer player = new ImmutablePlayer(111, 23, "John", hobbies);
        System.out.println(player);
        hobby.setHobby("psikus");
        hobbies.add(new Hobby("ping-pong"));
        System.out.println(player);
    }


}
