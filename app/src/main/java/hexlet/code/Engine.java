package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void run(Scanner scanner,
                           String rules,
                           String[] questions,
                           String[] correctAnswers
    ) {

        Cli.greet(scanner);

        String name = Cli.name;

        System.out.println(rules);

        for (int round = 0; round < ROUNDS_COUNT; round++) {
            System.out.println("Question: " + questions[round]);
            System.out.print("Your answer: ");

            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswers[round])) {
                System.out.println(
                        "'" + userAnswer + "' is wrong answer ;(. "
                                + "Correct answer was '"
                                + correctAnswers[round] + "'."
                );
                System.out.println("Let's try again, " + name + "!");
                return;
            }

            System.out.println("Correct!");
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
