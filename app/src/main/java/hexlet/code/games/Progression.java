package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final String RULES =
            "What number is missing in the progression?";

    private static final int PROGRESSION_LENGTH = 10;
    private static final int START_BOUND = 9;
    private static final int STEP_BOUND = 10;

    public static void missing() {
        Random random = new Random();

        String[][] gameData =
                new String[Engine.ROUNDS_COUNT][Engine.GAME_DATA_SIZE];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int start = random.nextInt(START_BOUND);
            int step = random.nextInt(STEP_BOUND);

            String[] progression = createProgression(start, step);

            int hiddenIndex = random.nextInt(progression.length);

            String correctAnswer = progression[hiddenIndex];
            progression[hiddenIndex] = "..";

            gameData[round][0] = String.join(" ", progression);
            gameData[round][1] = correctAnswer;
        }

        Engine.run(RULES, gameData);

    }

    private static String[] createProgression(int start, int step) {
        String[] progression = new String[PROGRESSION_LENGTH];

        for (int index = 0; index < progression.length; index++) {
            progression[index] =  String.valueOf(start + index * step);
        }

        return progression;
    }
}
