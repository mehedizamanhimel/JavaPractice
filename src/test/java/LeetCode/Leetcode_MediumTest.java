package LeetCode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Leetcode_MediumTest {

    @ParameterizedTest(name = "reverse({0}) = {1}")
    @CsvSource({
            "123, 321",
            "-123, -321",
            "120, 21",
            "0, 0",
            "1534236469, 0",      // reversed value overflows int
            "-2147483648, 0",     // Integer.MIN_VALUE
            "2147483647, 0",      // Integer.MAX_VALUE
            "1463847412, 2147483641"
    })
    void reverse_007(int x, int expected) {
        assertEquals(expected, new Leetcode_Medium().reverse_007(x));
    }
}
