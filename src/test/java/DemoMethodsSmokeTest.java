import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.extension.ExtendWith;
import testsupport.ConsoleCapture;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.Duration;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Runs every public no-argument {@code void} method of the demo classes and checks it finishes
 * without throwing. These methods only print hard-coded examples, so "it still runs" is the
 * regression we can check. Methods that read stdin get a few numbers fed in.
 */
@ExtendWith(ConsoleCapture.class)
class DemoMethodsSmokeTest {

    /** Enough integers for every Scanner-based demo method. */
    private static final String STDIN = "3\n1\n2\n3\n3\n4\n5\n6\n".repeat(4);

    private static final Class<?>[] DEMO_CLASSES = {
            ArrayTasks.class, HashMapClass.class, StackOperations.class, Regex.class, Oop.class,
            Oop_Three.class, Oop_Inheritance.class, AbsoluteValue.class, SampleProgrammingProblems.class,
            Seaching.class, Tree_Operations.class, StringOperations.class, List.class,
            basicPractice.Loop.class, basicPractice.Loop_Class.class, basicPractice.WhileLoop.class,
            basicPractice.Array.class
    };

    @TestFactory
    Stream<DynamicTest> everyDemoMethodRuns(ConsoleCapture console) {
        return Arrays.stream(DEMO_CLASSES)
                .flatMap(type -> Arrays.stream(type.getDeclaredMethods())
                        .filter(m -> Modifier.isPublic(m.getModifiers()))
                        .filter(m -> m.getParameterCount() == 0 && m.getReturnType() == void.class)
                        .sorted(Comparator.comparing(Method::getName))
                        .map(m -> DynamicTest.dynamicTest(type.getSimpleName() + "." + m.getName(),
                                () -> run(console, type, m))));
    }

    private static void run(ConsoleCapture console, Class<?> type, Method method) throws Exception {
        console.provideInput(STDIN);
        Object target = Modifier.isStatic(method.getModifiers()) ? null : type.getDeclaredConstructor().newInstance();
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            try {
                method.invoke(target);
            } catch (InvocationTargetException e) {
                fail(type.getSimpleName() + "." + method.getName() + " threw " + e.getCause(), e.getCause());
            }
        });
    }
}
