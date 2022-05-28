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

    @Test
    void shouldCalculateRectangleCircuit() {
        //given
        GeometricCalculator geometricCalculator = new GeometricCalculator();

        //when
        double result = geometricCalculator.calculateRectangleCircuit(5, 2);

        //then
        assertEquals(14, result);
    }

}
