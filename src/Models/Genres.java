package Models;

public enum Genres {
    ROCK("rock"),
    TRAP("trap"),
    JAZZ("jazz"),
    HIPHOP("hiphop"),
    POPMUSIC("POP"),
    METAL("METAL"),
    CLASICA("CLASICA");

    private String name;
    private Genres(String name){
        this.name=name;
    }
}
