import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** String-oriented methods of {@link ArrayTasks}. */
class ArrayTasksStringsTest {

    private ArrayTasks tasks;

    @BeforeEach
    void setUp() {
        tasks = new ArrayTasks();
    }

    @ParameterizedTest
    @CsvSource({
            "abbcccddddeeeeedcba, 5",
            "leetcode, 2",
            "a, 1",
            "abc, 1"
    })
    void maxPower(String s, int expected) {
        assertEquals(expected, tasks.maxPower(s));
    }

    @ParameterizedTest
    @CsvSource({
            "1101, true",
            "111000, false",
            "110100010, false"
    })
    void checkZeroOnes(String s, boolean expected) {
        assertEquals(expected, tasks.checkZeroOnes(s));
    }

    @ParameterizedTest
    @CsvSource({
            "1001, false",
            "110, true",
            "1, true"
    })
    void checkOnesSegment(String s, boolean expected) {
        assertEquals(expected, tasks.checkOnesSegment(s));
    }

    @Test
    void longestCommonPrefix() {
        assertEquals("fl", tasks.longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        assertEquals("", tasks.longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        assertEquals("solo", tasks.longestCommonPrefix(new String[]{"solo"}));
    }

    @Test
    void mostWordsFound() {
        assertEquals(6, tasks.mostWordsFound(new String[]{
                "alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
            "cat and  dog|3",
            "!this  1-s b8d!|0",
            "alice and  bob are playing stone-game10|5",
            "he bought 2 pencils, 3 erasers, and 1  pencil-sharpener.|6",
            "a-b-c d|1",
            "' '|0"
    })
    void countValidWords(String sentence, int expected) {
        assertEquals(expected, tasks.countValidWords(sentence));
    }

    @Test
    void commonChars() {
        assertEquals(List.of("e", "l", "l"), tasks.commonChars(new String[]{"bella", "label", "roller"}));
        assertEquals(List.of("c", "o"), tasks.commonChars(new String[]{"cool", "lock", "cook"}));
        assertEquals(List.of(), tasks.commonChars(new String[]{}));
    }

    @ParameterizedTest
    @CsvSource({
            "ABCABC, ABC, ABC",
            "ABABAB, ABAB, AB",
            "LEET, CODE, ''"
    })
    void gcdOfStrings_1071(String a, String b, String expected) {
        assertEquals(expected, tasks.gcdOfStrings_1071(a, b));
    }

    @ParameterizedTest
    @CsvSource({
            "abcabcbb, 3",
            "bbbbb, 1",
            "pwwkew, 3",
            "'', 0",
            "a, 1",
            "dvdf, 3"
    })
    void lengthOfLongestSubstring(String s, int expected) {
        assertEquals(expected, tasks.lengthOfLongestSubstring(s));
    }

    @ParameterizedTest
    @CsvSource({
            "sadbutsad, sad, 0",
            "leetcode, leeto, -1",
            "hello, ll, 2",
            "a, b, -1",
            "a, a, 0"
    })
    void strStr(String haystack, String needle, int expected) {
        assertEquals(expected, tasks.strStr(haystack, needle));
    }

    @ParameterizedTest
    @CsvSource({
            "11, 1, 100",
            "1010, 1011, 10101",
            "0, 0, 0",
            // longer than an int: must not overflow
            "11111111111111111111111111111111111111, 1, 100000000000000000000000000000000000000"
    })
    void addBinary_67(String a, String b, String expected) {
        assertEquals(expected, tasks.addBinary_67(a, b));
    }

    @Test
    void longestPalindrome() {
        // both are valid answers for LeetCode 5
        assertTrue(List.of("bab", "aba").contains(tasks.longestPalindrome("babad")));
        assertEquals("bb", tasks.longestPalindrome("cbbd"));
        assertEquals("a", tasks.longestPalindrome("a"));
        assertEquals("", tasks.longestPalindrome(""));
        assertEquals("", tasks.longestPalindrome(null));
    }

    @ParameterizedTest
    @CsvSource({
            "aba, true",
            "abca, true",
            "abc, false",
            "'', true"
    })
    void validPalindrome_680(String s, boolean expected) {
        assertEquals(expected, tasks.validPalindrome_680(s));
    }

    @ParameterizedTest
    @CsvSource({
            "'()', true",
            "'()[]{}', true",
            "'(]', false",
            "'([)]', false",
            "'{[]}', true",
            "'(', false",
            "')', false"
    })
    void isValid_20(String s, boolean expected) {
        assertEquals(expected, tasks.isValid_20(s));
    }

    @ParameterizedTest
    @CsvSource({
            "abc, ahbgdc, true",
            "axc, ahbgdc, false",
            "'', abc, true"
    })
    void isSubsequence_392(String s, String t, boolean expected) {
        assertEquals(expected, tasks.isSubsequence_392(s, t));
    }

    @Test
    void numMatchingSubseq_792() {
        assertEquals(3, tasks.numMatchingSubseq_792("abcde", new String[]{"a", "bb", "acd", "ace"}));
        assertEquals(2, tasks.numMatchingSubseq_792("dsahjpjauf",
                new String[]{"ahjpjau", "ja", "ahbwzgqnuk", "tnmlanowax"}));
    }

    @Test
    void findRestaurant_599() {
        assertArrayEquals(new String[]{"Shogun"}, tasks.findRestaurant_599(
                new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"},
                new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"}));
        assertArrayEquals(new String[]{"sad", "happy"}, tasks.findRestaurant_599(
                new String[]{"happy", "sad", "good"},
                new String[]{"sad", "happy", "good"}));
        assertArrayEquals(new String[]{}, tasks.findRestaurant_599(new String[]{"a"}, new String[]{"b"}));
    }
}
