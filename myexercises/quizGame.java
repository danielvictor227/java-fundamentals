package myexercises;

import java.util.Scanner;

public class quizGame {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("**************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("**************************");
        System.out.printf("You make %d/5 right!\n", print());
    }

    static int print() {
        String[] questions = { "What is the main function of a router?", "What year was Facebook lauched?",
                "Which par of the computer is considered the brain?",
                "Who is know as father of computers?", "What was the first programming language?" };

        String[][] alternatives = {
                { "1. Storing Files", "2. Encrypting data", "3. Directing internet traffic", "4. Managing passwords" },
                { "1. 2000", "2. 2004", "3. 2006", "4. 2010" },
                { "1. CPU", "2. Har Drive", "3. RAM", "4. GPU" },
                { "1. Steve Jobs", "2. Bill Gates", "3. Alan Turing", "4. Charles Babbage" },
                { "1. COBOL", "2. C", "3. Fortran", "4. Assembly" }
        };
        int[] answer = { 3, 2, 1, 4, 3 };
        int userinput;
        int rightCounter = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.printf("%s\n", questions[i]);
            do {
                for (int j = 0; j < alternatives[i].length; j++) {
                    System.out.printf("%s\n", alternatives[i][j]);
                }
                System.out.printf("Guess: ");
                userinput = scanner.nextInt();
            } while (userinput > alternatives[i].length || userinput <= 0);

            if (userinput == answer[i]) {
                System.out.println("Right!");
                rightCounter++;
            } else {
                System.out.println("Wrong!");
            }
        }
        return rightCounter;
    }
}
