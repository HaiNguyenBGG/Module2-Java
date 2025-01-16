import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class NextDayCalculatorTest {
    @Test
    @DisplayName("1/1/2018")
    public void testDay1Month1Year2018() {
        int day = 1;
        int month = 1;
        int year = 2018;
        String expected = "2/1/2018";
        String actual = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, actual);
    }@Test
    @DisplayName("31/1/2018")
    public void testDay31Month1Year2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String actual = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, actual);
    }
}