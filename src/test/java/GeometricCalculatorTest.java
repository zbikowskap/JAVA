import org.junit.jupiter.api.Test;

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

}
