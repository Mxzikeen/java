package Models;

public class Album {
    private String releaseDate;
    private String title;
    private Artist artist;

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Album(String releaseDate, String title, Artist artist) {
        this.releaseDate = releaseDate;
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Album{" + "releaseDate='" + releaseDate + '\'' + ", title='" + title + '\'' + ", artist=" + artist + '}';
    }
}
