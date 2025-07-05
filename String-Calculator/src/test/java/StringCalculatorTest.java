import org.example.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest
{
    @Test
    void testEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("");
        assertEquals(0, result);  //This should pass
    }

    @Test
    void testSingleNumberReturnsItself() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("1");
        assertEquals(1, result);  // This should fail initially
    }
}
