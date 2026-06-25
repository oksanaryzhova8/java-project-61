package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String RULES =
            "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void given() {
        Random random = new Random();

        String[][] gameData =
                new String[Engine.ROUNDS_COUNT][Engine.GAME_DATA_SIZE];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int number = random.nextInt();

            gameData[round][0] = String.valueOf(number);
            gameData[round][1] = isPrime(number) ? "yes" : "no";
        }

        Engine.run(RULES, gameData);

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
