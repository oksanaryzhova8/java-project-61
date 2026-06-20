package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static final int ROUNDS_COUNT = 3;

    public static void parityCheck() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Cli.greet();

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int round = 0; round < ROUNDS_COUNT; round++) {
            int number = random.nextInt();
            String correctAnswer = isEven(number) ? "Yes" : "No";

            System.out.println("Question: " + number);
            System.out.println("Your answer: ");

            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. "
                        + "Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's tru again, " + Cli.name + "!");
                return;
            }

            System.out.println("Correct!");

        }

        System.out.println("Congratulations, " + Cli.name + "!");

    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
