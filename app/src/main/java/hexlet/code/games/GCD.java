package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final String RULES =
            "Find the greatest common divisor of given numbers.";

    public static void find() {
        Random random = new Random();

        String[][] gameData =
                new String[Engine.ROUNDS_COUNT][Engine.GAME_DATA_SIZE];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int firstNumber = random.nextInt();
            int secondNumber = random.nextInt();

            gameData[round][0] =
                    firstNumber + " " + secondNumber;

            int result = findGcd(firstNumber, secondNumber);
            gameData[round][1] = String.valueOf(result);
        }

        Engine.run(RULES, gameData);
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





