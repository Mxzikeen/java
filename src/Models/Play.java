package Models;

import java.util.ArrayList;

public interface Play {
    public  void play();
    public  void addSong(Song song);
    public  String deleteSong(String name);
    public  void showPlaylist();
}
