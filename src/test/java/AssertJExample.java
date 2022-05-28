import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJExample {

    @Test
    void test() {
        String text = "napis";

        assertThat(text).isEqualToIgnoringCase("NAPIS");
    }

    @Test
    void test2() {
        List<Integer> list = List.of(1, 5, 10, 15);

        assertThat(list).contains(5, 10);
        assertThat(list).containsAnyOf(100, 1, 2000);
        assertThat(list).containsExactly(1, 5, 10, 15);
        assertThat(list).containsExactlyInAnyOrder(5, 10, 1, 15);
    }

}
