import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testsupport.ConsoleCapture;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ConsoleCapture.class)
class ReverseStringTest {

    private reverseString reverser;

    @BeforeEach
    void setUp() {
        reverser = new reverseString();
    }

    @ParameterizedTest
    @CsvSource({"hello, olleh", "a, a", "'', ''", "ab cd, dc ba"})
    void allStringReversersAgree(String input, String expected) {
        assertEquals(expected, reverser.reverString(input));
        assertEquals(expected, reverser.reverseStringTwo(input));
        assertEquals(expected, reverser.reverseByStringBuffer(input).toString());
    }

    @Test
    void reverString_doesNotReadStdin(ConsoleCapture console) {
        console.provideInput("this must be ignored\n");
        assertEquals("cba", reverser.reverString("abc"));
    }

    @Test
    void reverseString_344_reversesInPlace() {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverser.reverseString_344(s);
        assertArrayEquals(new char[]{'o', 'l', 'l', 'e', 'h'}, s);
    }

    @Test
    void reverseString_344_evenLengthAndEmpty() {
        char[] even = {'H', 'a', 'n', 'n', 'a', 'h'};
        reverser.reverseString_344(even);
        assertArrayEquals("hannaH".toCharArray(), even);

        char[] empty = {};
        reverser.reverseString_344(empty);
        assertEquals(0, empty.length);
    }

    @ParameterizedTest
    @CsvSource({"123, 321", "120, 21", "-45, -54", "0, 0"})
    void reverseInt_and_reverseIntTwo_printSameResult(int input, String expected, ConsoleCapture console) {
        reverser.reverseInt(input);
        assertEquals(expected, console.output().trim());

        console.reset();
        reverser.reverseIntTwo(input);
        assertEquals(expected, console.output().trim());
    }

    @Test
    void reverseMethod_printsReversed(ConsoleCapture console) {
        reverser.reverseMethod("java");
        assertEquals("avaj", console.output().trim());
    }

    @Test
    void reverStringWithScanner_reversesStdinLine(ConsoleCapture console) {
        console.provideInput("12345\n");
        reverser.reverStringWithScanner();
        assertEquals(java.util.List.of("Enter the number: ", "The result is: 54321"), console.lines());
    }
}
