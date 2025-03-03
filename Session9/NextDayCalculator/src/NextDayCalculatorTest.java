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
    }

    @Test
    @DisplayName("31/1/2018")
    public void testDay31Month1Year2018() {
        int day = 31;
        int month = 1;
        int year = 2018;
        String expected = "1/2/2018";
        String actual = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("30/4/2018")
    public void testDay30Month4Year2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        String expected = "1/5/2018";
        String actual = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("28/2/2018")
    public void testDay28Month02Year2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        String expected = "1/3/2018";
        String actual = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("29/2/2020")
    public void testDay29Month02Year2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        String expected = "1/3/2020";
        String actual = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, actual);
    }
    @Test
    @DisplayName("31/12/2018")
    public void testDay31Month12Year2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        String expected = "1/1/2019";
        String actual = NextDayCalculator.nextDay(day, month, year);
        assertEquals(expected, actual);
    }
}