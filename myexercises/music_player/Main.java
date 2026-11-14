package myexercises.music_player;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char user = 'q';
        String ozzyPath = "myexercises\\music_player\\ozzy.wav";
        File file = new File(ozzyPath);
        Clip clip = readingFile(file);
        do{
          
            System.out.println("Select a function!");
            System.out.println("P: Play Music");
            System.out.println("S: Stop");
            System.out.println("R: Reset");
            System.out.println("Q: Quit");
            System.out.print("Select: ");
            user = scanner.next().toLowerCase().charAt(0);
            switch(user)
                {
                    case 'p' -> {
                        clip.start();
                        continue;
                    }
                    case 's' ->
                    {
                        clip.stop();
                        continue;
                    }
                    case 'r' ->
                    {
                        clip.setMicrosecondPosition(0);
                        continue;
                    }
                    case 'q' ->
                    {
                        System.out.println("Quiting...");
                    }
                    
                    default -> 
                    {
                        System.out.println("Please Insert a valid character");
                        continue;
                    }
                }
        }while(user != 'q');
        scanner.close();
    }

    static Clip readingFile(File file)
    {
        
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file))
        {
            try {
                 Clip clip = AudioSystem.getClip();
                 clip.open(audioStream);
                 return clip;
            } catch (Exception e) {
                System.out.println("The clip was not been created");
            }
            
          
        }
        catch(UnsupportedAudioFileException e)
        {
            System.out.println("Fail at reading the file");
        }
        catch(IOException e)
        {
            System.err.println(e.getMessage());
            System.out.println("Something went Wrong!");
        }
        return null;
    }
}
