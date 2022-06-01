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

    public List<Room> findByM2(double from, double to) {
        return this.rooms.stream()
                .filter(room -> room.getM2() >= from && room.getM2() <= to)
                .collect(Collectors.toList());
    }

    public List<Double> getAllPrices() {
        return this.rooms.stream()
                .map(room -> room.getPrice())
                .collect(Collectors.toList());
    }

}
