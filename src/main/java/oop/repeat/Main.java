package oop.repeat;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Game terra = new Game("Terraformacja marsa", 10);
        Game catan = new Game("Catan", 7);
        Game splendor = new Game("Splendor", 5);
        
        Game[] games = {terra, catan, splendor};

        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i].description());
        }

        Meeting meeting1 = new Meeting("Retrospekcja sprintu", "Sala 11");
        Meeting meeting2 = new Meeting("Planowanie sprintu", "Sala 13");
        Meeting meeting3 = new Meeting("Zebranie zarządu", LocalDate.of(2022, 05, 16), "Sala 3", 8);

        Meeting[] meetings = {meeting1, meeting2, meeting3};

        for (int i = 0; i < meetings.length; i++) {
            System.out.println(meetings[i].description());
        }


    }

}
