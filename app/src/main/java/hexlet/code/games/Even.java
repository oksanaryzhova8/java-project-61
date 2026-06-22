package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void parityCheck(Scanner scanner) {
        Random random = new Random();

        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int number = random.nextInt();

            questions[round] = String.valueOf(number);
            correctAnswers[round] = isEven(number) ? "yes" : "no";
        }

        Engine.run(scanner, RULES, questions, correctAnswers);

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
