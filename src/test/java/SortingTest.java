import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortingTest {

    private Sorting sorting;

    @BeforeEach
    void setUp() {
        sorting = new Sorting();
    }

    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
            "is2 sentence4 This1 a3|This is a sentence",
            "Myself2 Me1 I4 and3|Me Myself and I",
            "one1|one"
    })
    void sortSentence_1859(String shuffled, String expected) {
        assertEquals(expected, sorting.sortSentence_1859(shuffled));
    }

    @ParameterizedTest
    @CsvSource({"abcd, abcde, e", "'', y, y", "a, aa, a"})
    void findTheDifference_389(String s, String t, char expected) {
        assertEquals(expected, sorting.findTheDifference_389(s, t));
    }

    @Test
    void intersect_350_keepsDuplicates() {
        assertArrayEquals(new int[]{2, 2}, sorting.intersect_350(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
        assertArrayEquals(new int[]{4, 9}, sorting.intersect_350(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
        assertArrayEquals(new int[]{}, sorting.intersect_350(new int[]{1}, new int[]{}));
    }

    @Test
    void intersection_2248_valuesPresentInEveryArray() {
        assertEquals(List.of(3, 4), sorting.intersection_2248(new int[][]{{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}}));
        assertEquals(List.of(), sorting.intersection_2248(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }

    @Test
    void intersection_2248_supportsValuesUpTo1000() {
        assertEquals(List.of(10, 1000), sorting.intersection_2248(new int[][]{{10, 1000}, {1000, 10, 7}}));
    }

    @Test
    void findDifference_2215() {
        List<List<Integer>> result = sorting.findDifference_2215(new int[]{1, 2, 3}, new int[]{2, 4, 6});
        assertEquals(List.of(1, 3), result.get(0).stream().sorted().toList());
        assertEquals(List.of(4, 6), result.get(1).stream().sorted().toList());
    }

    @Test
    void findDifference_2215_identicalSets_bothEmpty() {
        List<List<Integer>> result = sorting.findDifference_2215(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2, 3});
        assertTrue(result.get(0).isEmpty());
        assertTrue(result.get(1).isEmpty());
    }

    @Test
    void findRelativeRanks_506() {
        assertArrayEquals(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"},
                sorting.findRelativeRanks_506(new int[]{10, 3, 8, 9, 4}));
        assertArrayEquals(new String[]{"Gold Medal"}, sorting.findRelativeRanks_506(new int[]{1}));
    }

    @Test
    void findRelativeRanks_506_doesNotReorderInput() {
        int[] score = {1, 2, 3};
        sorting.findRelativeRanks_506(score);
        assertArrayEquals(new int[]{1, 2, 3}, score);
    }

    @ParameterizedTest
    @CsvSource({"anagram, nagaram, true", "rat, car, false", "a, ab, false", "'', '', true"})
    void isAnagram_242(String s, String t, boolean expected) {
        assertEquals(expected, sorting.isAnagram_242(s, t));
    }

    @Test
    void isAnagram_242_nullInput_false() {
        assertFalse(sorting.isAnagram_242(null, "a"));
        assertFalse(sorting.isAnagram_242("a", null));
    }
}
