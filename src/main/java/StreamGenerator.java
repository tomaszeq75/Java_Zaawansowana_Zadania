import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGenerator {

    double average = 2.0;
    List<Integer> values = List.of(1, 2, 3);



    public static void generate999() {
        final int[] counter = {0};
        Supplier<String> getStrings = () -> {
            counter[0]++;
            return Integer.toString(new Random().nextInt(1000));
        };

        Optional<String> number = Stream.generate(getStrings)
                .filter((x) -> x.contains("999"))
                .findFirst();

        System.out.println("Wygenerowałem " + counter[0] + " liczb żeby znaleźć 999");
        System.out.println("To liczba " + number.get());
    }

    public static List<String> generateStringsOfInts(int size) {

        final int[] counter = {0};
        Supplier<String> getStrings = () -> {
            counter[0]++;
            return Integer.toString(new Random().nextInt(100000));
        };

        List<String> list = Stream.generate(getStrings)
                .filter((x)->x.contains("9"))
                .limit(size)
                .collect(Collectors.toList());

        list.add(Integer.toString(counter[0]));
        return list;
    }
}
