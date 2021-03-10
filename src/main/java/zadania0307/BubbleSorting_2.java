package zadania0307;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSorting_2 {
    public static void main(String[] args) {

        System.out.println("podaj rozmiar tabeli");
        int tableSize = new Scanner(System.in).nextInt();

        int[] numbers = new int[tableSize];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = new Random().nextInt(1000);
        }

        Arrays.stream(numbers).forEach(System.out::println);

        bubbleSorting(numbers);
        System.out.println("-- sort --");
        Arrays.stream(numbers).forEach(System.out::println);
    }

    public static void bubbleSorting(int[] numbers) {
        int[] newNumbers = new int[numbers.length];
        boolean change = false;

        do {
            change = false;
            for (int i = 0; i < numbers.length -1 ; i++) {
                int currentNumber = numbers[i];
                if (currentNumber > numbers[i + 1]) {
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = currentNumber;
                    change = true;
                }
            }
        } while (change);

    }
}
