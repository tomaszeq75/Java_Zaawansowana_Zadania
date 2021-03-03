package funkcyjne;


import java.util.Arrays;
import java.util.Optional;
import java.util.function.Consumer;

public class App {
    public static void main(String[] args) {
        Action action = (x, y) -> {
            return x + " - " + y;
        };

        System.out.println(action.execute("aaa", "bbb"));

        Consumer consumer = (x) -> System.out.println(("contains 's': " + x));
        consumer.accept("dupa");

        String[] s = {"sss", "lll", "asa", "aaa"};
        Arrays.stream(s).
                filter((x) -> x.contains("s")).
                forEach(consumer);

        System.out.println("---");
        Arrays.stream(s).findFirst().ifPresent(System.out::println);


        String text = "z";
        Optional<String> opt = Optional.ofNullable(text);
        System.out.println(opt.orElse("nic"));
        text = "aaa";
        System.out.println(opt.orElse("nic"));

        String nullName = "null";
        String name = Optional.ofNullable(nullName).get();
    }
}
