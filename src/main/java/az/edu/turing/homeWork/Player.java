package az.edu.turing.homeWork;

public class Player {
    private int id;
    private String name;
    private int age;
    private double score;
    private boolean isFemale;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public boolean isFemale() {
        return isFemale;
    }

    public void setFemale(boolean female) {
        isFemale = female;
    }

    public Player(int id, String name, int age, double score, boolean isFemale) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.score = score;
        this.isFemale = isFemale;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                ", isFemale=" + isFemale +
                '}';
    }
}
