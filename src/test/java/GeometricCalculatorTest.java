import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GeometricCalculatorTest {

    @Test
    void shouldCalculateRectangleArea() {
        //given
        GeometricCalculator geometricCalculator = new GeometricCalculator();

        //when
        double result = geometricCalculator.calculateRectangleArea(4, 3);

        //then
        assertEquals(12, result);
    }

    //@Disabled - wylacza testy
    @Test
    @DisplayName("SHOULD_CALCULATE_RECTANGLE_CIRCUIT") //zmienia nazwe testu
    void shouldCalculateRectangleCircuit() {
        //given
        GeometricCalculator geometricCalculator = new GeometricCalculator();

        //when
        double result = geometricCalculator.calculateRectangleCircuit(5, 2);

        //then
        assertThat(result).isEqualTo(14);
    }

}
