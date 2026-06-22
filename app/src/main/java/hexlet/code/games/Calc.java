package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Calc {
    private static final String RULES =
            "What is the result of the expression?";

    private static final int OPERATIONS_COUNT = 3;
    private static final int NUMBER_BOUND = 100;

    public static void calculate(Scanner scanner) {
        Random random = new Random();

        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int firstNumber = random.nextInt(NUMBER_BOUND);
            int secondNumber = random.nextInt(NUMBER_BOUND);
            int operationNumber = random.nextInt(OPERATIONS_COUNT);

            String operator;
            int result;

            switch (operationNumber) {
                case 0:
                    operator = "+";
                    result = firstNumber + secondNumber;
                    break;
                case 1:
                    operator = "-";
                    result = firstNumber - secondNumber;
                    break;
                case 2:
                    operator = "*";
                    result = firstNumber * secondNumber;
                    break;
                default:
                    throw new IllegalStateException(
                            "Unknown operation: " + operationNumber
                    );
            }

            questions[round] =
                    firstNumber + " " + operator + " " + secondNumber;

            correctAnswers[round] = String.valueOf(result);
        }

        Engine.run(scanner, RULES, questions, correctAnswers);
    }
}
