package problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testsupport.ConsoleCapture;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ConsoleCapture.class)
class FibonacciTest {

    @Test
    void fiboTwo_printsFirstTenFibonacciNumbers(ConsoleCapture console) {
        new Fibonacci().fiboTwo();
        assertEquals(List.of("0  1", "1", "2", "3", "5", "8", "13", "21", "34"), console.lines());
    }

    @Test
    void fiboOne_printsOddSequence(ConsoleCapture console) {
        // fiboOne prints i + (i - 1), not Fibonacci numbers
        new Fibonacci().fiboOne();
        assertEquals(List.of("-1", "1", "3", "5", "7", "9", "11", "13", "15", "17"), console.lines());
    }
}
