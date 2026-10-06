import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

/** Number-oriented methods of {@link ArrayTasks}. */
class ArrayTasksMathTest {

    private ArrayTasks tasks;

    @BeforeEach
    void setUp() {
        tasks = new ArrayTasks();
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "4, 10", "10, 55"})
    void testingALoop_sumsOneToN(int n, int expected) {
        assertEquals(expected, ArrayTasks.TestingALoop(n));
    }

    @Test
    void getSum() {
        assertEquals(3, tasks.getSum(1, 2));
        assertEquals(-1, tasks.getSum(2, -3));
    }

    @Test
    void getSum_overflow_throws() {
        // getSum calls Math.addExact first
        assertThrows(ArithmeticException.class, () -> tasks.getSum(Integer.MAX_VALUE, 1));
    }

    @Test
    void findGCD() {
        assertEquals(2, tasks.findGCD(new int[]{2, 5, 6, 9, 10}));
        assertEquals(1, tasks.findGCD(new int[]{7, 5, 6, 8, 3}));
        assertEquals(3, tasks.findGCD(new int[]{3, 3}));
        assertEquals(8, tasks.findGCD(new int[]{8}));
    }

    @Test
    void findval_isEuclidGcd() {
        assertEquals(6, tasks.findval(12, 18));
        assertEquals(5, tasks.findval(5, 0));
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "1, 1", "4, 2", "8, 2", "15, 3", "16, 4", "2147395599, 46339", "2147483647, 46340"})
    void mySqrt_69_and_sqroot_agree(int x, int expected) {
        assertEquals(expected, tasks.mySqrt_69(x));
        assertEquals(expected, tasks.sqroot(x));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 9, 25, 49, 121})
    void isThree_1952_primeSquares_true(int n) {
        assertTrue(tasks.isThree_1952(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 8, 16, 36, 100})
    void isThree_1952_others_false(int n) {
        assertFalse(tasks.isThree_1952(n));
    }

    @ParameterizedTest
    @CsvSource({"1, true", "4, true", "16, true", "64, true", "0, false", "2, false", "8, false", "5, false", "-4, false"})
    void isPowerOfFour_342(int n, boolean expected) {
        assertEquals(expected, tasks.isPowerOfFour_342(n));
    }

    @ParameterizedTest
    @CsvSource({"1, true", "2, true", "1024, true", "0, false", "3, false", "-2, false", "1073741824, true"})
    void isPowerOfTwo_231(int n, boolean expected) {
        assertEquals(expected, tasks.isPowerOfTwo_231(n));
    }

    @ParameterizedTest
    @CsvSource({"1, true", "27, true", "0, false", "-3, false", "45, false", "1162261467, true"})
    void isPowerOfThree_326_and_helper3_agree(int n, boolean expected) {
        assertEquals(expected, tasks.isPowerOfThree_326(n));
        assertEquals(expected, tasks.helper3(n));
    }

    @ParameterizedTest
    @CsvSource({"100, 202", "-7, -10", "0, 0", "6, 6", "7, 10"})
    void convertToBase7(int num, String expected) {
        assertEquals(expected, tasks.convertToBase7(num));
    }

    @ParameterizedTest
    @CsvSource({"1, false", "2, true", "3, false", "1000, true"})
    void divisorGame_1025(int n, boolean expected) {
        assertEquals(expected, tasks.divisorGame_1025(n));
    }

    @Test
    void sumOfFlooredPairs_1862() {
        assertEquals(10, tasks.sumOfFlooredPairs_1862(new int[]{2, 5, 9}));
        assertEquals(49, tasks.sumOfFlooredPairs_1862(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
