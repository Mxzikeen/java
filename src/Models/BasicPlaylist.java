package Models;

import java.util.Stack;

public class BasicPlaylist implements Play {
    private String name;
    Stack<Song> myList = new Stack<>();

    public BasicPlaylist() {
        super();
    }

    @Override
    public void play() {
        Stack<Song> myListaux = new Stack<>();
        Song aux;
        if (!myList.isEmpty()) {
            aux = myList.pop();
            System.out.println("Now playing: " + aux.getName());
            while (!myList.isEmpty()) {
                myListaux.push(myList.pop());
            }

            if (myList.isEmpty()) {
                myList.push(aux);
                while (!myListaux.isEmpty()) {
                    myList.push(myListaux.pop());
                }
            }
        } else {
            System.out.println("No hay canciones para reproducir");
        }


    }

    @Override
    public void addSong(Song song) {
        myList.push(song);
    }

    @Override
    public String deleteSong(String name) {

        return "Para acceder a estas opciones, compre el paquete PREMIUM";
    }

    @Override
    public void showPlaylist() {
        while(!myList.isEmpty()){
            System.out.println(myList.pop().getName());
        }
    }

    public void changeSong() {
        System.out.println("Para acceder a estas opciones, compre el paquete PREMIUM");
    }
}
