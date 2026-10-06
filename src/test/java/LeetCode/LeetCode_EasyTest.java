package LeetCode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LeetCode_EasyTest {

    private LeetCode_Easy easy;

    @BeforeEach
    void setUp() {
        easy = new LeetCode_Easy();
    }

    @Test
    void merge_88_bothVersions_mergeIntoNums1() {
        int[] a = {1, 2, 3, 0, 0, 0};
        easy.merge_88(a, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, a);

        int[] b = {1, 2, 3, 0, 0, 0};
        easy.merge_88_V2(b, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, b);
    }

    @Test
    void merge_88_secondArrayEmpty_unchanged() {
        int[] a = {1};
        easy.merge_88(a, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, a);

        int[] b = {1};
        easy.merge_88_V2(b, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, b);
    }

    @Test
    void merge_88_firstArrayEmpty_copiesSecond() {
        int[] a = {0};
        easy.merge_88(a, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, a);

        int[] b = {0};
        easy.merge_88_V2(b, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, b);
    }

    @Test
    void merge_88_negativesAndDuplicates() {
        int[] a = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
        easy.merge_88(a, 6, new int[]{1, 2, 2}, 3);
        assertArrayEquals(new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3}, a);
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 3", "5, 8", "45, 1836311903"})
    void returnStairs_70(int n, int expected) {
        assertEquals(expected, easy.returnStairs_70(n));
    }

    @Test
    void fibonacci_runs() {
        assertDoesNotThrow(easy::fibonacci);
    }
}
