package broexercises;

import java.util.Scanner;

public class quizGame {
    public static void main(String[] args) {
        // JAVA QUIZ GAME

        //QUESTIONS array
        String[] questions = {"What is the main function of a router?", 
        "Which part of computer is considered the brain?", 
        "What year was Facebook lauched?", 
        "Who is known as the father of computers?", 
        "What was the first programming language?"};
        //OPTIONS ARRAY[[]]
        String[][] options = {{"1. Storing files", "2.Encrypting data", "3. Directing internet traffic", "4. Managing passwords"}, 
        {"1. CPU", "2. Hard Drive", "3. RAM", "4. GPU"}, 
        {"1.2000 ", "2. 2004", "3. 2006", "4. 2008"}, 
        {"1.Steve Jobs ", "2.Bill Gates", "3. Alan Turing", "4. Charles Bagging"},
        {"1. COBOL ", "2. C", "3. FoRTRAN", "4. Assembly"}
    };

        int[] answer = {3, 1, 2, 4, 3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("*****************************");
        //DECLARE VARIABLES
        for(int i = 0; i < questions.length; i++)
        {
            System.out.println(questions[i]);
            for(String option : options[i])
            {
                System.out.println(option);
            }
            System.out.print("Guess: ");
            guess = scanner.nextInt();
            if(guess == answer[i])
            {   
                System.out.println("*******");
                System.out.println(" Right! ");
                System.out.println("*******");
                score++;
            }

            else
            {
                System.out.println("*******");
                System.out.println(" Wrong! ");
                System.out.println("*******");
            }
        }
        
       
        System.out.printf("Your final score is: %d/5", score);
        scanner.close();
    }
}
