import Models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> arrList = new ArrayList<>();

        Artist artist1 = new Artist("Gustavo", "62", "Argentino");
        Album album1 = new Album("2023/04/20", "Gira", artist1);
        Song song1 = new Song("En la ciudad de la furia", "3:25", Genres.ROCK, album1, null);

        Artist artist2 = new Artist("MGK", "29", "Argentino");
        Album album2 = new Album("2023/04/20", "PUNCHI", artist2);
        Song song2 = new Song("Papercuts", "3:25", Genres.ROCK, album2, null);


        arrList.add(song1);
        System.out.println(song1);

        BasicPlaylist basic = new BasicPlaylist();
        basic.addSong(song1);
        basic.play();
        basic.changeSong();

        basic.addSong(song2);
        basic.play();
        basic.changeSong();

        basic.showPlaylist();
    }
}