package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES =
            "What is the result of the expression?";

    private static final int OPERATIONS_COUNT = 3;
    private static final int NUMBER_BOUND = 100;

    public static void calculate() {
        Random random = new Random();

        String[][] gameData =
                new String[Engine.ROUNDS_COUNT][Engine.GAME_DATA_SIZE];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int firstNumber = random.nextInt(NUMBER_BOUND);
            int secondNumber = random.nextInt(NUMBER_BOUND);
            int operationNumber = random.nextInt(OPERATIONS_COUNT);

            String operator = getOperator(operationNumber);
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

    private static String getOperator(int operationNumber) {
        switch (operationNumber) {
            case 0:
                return "+";
            case 1:
                return "-";
            case 2:
                return "*";
            default:
                throw new IllegalArgumentException(
                        "Unknown operation number: " + operationNumber
                );
        }
    }

    private static int calculateExpression(
            int firstNumber,
            int secondNumber,
            String operator
    ) {
        switch (operator) {
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            default:
                throw new IllegalArgumentException(
                        "Unknown operator: " + operator
                );
        }
    }
}
