package ConceptPractice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testsupport.ConsoleCapture;

import java.io.FileNotFoundException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ConsoleCapture.class)
class ConceptPracticeTest {

    @Test
    void commandPrint_withArgs_printsEachArg(ConsoleCapture console) {
        new CommandClass().commandPrint(new String[]{"a", "b"});
        assertEquals(List.of("The command line arguments are:", "a", "b"), console.lines());
    }

    @Test
    void commandPrint_noArgs(ConsoleCapture console) {
        new CommandClass().commandPrint(new String[]{});
        assertEquals("No command line arguments found.", console.output().trim());
    }

    @Test
    void ifStatement_marriageRules_boy20Girl18(ConsoleCapture console) {
        new ConditionalStatement().ifStatement_marriageRules();
        assertEquals("Only girl is eligible for marriage. Not the boy", console.output().trim());
    }

    @Test
    void nestedIfStatement_age12(ConsoleCapture console) {
        new ConditionalStatement().NestedIfStatement();
        assertEquals(List.of("you are not young", "you are not only young but also teenager"), console.lines());
    }

    @Test
    void fileSystem_emptyPath_throwsFileNotFound() {
        // every FileSystem method opens new File(""), which can never be read
        FileSystem fs = new FileSystem();
        assertThrows(FileNotFoundException.class, fs::creatFile);
        assertThrows(FileNotFoundException.class, fs::deleteFile);
        assertThrows(FileNotFoundException.class, fs::openFile);
        assertThrows(FileNotFoundException.class, fs::sortFile);
    }

    @Test
    void demoClasses_runWithoutThrowing() {
        assertAll(
                () -> assertDoesNotThrow(() -> new ConditionalOperator().testing_Conditional_Operator()),
                () -> assertDoesNotThrow(() -> new DataTypes().byteMethod()),
                () -> assertDoesNotThrow(() -> new DataTypes().allDataTypes()),
                () -> assertDoesNotThrow(() -> new Operators().incrementMethod()),
                () -> assertDoesNotThrow(() -> new Variables().variableOne()));
    }
}
