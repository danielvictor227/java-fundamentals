package myexercises.playlist;
import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private int durationSeconds;
    private ArrayList<Integer> ratingList  = new ArrayList<>();

    Song(String title, String artist, int durationSeconds) {
        this.title = title;
        this.artist = artist;
        this.durationSeconds = durationSeconds;
    }

   static String formater(int durationSeconds) {
        String formater = String.format("%02d:%02d", durationSeconds / 60, durationSeconds % 60);
        return formater;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }
    void addRating(int rating)
    {
        if(rating > 5 || rating < 1)
        {
            System.out.println("Invalid Rating");
        }
        else
        {
            ratingList.add(rating);
        }
    }

    double averageRating()
    {
        double total = 0;
        if(ratingList.isEmpty())
        {
            return 0;
        }
        for(double t : ratingList)
        {
            total += t;
        }
        return total / ratingList.size();
        
    }
    @Override
    public String toString() {
        return this.title + " - " + this.artist + " - " + "(" + formater(this.durationSeconds) + ")";
    }
}
