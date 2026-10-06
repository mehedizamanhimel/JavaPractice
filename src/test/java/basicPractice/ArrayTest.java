package basicPractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testsupport.ConsoleCapture;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ConsoleCapture.class)
class ArrayTest {

    private final Array array = new Array();

    @Test
    void array_firstMethod_addsFiveToEachElementInPlace() {
        int[] input = {1, -5, 0};
        int[] result = array.array_firstMethod(input);
        assertArrayEquals(new int[]{6, 0, 5}, result);
        assertSame(input, result);
    }

    @Test
    void array_firstMethod_empty() {
        assertArrayEquals(new int[]{}, array.array_firstMethod(new int[]{}));
    }

    @Test
    void array_multi_dimension_returnsSameArrayAndPrintsTable(ConsoleCapture console) {
        int[][] grid = {{1, 2}, {3, 4}};
        assertSame(grid, array.array_multi_dimension(grid));
        assertEquals(List.of("1 \t2 \t", "3 \t4 \t"), console.lines());
    }

    @Test
    void printresult_printsEachValuePlusFive(ConsoleCapture console) {
        array.printresult(new int[]{1, 2});
        assertEquals(List.of("6", "7"), console.lines());
    }

    @Test
    void array_basic_printsSortedArray(ConsoleCapture console) {
        array.array_basic();
        assertEquals("[1, 2, 3, 4, 5]", console.output());
    }

    @Test
    void accessTheArray_printsRowsTabSeparated(ConsoleCapture console) {
        array.accessTheArray(new int[][]{{5, 5}, {6, 6}});
        assertEquals(List.of("5\t5\t", "6\t6\t"), console.lines());
    }
}
