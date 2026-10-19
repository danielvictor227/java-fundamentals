package myexercises.playlist;

import java.util.ArrayList;

public class Playlist {
    private String name;
    ArrayList<Song> playlist = new ArrayList<>();

    Playlist(String name) {
        this.name = name;
    }

    void add(Song song) {
        playlist.add(song);
    }

    int getQuantity() {
        return playlist.size();
    }
    String getName()
    {
        return this.name;
    }
    void list() {
        if (playlist.isEmpty()) {
            System.out.println("The playlist is empty!");
        }
        System.out.println("Playlist: " + name);
        for (int i = 1; i <= playlist.size(); i++) {
            System.out.printf("%d. %s\n", i, playlist.get(i - 1));
        }
    }

    String totalDuration() {
        int total = 0;
        for (int i = 0; i < playlist.size(); i++) {
            total += playlist.get(i).getDurationSeconds();
        }

        return Song.formater(total);
    }

    Song longest() {
        Song longestSong = playlist.get(0);

        for (int i = 0; i < playlist.size(); i++) {
            if (playlist.isEmpty()) {
                System.out.println("Playlist Vazia!");
                break;
            }
            if (longestSong.getDurationSeconds() < playlist.get(i).getDurationSeconds()) {
                longestSong = playlist.get(i);
            }
        }

        return longestSong;
    }

    void remove(int position) {
        if (position < 1 || position > playlist.size()) {
            System.out.println("Position not valid");
        } else {
            System.out.printf("Removida: %s\n", playlist.remove(position - 1));
        }
    }

    boolean hasSong(String title) {
        boolean temp = false;

        for (int i = 0; i < playlist.size(); i++) {
            if (title.equalsIgnoreCase(playlist.get(i).getTitle())) {
                temp = true;
                System.out.println("Musica Encontrada: " + playlist.get(i).getTitle());
            }
        }
        if (temp == false) {
            System.out.println("Musica nao encontrada");
        }

        return temp;
    }
}
