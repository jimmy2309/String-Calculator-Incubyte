import org.example.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    void testCustomDelimiterSupport() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("//;\n1;2");
        System.out.println(result);
        assertEquals(3, result); // should fail initially
    }

    @Test
    void testNegativeNumberThrowsException() {
        StringCalculator calc = new StringCalculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calc.Add("1,-2,3");
        });
        System.out.println(exception.getMessage());
        assertTrue(exception.getMessage().contains("negatives not allowed"));
    }

    @Test
    void testIgnoreNumbersGreaterThan1000() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("2,1001");
        System.out.println(result);
        assertEquals(2, result);
    }

    @Test
    void testCustomDelimiterWithAnyLength() {
        StringCalculator calc = new StringCalculator();
        int result = calc.Add("//[***]\n1***2***3");
        System.out.println(result);
        assertEquals(6, result);
    }


}
