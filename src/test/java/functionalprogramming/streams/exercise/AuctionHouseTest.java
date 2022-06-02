package functionalprogramming.streams.exercise;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AuctionHouseTest {

    @Test
    void findByCity() {
        //given
        List<Room> list = List.of(
                new Room("Lublin", 10, 1000, 2),
                new Room("Warszawa", 15, 1400, 3),
                new Room("Warszawa", 15, 1400, 3),
                new Room("Gdynia", 11, 1200, 2.5),
                new Room("Gdynia", 16, 1100, 2.3)
        );
        AuctionHouse auctionHouse = new AuctionHouse(list);
        //when
        List<Room> result = auctionHouse.findByCity("Gdynia");
        //then
        assertThat(result).hasSize(2);
    }
}
