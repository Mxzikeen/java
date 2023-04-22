package Models;



public class Song {
    private String name;
    private String lenght;
    private Genres genre;
    private Album album;

    public Song() {
    }

    private String invitedArtist;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLenght() {
        return lenght;
    }

    public void setLenght(String lenght) {
        this.lenght = lenght;
    }

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public String getInvitedArtist() {
        return invitedArtist;
    }

    public void setInvitedArtist(String invitedArtist) {
        this.invitedArtist = invitedArtist;
    }

    public Song(String name, String lenght, Genres genre, Album album, String invitedArtist) {
        this.name = name;
        this.lenght = lenght;
        this.genre = genre;
        this.album = album;
        this.invitedArtist = invitedArtist;

    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", lenght='" + lenght + '\'' +
                ", genre=" + genre +
                ", album=" + album +
                ", invitedArtist='" + invitedArtist + '\'' +
                '}';
    }
}
