package zadania0307;

import java.util.Scanner;

public class NumberReverse_1 {
    public static void main(String[] args) {

        System.out.println("podaj liczbę");
        int originNumber = new Scanner(System.in).nextInt();
        int number = originNumber;


        int numberOfDigits = 0;
        int tempNumber = number;
        do {
            numberOfDigits++;
        } while ((tempNumber /= 10) > 0);

        System.out.println("numberOfDigits:  " + numberOfDigits);

        // operacje na liczbach
        int result = 0;
        for (int i = numberOfDigits - 1; i >= 0; i--) {
            int lastNumber = number % 10;
            result = result + (int) (lastNumber * Math.pow(10.0, i));
            number /= 10;
        }

        System.out.println("liczba: " + result);

        // operacje na stringach
        number = originNumber;
        StringBuilder stringBuilder = new StringBuilder();
        while (number % 10 > 0) {
            stringBuilder.append(number % 10);
            number /= 10;
        }
        System.out.println("String: " + stringBuilder);

    }

}
