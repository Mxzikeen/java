package Models;

public class Artist {
    private String name;
    private String age;
    private String nacionality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNacionality() {
        return nacionality;
    }

    public void setNacionality(String nacionality) {
        this.nacionality = nacionality;
    }

    public Artist(String name, String age, String nacionality) {
        this.name = name;
        this.age = age;
        this.nacionality = nacionality;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nacionality='" + nacionality + '\'' +
                '}';
    }
}
