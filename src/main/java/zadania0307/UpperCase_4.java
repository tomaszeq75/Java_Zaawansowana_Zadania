package zadania0307;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase_4 {
    public static void main(String[] args) {

        List<String> texts = new ArrayList<>(Arrays.asList("aaa", "bbb", "CdD"));

        List<String> upperTexts = texts.stream().map(t->t.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperTexts);

    }
}
