import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import testsupport.ConsoleCapture;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/** Tests for the small single-purpose classes in the default package. */
@ExtendWith(ConsoleCapture.class)
class SmallClassesTest {

    @ParameterizedTest
    @CsvSource({"'3,0,1', 2", "'0,1', 2", "'9,6,4,2,3,5,7,0,1', 8", "'', 0"})
    void binary_missingNumber(String nums, int expected) {
        assertEquals(expected, new Binary().missingNumber(ArrayTasksArraysTest.ints(nums)));
    }

    @ParameterizedTest
    @CsvSource({
            "'1,2,3,4,5', 0",   // middle 3 is not the smallest
            "'3,2,1,4,5', 1",
            "'3,2,1,4,1', 0",   // another element equals the middle
            "'1,2,3,4', 0",     // even length
            "'10', 1"
    })
    void miu_return_centered(String nums, int expected) {
        assertEquals(expected, new MIU_Problem_Solution().miu_return_centered(ArrayTasksArraysTest.ints(nums)));
    }

    @Test
    void recurssion_result_positiveNumbers_sum() {
        assertEquals(7, new Recurssion().result(3, 4));
    }

    @Test
    void mathOperations_floor_returnsSquare() {
        // despite its name, floor() squares its argument
        assertEquals(25, new MathOperations().floor(5));
        assertEquals(4, new MathOperations().floor(-2));
    }

    @Test
    void mathOperations_floor_overflow_throws() {
        assertThrows(ArithmeticException.class, () -> new MathOperations().floor(Integer.MAX_VALUE));
    }

    @Test
    void calculation_sendEven_sumsEvenNumbers() {
        assertEquals(12, new Calculation_OPeration().sendEven());
    }

    @Test
    void calculation_sumAndMultiply_prints(ConsoleCapture console) {
        new Calculation_OPeration().SumAndMultiply(3, 4);
        assertEquals(List.of("The summetion of two integer is :7", "The multiplation of two integer is :12"),
                console.lines());
    }

    @ParameterizedTest
    @CsvSource(delimiter = '|', value = {
            "Let's take LeetCode contest|s'teL ekat edoCteeL tsetnoc",
            "Mr Ding|rM gniD",
            "a|a"
    })
    void stringBuilder_reverseWords_557(String input, String expected) {
        assertEquals(expected, new StringBuilder().reverseWords_557(input));
    }

    @Test
    void stringBuilder_practiceOne_printsUpperThenLower(ConsoleCapture console) {
        new StringBuilder().practiceOne();
        assertEquals(List.of("ABCDEFGHIJKLMNOPQRSTUVWXYZ", "abcdefghijklmnopqrstuvwxyz"), console.lines());
    }

    @Test
    void listNode_sortList_148_sortsAscending() {
        ListNode head = build(4, 2, 1, 3);
        assertEquals(java.util.List.of(1, 2, 3, 4), values(head.sortList_148(head)));

        ListNode withNegatives = build(-1, 5, 3, 4, 0);
        assertEquals(java.util.List.of(-1, 0, 3, 4, 5), values(withNegatives.sortList_148(withNegatives)));
    }

    @Test
    void listNode_sortList_148_emptyAndSingle() {
        ListNode single = new ListNode(1);
        assertNull(single.sortList_148(null));
        assertSame(single, single.sortList_148(single));
    }

    @Test
    void setterGetter_roundTrip() {
        SetterGetter sg = new SetterGetter();
        assertNull(sg.getName());
        assertEquals(0, sg.getNumber());
        sg.setName("Himel");
        sg.setNumber(42);
        assertEquals("Himel", sg.getName());
        assertEquals(42, sg.getNumber());
    }

    @Test
    void csvToJson_gettersReturnWhatWasSet() {
        CsvToJson row = new CsvToJson();
        row.setFirstName("Mehedi");
        row.setLastName("Zaman");
        row.setAge("30");
        String[] data = {"a", "b"};
        row.setDatas(data);
        assertEquals("Mehedi", row.getFirstName());
        assertEquals("Zaman", row.getLastName());
        assertEquals("30", row.getAge());
        assertSame(data, row.getDatas());
    }

    @Test
    void constructor_overloadsPrintExpectedMessages(ConsoleCapture console) {
        new Constructor();
        new Constructor(5);
        new Constructor("ignored");
        new Constructor('c');
        new Constructor(true);
        new Constructor("s", 7);
        new Constructor("s", 8, 'c');
        new Constructor(1, 2.0, "x");
        assertEquals(List.of(
                "From constructor int: 98",
                "From constructor String: this is a String",
                "From constructor char: 98",
                "From constructor boolean: 98",
                "From constructor S n i: 7",
                "From constructor S n i: 8"), console.lines());
    }

    @Test
    void constructor_methodNamedConstructor_returnsIPlusOne() {
        assertEquals(6, new Constructor().Constructor(5, 1.5f, "x"));
    }

    @Test
    void palindrome_palin_12221IsPalindrome(ConsoleCapture console) {
        new Palindrome().palin();
        assertEquals("pal", console.output().trim());
    }

    @Test
    void maxMin_finding_lowest_highest(ConsoleCapture console) {
        new MaxMin().finding_lowest_highest();
        assertEquals(List.of(
                "The array is: [-5, -1, 1, 2, 3, 5, 6, 7, 9, 11, 19]",
                "The lowest value is: -5",
                "The highest value is: 19"), console.lines());
    }

    @Test
    void maxMin_maxmin1(ConsoleCapture console) {
        new MaxMin().maxmin1();
        assertEquals(List.of(
                "The maximum number is: 16",
                "The minimum number is: 7",
                "The sum is: 23",
                "The reverse if i is: " + Integer.reverse(16)), console.lines());
    }

    @Test
    void seaching_linearSearch_foundAndNotFound(ConsoleCapture console) {
        Seaching seaching = new Seaching();
        seaching.LinearSearchOne(new int[]{12, 22, 33}, 33);
        seaching.LinearSearchOne(new int[]{12, 22, 33}, 34);
        seaching.LinearSearchOne(new int[]{}, 1);
        assertEquals(List.of("number found", "no int found", "no int found"), console.lines());
    }

    @Test
    void whileLoop_settingWhile_Int_printsAges25To30(ConsoleCapture console) {
        new WhileLoop().settingWhile_Int();
        assertEquals(6, console.lines().size());
        assertTrue(console.lines().get(0).endsWith("25"));
        assertTrue(console.lines().get(5).endsWith("30"));
    }

    private static ListNode build(int... values) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        for (int v : values) {
            tail.next = new ListNode(v);
            tail = tail.next;
        }
        return dummy.next;
    }

    private static java.util.List<Integer> values(ListNode head) {
        java.util.List<Integer> out = new java.util.ArrayList<>();
        for (ListNode n = head; n != null; n = n.next) {
            out.add(n.val);
        }
        return out;
    }
}
