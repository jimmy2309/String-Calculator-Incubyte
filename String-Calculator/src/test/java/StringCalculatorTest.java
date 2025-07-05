import org.example.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest
{
    @Test
    void testEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("");
        assertEquals(0, result);
    }

    @Test
    void testSingleNumberReturnsItself() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("1");
        assertEquals(1, result);
    }

    @Test
    void testTwoNumbersReturnsSum() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("1,2");
        System.out.println(result);
        assertEquals(3, result);
    }

    @Test
    void testMultipleNumbersReturnsSum() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("1,2,3,4");
        System.out.println(result);
        assertEquals(10, result);
    }

    @Test
    void testNewlineAsDelimiter() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("1\n2,3");
        System.out.println(result);
        assertEquals(6, result);
    }


}
