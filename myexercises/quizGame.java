package myexercises;

import java.util.Scanner;

public class quizGame {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("**************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("**************************");
        
        
        for(int i = 0; i<print().length; i++)
        {
        System.out.print("Guess: ");
        int userInput = scanner.nextInt();
        }
    }
    static String[] print()
    {
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
       

        for(String question : questions)
        {
            System.out.println(question);
            for(String[] row : alternatives)
            {
                for(String alternative : row)
                {
                    System.out.println(alternative);
                }
            }
        }
        return questions;
    }
}
