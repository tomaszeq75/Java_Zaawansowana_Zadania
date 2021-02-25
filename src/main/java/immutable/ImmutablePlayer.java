package immutable;

import java.util.ArrayList;
import java.util.List;

//finalny konstruktor
public final class ImmutablePlayer {

    //zmienne prywatne  i finalne
    private final int ranking;
    private final int age;
    private final String name;
    private final List<Hobby> hobbies;

    //inicjalizujemy obiekt przez konstrukor
    public ImmutablePlayer(int ranking, int age, String name, List<Hobby> hobbies) {
        this.ranking = ranking;
        this.age = age;
        this.name = name;

        List<Hobby> deepCopy = new ArrayList<>();
        for (Hobby oneHobby : hobbies) {
            Hobby copy = new Hobby(oneHobby.getHobby());
            deepCopy.add(copy);
        }

        this.hobbies = deepCopy;
    }

    //nie dostarczamy setterow

    public int getRanking() {
        return ranking;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "immutable.ImmutablePlayer{" +
                "ranking=" + ranking +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", hobbies=" + hobbies +
                '}';
    }
}
