package myexercises.hangman;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = wordList();
        Random random = new Random();
        String answer = words.get(random.nextInt(0, words.size()));
        answer = answer.toLowerCase();
        char[] actually = new char[answer.length()];
        char userAnswer;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < answer.length(); i++) {
            actually[i] = '_';
        }

        while (!String.valueOf(actually).trim().equalsIgnoreCase(answer)) {

            System.out.println("Word: " + String.valueOf(actually));
            System.out.print("Guess a letter:");
            String verification = scanner.next().toLowerCase();

            if (verification.length() != 1) {
                System.out.println("Please insert only one character.");
                continue;
            }

            userAnswer = verification.charAt(0);
            int[] answerIndex = getIndex(answer, userAnswer);
            if (answerIndex == null) {
                System.out.println("WRONG!");
                continue;
            }
            for (int i = 0; i < answerIndex.length; i++) {
                actually[answerIndex[i]] = answer.charAt(answerIndex[i]);
            }

            
        }
        System.out.printf("Congrats!!! You were Right!!! The word was: %s!\n", answer);
        scanner.close();
    }

    static ArrayList<String> wordList() {
        File file = new File("myexercises\\hangman\\words.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            ArrayList<String> list;
            list = new ArrayList<>();
            String read;
            while ((read = reader.readLine()) != null) {
                list.add(read);
            }
            return list;
        } catch (FileNotFoundException e) {
            System.out.println("File not Found!");
        } catch (IOException e) {
            System.out.println("Something went Wrong!");
        }
        ;

        return null;
    }

    static int[] getIndex(String answer, char userAnswer) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == userAnswer) {
                indices.add(i);
            }
        }
        if (indices.isEmpty()) {
            return null;
        }
        int[] values = new int[indices.size()];
        for (int i = 0; i < indices.size(); i++) {
            values[i] = indices.get(i);
        }
        return values;
    }
}
