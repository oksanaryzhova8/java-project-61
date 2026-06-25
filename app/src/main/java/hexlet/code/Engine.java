package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int GAME_DATA_SIZE = 2;

    private static final int QUESTION_INDEX = 0;
    private static final int ANSWER_INDEX = 1;

    public static void run(String rules, String[][] gameData) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String userName = scanner.nextLine();

            System.out.println("Hello, " + userName + "!");
            System.out.println(rules);

            for (int round = 0; round < ROUNDS_COUNT; round++) {
                String question = gameData[round][QUESTION_INDEX];
                String correctAnswer = gameData[round][ANSWER_INDEX];

                System.out.println("Question: " + question);
                System.out.print("Your answer: ");
                String userAnswer = scanner.nextLine();

                if (!userAnswer.equals(correctAnswer)) {
                    System.out.println(
                            "'" + userAnswer + "' is wrong answer ;(. "
                                    + "Correct answer was '"
                                    + correctAnswer + "'."
                    );
                    System.out.println("Let's try again, " + userName + "!");
                    return;
                }

                System.out.println("Correct!");
            }

            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
