package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES =
            "What is the result of the expression?";

    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final int NUMBER_BOUND = 100;

    public static void calculate() {
        Random random = new Random();

        String[][] gameData =
                new String[Engine.ROUNDS_COUNT][Engine.GAME_DATA_SIZE];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int firstNumber = random.nextInt(NUMBER_BOUND);
            int secondNumber = random.nextInt(NUMBER_BOUND);

            int operatorIndex = random.nextInt(OPERATORS.length);
            char operator = OPERATORS[operatorIndex];

            int result = calculateExpression(
                    firstNumber,
                    secondNumber,
                    operator
            );

            gameData[round][0] =
                    firstNumber + " " + operator + " " + secondNumber;
            gameData[round][1] = String.valueOf(result);
        }

        Engine.run(RULES, gameData);
    }

    private static int calculateExpression(
            int firstNumber,
            int secondNumber,
            char operator
    ) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            default:
                throw new IllegalArgumentException(
                        "Unknown operator: " + operator
                );
        }
    }
}
