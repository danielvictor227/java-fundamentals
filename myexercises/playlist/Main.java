package myexercises.playlist;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        print();
    }

    static void print() {
        int user = 0;
        ArrayList<Playlist> playlist = new ArrayList<>(); // A list of playlist
        ArrayList<Song> songs = new ArrayList<>(); // A list of Songs

        do {
            System.out.println();
            System.out.println("1) New Playlist");
            System.out.println("2) Add Music");
            System.out.println("3) List");
            System.out.println("4) Remove");
            System.out.println("5) Total");
            System.out.println("6) Longest");
            System.out.println("0) Exit");

            System.out.print("Select a option: ");
            user = scanner.nextInt();
            scanner.nextLine();
            switch (user) {
                case 1 -> {
                    System.out.print("Name your playlist: ");
                    String playlistName = scanner.nextLine();
                    playlist.add(new Playlist(playlistName));
                    System.out.println("Playlist criada com sucesso");
                }

                case 2 -> {
                    System.out.print("How many songs?: ");
                    int songQuantity = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 0; i < songQuantity; i++) {
                        songs.add(userSong());
                    }
                    songInPlaylist(songs, playlist, songQuantity);
                }

                case 3 -> {
                    Playlist select = playlistShow(playlist);
                    select.list();
                }

                case 4 -> {
                   
                    int selector = 0;
                    int userRemove = 0;
                    do {
                        System.out.println("1. Remove Playlists");
                        System.out.println("2. Remove Songs");
                        System.out.println("3. Remove Songs From Playlists");
                        System.out.println("0. Exit Remove Options");
                        userRemove = scanner.nextInt();
                        switch (userRemove) {
                            case 1 -> {
                                listPlaylist(playlist);
                                selector = scanner.nextInt();
                                System.out.print("Select a Playlist to remove: ");
                                playlist.remove(selector);
                                scanner.nextLine();
                            }
                            case 2 -> {
                                for (Song song : songs) {
                                    System.out.println(song);
                                }
                                selector = scanner.nextInt();
                                System.out.println("Select a Song to remove: ");
                                songs.remove(selector);
                                scanner.nextLine();
                                System.out.println("Remove with Successfully");
                            }
                            case 3 ->
                            {
                                Playlist tempPlaylist = playlistShow(playlist);
                                tempPlaylist.list();
                                selector = scanner.nextInt();
                                System.out.print("Select a Song to Remove: ");
                                tempPlaylist.remove(selector);
                            }
                            case 4 ->
                            {
                                System.out.println("Exiting...");
                                break;
                            }
                            default ->
                            {
                                System.out.println("Please insert a valid option");
                                continue;
                            }
                        }
                    } while (userRemove != 0);
                }
                case 5 -> {
                    Playlist tempPlaylist = playlistShow(playlist);
                    System.out.printf("Playlist: %s \nTotal Time: %s\n", tempPlaylist.getName(), tempPlaylist.totalDuration());
                    tempPlaylist.totalDuration();
                }

                case 6 -> {
                    Playlist tempPlaylist = playlistShow(playlist);
                    System.out.printf("The biggest song in the playlist %s is: \n%s\n", tempPlaylist.getName(), tempPlaylist.longest());
                }
            }
        } while (user != 0);

    }

    static void listSongs(ArrayList<Song> song, int songQuantity) {
        for (int i = 0; i < songQuantity; i++) {
            System.out.printf("%d. %s\n", i + 1, song.get(i));
        }
    }

    static Song userSong() {

        System.out.print("Add your song(title): ");
        String titleScan = scanner.nextLine();
        System.out.print("Artist: ");
        String artistScan = scanner.nextLine();
        System.out.print("Duration: ");
        int durationScan = scanner.nextInt();
        scanner.nextLine();
        return new Song(titleScan, artistScan, durationScan);
    }

    static Playlist playlistShow(ArrayList<Playlist> playlist) {
        int playlistname = 0;
        Boolean isvalid = false;
        listPlaylist(playlist);
        do {
            System.out.print("Select a playlist: ");
            playlistname = scanner.nextInt();
            scanner.nextLine();
            if (playlistname > playlist.size() || playlistname < 1) {
                System.out.println("Please select a valid number");
                isvalid = false;
            }
            isvalid = true;
        } while (isvalid == false);
        return playlist.get(playlistname - 1);

    }

    static void listPlaylist(ArrayList<Playlist> playlist) {
        for (int j = 0; j < playlist.size(); j++) // imprimir lista de playlist
        {
            System.out.printf("%d. %s\n", j + 1, playlist.get(j).getName());
        }
    }

    static void songInPlaylist(ArrayList<Song> songs, ArrayList<Playlist> playlist, int songQuantity) {
        int songSelect = 0;
        boolean playlistAdd = false;
        System.out.println("You want to put a song in playlist?(true or false): ");
        playlistAdd = scanner.nextBoolean();
        scanner.nextLine();
        if (playlistAdd == true) {
            Playlist playlistSelected = playlistShow(playlist);
            System.out.println("Playlist Selecionada: " + playlistSelected.getName());
            do {
                listSongs(songs, songQuantity);
                System.out.print("Select a song(0 to exit): ");
                songSelect = scanner.nextInt();
                if (songSelect != 0) {
                    playlistSelected.add(songs.get(songSelect - 1));
                }
                scanner.nextLine();
            } while (songSelect != 0);
        }
        return;
    }
}
