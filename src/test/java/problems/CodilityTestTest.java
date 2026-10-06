package problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CodilityTestTest {

    private final CodilityTest codility = new CodilityTest();

    @Test
    void solution_sortedArrayCoveringOneToK_true() {
        assertTrue(codility.solution(new int[]{1, 1, 2, 3, 3}, 3));
        assertTrue(codility.solution(new int[]{1}, 1));
    }

    @Test
    void solution_gapInSequence_false() {
        assertFalse(codility.solution(new int[]{1, 1, 3}, 2));
        assertFalse(codility.solution(new int[]{1, 3}, 3));
    }

    @Test
    void solution_doesNotStartAtOne_false() {
        assertFalse(codility.solution(new int[]{2, 3}, 3));
    }

    @Test
    void solution_doesNotEndAtK_false() {
        assertFalse(codility.solution(new int[]{1, 2}, 3));
    }

    @ParameterizedTest
    @CsvSource({"14, 19", "10, 11", "99, 9999"})
    void solution2_findsSmallestNumberWithDoubleDigitSum(int n, int expected) {
        assertEquals(expected, CodilityTest.solution2(n));
        assertEquals(2 * CodilityTest.getSum(n), CodilityTest.getSum(expected));
    }

    @ParameterizedTest
    @CsvSource({"0, 0", "7, 7", "123, 6", "9999, 36"})
    void getSum(int n, int expected) {
        assertEquals(expected, CodilityTest.getSum(n));
    }
}
