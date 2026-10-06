package problems;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testsupport.ConsoleCapture;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(ConsoleCapture.class)
class ScannerClassTest {

    @Test
    void initialScanner_Test_echoesFirstLine(ConsoleCapture console) {
        console.provideInput("hello world\nignored\n");
        new ScannerClass().initialScanner_Test();
        assertEquals("This is isss hello world", console.output().trim());
    }
}
