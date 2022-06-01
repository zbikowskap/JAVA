package functionalprogramming.streams.exercise;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Room> list = List.of(
                new Room("Lublin", 10, 1000, 2),
                new Room("Warszawa", 15, 1400, 3),
                new Room("Warszawa", 15, 1400, 3),
                new Room("Gdynia", 11, 1200, 2.5),
                new Room("Gdynia", 16, 1100, 2.3)
        );

        AuctionHouse auctionHouse = new AuctionHouse(list);

        List<Room> roomsByCity = auctionHouse.findByCity("Lublin");

        System.out.println(roomsByCity);
    }

}
