package oop.repeat;

public class Game {

    private String name;
    private int ageLimit;

    public Game(String name, int ageLimit) {
        this.name = name;
        this.ageLimit = ageLimit;
    }

    public String getName() {
        return name;
    }

    public int getAgeLimit() {
        return ageLimit;
    }

    public String description() {
        return "Gra " + name + " z limitem wieku: " + ageLimit;
    }

}
