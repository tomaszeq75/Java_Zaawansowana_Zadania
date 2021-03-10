package zadania0307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Zad_6 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        System.out.println(ints);

        // using map & collector
        String result = ints.stream().map(x -> (x % 2 == 0) ? ("e" + x) : ("o" + x))
                .collect(Collectors.joining(", "));

        System.out.println("map + joining: " + result);

        // using map & reduce
        result = ints.stream().map(x -> (x % 2 == 0) ? ("e" + x) : ("o" + x))
                .reduce("", (x, y) -> x + y + ", ");

        System.out.println("map + reduce: " + result);

       // using reduce only
        result = ints.stream()
                .reduce("", (x, y) -> x + ((y % 2 == 0) ? ("e" + y) : ("o" + y)) + ", ", (s1, s2) -> s1);

        System.out.println("reduce only: " + result);

    }

}
