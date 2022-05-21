import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void shouldAdd1and10() {
        assertEquals(11, calculator.add(1, 10));
    }

    @Test
    public void shouldAdd1and20() {
        assertEquals(21, calculator.add(1, 20));
    }

}
