package testsupport;

import org.junit.jupiter.api.extension.AfterEachCallback;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolver;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;

/**
 * JUnit 5 extension that captures {@code System.out} and lets a test feed {@code System.in}.
 *
 * <pre>
 * &#64;ExtendWith(ConsoleCapture.class)
 * class FooTest {
 *     &#64;Test
 *     void prints(ConsoleCapture console) {
 *         console.provideInput("42\n");
 *         new Foo().run();
 *         assertEquals("42", console.output().trim());
 *     }
 * }
 * </pre>
 *
 * The original streams are restored after every test.
 */
public final class ConsoleCapture implements BeforeEachCallback, AfterEachCallback, ParameterResolver {

    private PrintStream originalOut;
    private InputStream originalIn;
    private ByteArrayOutputStream buffer;

    @Override
    public void beforeEach(ExtensionContext context) {
        originalOut = System.out;
        originalIn = System.in;
        buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
    }

    @Override
    public void afterEach(ExtensionContext context) {
        System.setOut(originalOut);
        System.setIn(originalIn);
    }

    /** Everything printed so far, with line endings normalised to {@code \n}. */
    public String output() {
        return buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n");
    }

    /** Printed output split into lines. */
    public List<String> lines() {
        String out = output();
        return out.isEmpty() ? List.of() : Arrays.asList(out.split("\n"));
    }

    /** Clears the captured output. */
    public void reset() {
        buffer.reset();
    }

    /** Replaces {@code System.in} with the given text. Call before the code under test creates its Scanner. */
    public void provideInput(String input) {
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
    }

    @Override
    public boolean supportsParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return parameterContext.getParameter().getType() == ConsoleCapture.class;
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext, ExtensionContext extensionContext) {
        return this;
    }
}
