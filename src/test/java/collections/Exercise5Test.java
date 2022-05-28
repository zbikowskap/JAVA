package collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class Exercise5Test {

    @Test
    void shouldRemoveDuplicates() {
        //given
        List<String> list = List.of("Ferrari", "Aston Martin", "Ferrari", "Red Bull", "Aston Martin");

        //when
        List<String> resultList = Exercise5.removeDuplicates(list);

        //then
        assertThat(resultList).doesNotHaveDuplicates();
    }

    @Test
    void shouldReturnEmptyList() {
        //given
        List<String> list = new ArrayList<>();

        //when
        List<String> resultList = Exercise5.removeDuplicates(list);

        //then
        assertThat(resultList).isEmpty();
    }

}
