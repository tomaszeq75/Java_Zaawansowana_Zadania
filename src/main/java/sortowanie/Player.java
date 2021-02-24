package sortowanie;

public class Player implements Comparable<Player> {
    private String name;
    private int ranking;
    private int age;

    public Player(String name, int ranking, int age) {
        this.name = name;
        this.ranking = ranking;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + name + ", r: " + ranking + ", age: " + age + ']';
    }

    @Override
    public int compareTo(Player o) {
        return name.compareTo(o.name);
//        return Integer.compare(ranking, o.ranking);


        //NIE ROBIMY TAK!, bo mozemy przekorczyc zakres integera i nie zadziala prawidlowo
        //moze dzialac, ale moze to prowadzic do trudnych do wykrycia bledow
        //        return ranking - o.ranking;
    }

    public int getRanking() {
        return ranking;
    }

    public int getAge() {
        return age;
    }
}
