package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class GCD {
    private static final String RULES =
            "Find the greatest common divisor of given numbers.";

    public static void find(Scanner scanner) {
        Random random = new Random();

        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int firstNumber = random.nextInt();
            int secondNumber = random.nextInt();

            questions[round] = firstNumber + " " + secondNumber;

            int result = findGcd(firstNumber, secondNumber);
            correctAnswers[round] = String.valueOf(result);
        }

        Engine.run(scanner, RULES, questions, correctAnswers);
    }

    private static int findGcd(int firstNumber, int secondNumber) {
        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);

        while (secondNumber != 0) {
            int remainder = firstNumber % secondNumber;

            firstNumber = secondNumber;
            secondNumber = remainder;
        }

        return firstNumber;

    }
}





