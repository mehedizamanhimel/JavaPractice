package problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class MathProblemsTest {

    private final MathProblems math = new MathProblems();

    @ParameterizedTest
    @CsvSource({"12, 5, 17", "-10, 4, -6", "0, 0, 0"})
    void sum_2235(int a, int b, int expected) {
        assertEquals(expected, math.sum_2235(a, b));
    }

    @Test
    void sum_2235_overflow_throws() {
        assertThrows(ArithmeticException.class, () -> math.sum_2235(Integer.MAX_VALUE, 1));
    }

    @ParameterizedTest
    @CsvSource({"III, 3", "IV, 4", "IX, 9", "LVIII, 58", "MCMXCIV, 1994", "MMMCMXCIX, 3999", "'', 0"})
    void romanToInt(String roman, int expected) {
        assertEquals(expected, math.romanToInt(roman));
    }
}
