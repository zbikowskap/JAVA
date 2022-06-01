package functionalprogramming.streams.exercise;

import java.util.List;
import java.util.stream.Collectors;

public class AuctionHouse {

    private List<Room> rooms;

    public AuctionHouse(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Room> findByCity(String city) {
        return this.rooms.stream()
                .filter(room -> room.getCity().equals(city))
                .collect(Collectors.toList());
    }

}
