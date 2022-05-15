package oop.repeat;

public class Main {

    public static void main(String[] args) {

        Game terra = new Game("Terraformacja marsa", 10);
        Game catan = new Game("Catan", 7);
        Game splendor = new Game("Splendor", 5);
        
        Game[] games = {terra, catan, splendor};

        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i].description());
        }

    }

}
