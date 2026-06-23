package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Prime {
    private static final String RULES =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void given(Scanner scanner) {
        Random random = new Random();

        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int number = random.nextInt();

            questions[round] = String.valueOf(number);
            correctAnswers[round] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(scanner, RULES, questions, correctAnswers);

    }

    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int divisor = 2; divisor * divisor <= number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
