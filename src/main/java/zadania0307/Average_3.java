package zadania0307;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Average_3 {
    public static void main(String[] args) {
        ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        IntSummaryStatistics avg = ints.stream().collect(Collectors.summarizingInt(o -> o));
        System.out.println(avg.getMax());
        System.out.println(avg.getMin());
        System.out.println(avg.getAverage());
        System.out.println(avg.getSum());
        System.out.println(avg.getCount());

    }
}
