package zadania0307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zad_5 {
    public static void main(String[] args) {

        List<String> texts = new ArrayList<>(Arrays.asList("aaa", "abbbb", "CdD", "add"));

        List<String> result = texts.stream()
                .filter(x -> (x.charAt(0) == 'a') && (x.length() == 3))
//                .filter(x -> x.charAt(0) == 'a')
//                .filter(x -> x.length() == 3)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
