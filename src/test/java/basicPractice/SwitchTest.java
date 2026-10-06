package basicPractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testsupport.ConsoleCapture;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ConsoleCapture.class)
class SwitchTest {

    @ParameterizedTest
    @CsvSource({
            "1, One", "2, Two", "3, Three", "4, Four", "5, Five", "6, Six", "7, Seven",
            "0, case not found", "8, case not found", "-1, case not found"
    })
    void switchOne_printsWordForEveryCase(int value, String expected, ConsoleCapture console) {
        new Switch().switchOne(value);
        assertEquals(expected, console.output().trim());
    }

    @Test
    void switchStatement_printsCaseTwo(ConsoleCapture console) {
        new SwitchStatementClass().switchStatement();
        assertEquals("this is for case 2", console.output().trim());
    }
}
