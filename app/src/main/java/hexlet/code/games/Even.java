package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void parityCheck() {
        Random random = new Random();

        String[][] gameData =
                new String[Engine.ROUNDS_COUNT][Engine.GAME_DATA_SIZE];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int number = random.nextInt();

            gameData[round][0] = String.valueOf(number);
            gameData[round][1] = isEven(number) ? "yes" : "no";
        }

        Engine.run(RULES, gameData);

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
