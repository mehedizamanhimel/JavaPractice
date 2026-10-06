import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the project's own {@code List} class. This file must not import {@code java.util.List}:
 * that import would hide the default-package class, which cannot be referenced any other way.
 */
class ListClassTest {

    @Test
    void returnBoth_sumProductAndDivision() {
        HashMap<String, Integer> result = new List<String>().returnBoth(1, 2, 3, 4);
        assertEquals(10, result.get("Summetion"));
        assertEquals(24, result.get("Multiplication"));
        assertEquals(2, result.get("Division"));
    }

    @Test
    void returnBoth_bZero_throws() {
        assertThrows(ArithmeticException.class, () -> new List<String>().returnBoth(1, 0, 3, 4));
    }
}
