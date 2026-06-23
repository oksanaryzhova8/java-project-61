package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.util.Random;

public class Progression {
    private static final String RULES =
            "What number is missing in the progression?";

    private static final int PROGRESSION_LENGTH = 10;
    private static final int START_BOUND = 9;
    private static final int STEP_BOUND = 10;

    public static void missing(Scanner scanner) {
        Random random = new Random();

        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] correctAnswers = new String[Engine.ROUNDS_COUNT];

        for (int round = 0; round < Engine.ROUNDS_COUNT; round++) {
            int start = random.nextInt(START_BOUND);
            int step = random.nextInt(STEP_BOUND);

            int[] progression = createProgression(start, step);

            int hiddenIndex = random.nextInt(PROGRESSION_LENGTH);

            questions[round] = createQuestion(progression, hiddenIndex);

            correctAnswers[round] = String.valueOf(progression[hiddenIndex]);
        }

        Engine.run(scanner, RULES, questions, correctAnswers);

    }

    private static int[] createProgression(int start, int step) {
        int[] progression = new int[PROGRESSION_LENGTH];

        for (int index = 0; index < PROGRESSION_LENGTH; index++) {
            progression[index] = start + index * step;
        }

        return progression;
    }

    private static String createQuestion(int[] progression, int hiddenIndex) {
        StringBuilder question = new StringBuilder();

        for (int index = 0; index < progression.length; index++) {
            if (index == hiddenIndex) {
                question.append("..");
            } else {
                question.append(progression[index]);
            }

            if (index < progression.length - 1) {
                question.append(" ");
            }
        }

        return question.toString();
    }
}
