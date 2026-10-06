import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testsupport.ConsoleCapture;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ConsoleCapture.class)
class StringOperationsTest {

    private StringOperations ops;

    @BeforeEach
    void setUp() {
        ops = new StringOperations();
    }

    @Test
    void removeSubstring2_returnsWordsThatAppearInsideOtherWords() {
        assertEquals(List.of("as", "hero"), ops.removeSubstring2(new String[]{"mass", "as", "hero", "superhero"}));
        assertEquals(List.of(), ops.removeSubstring2(new String[]{"blue", "green", "bu"}));
    }

    @Test
    void arrayStringsAreEqual() {
        assertTrue(ops.arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));
        assertFalse(ops.arrayStringsAreEqual(new String[]{"a", "cb"}, new String[]{"ab", "c"}));
        assertTrue(ops.arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
        assertFalse(ops.arrayStringsAreEqual(new String[]{"abc"}, new String[]{"ab"}));
        assertTrue(ops.arrayStringsAreEqual(new String[]{""}, new String[]{""}));
    }

    @Test
    void restoreString_bothImplementationsAgree() {
        int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
        assertEquals("leetcode", ops.restoreString("codeleet", indices));
        assertEquals("leetcode", ops.restoreString2("codeleet", indices));
        assertEquals("abc", ops.restoreString("abc", new int[]{0, 1, 2}));
    }

    @ParameterizedTest
    @CsvSource({"abcde, cdeab, true", "abcde, abced, false", "'', '', true", "aa, a, false"})
    void rotateString_796(String s, String goal, boolean expected) {
        assertEquals(expected, ops.rotateString_796(s, goal));
    }

    @ParameterizedTest
    @CsvSource({"abab, true", "aba, false", "abcabcabcabc, true", "a, false", "aa, true"})
    void repeatedSubstringPattern_459(String s, boolean expected) {
        assertEquals(expected, ops.repeatedSubstringPattern_459(s));
    }

    @Test
    void countWords_printsTokenCount(ConsoleCapture console) {
        ops.CountWords();
        assertEquals("the total word count is: 5", console.output().trim());
    }
}
