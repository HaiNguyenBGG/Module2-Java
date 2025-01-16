import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class CaseAbsoluteTest {
    @Test
    @DisplayName("0")
    public void testCaseValue0() {
        int number = 0;
        int expected = 0;
        int result = CaseAbsolute.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("1")
    public void testCaseValue1() {
        int number = 1;
        int expected = 1;
        int result = CaseAbsolute.findAbsolute(number);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("-1")
    public void testCaseValue2() {
        int number = -1;
        int expected = 1;
        int result = CaseAbsolute.findAbsolute(number);
        assertEquals(expected, result);
    }
}