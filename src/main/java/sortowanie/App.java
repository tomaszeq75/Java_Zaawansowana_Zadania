package sortowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {

        Player player2 = new Player("Rocky", Integer.MAX_VALUE, 30);
        Player player1 = new Player("Rambo", 1000, 100);
        Player player3 = new Player("Terminator", -1, 50);
        Player player4 = new Player("Rambo3", 1000, 10);
        Player player5 = new Player("Bambo", 1000, 10);

        List<Player> team = new ArrayList<>();
        team.add(player2);
        team.add(player1);
        team.add(player3);
        team.add(player4);
        team.add(player5);
        System.out.println("0. " + team);

//        Collections.sort(team);
        PlayerRankingComparator comparatorRank = new PlayerRankingComparator();
        PlayerAgeComparator comparatorAge = new PlayerAgeComparator();
        PlayerNameComparator playerNameComparator = new PlayerNameComparator();

        Collections.sort(team, comparatorRank.thenComparing(comparatorAge));
        System.out.println("1. " + team);

        Collections.sort(team, comparatorRank.thenComparing(comparatorAge.thenComparing(playerNameComparator)));
        System.out.println("2. " + team);

        Collections.sort(team, comparatorRank.thenComparing(comparatorAge).thenComparing(playerNameComparator));
        System.out.println("3. " + team);


    }

}
