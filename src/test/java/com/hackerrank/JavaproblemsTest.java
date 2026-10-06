package com.hackerrank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import testsupport.ConsoleCapture;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ConsoleCapture.class)
class JavaproblemsTest {

    private Javaproblems problems;

    @BeforeEach
    void setUp() {
        problems = new Javaproblems();
    }

    @Test
    void fizzBuzz_15(ConsoleCapture console) {
        problems.fizzBuzz(15);
        assertEquals(List.of("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"), console.lines());
    }

    @Test
    void fizzBuzz_zero_printsNothing(ConsoleCapture console) {
        problems.fizzBuzz(0);
        assertEquals("", console.output());
    }

    @Test
    void String_Review2_and_3_splitEvenAndOddIndexes(ConsoleCapture console) {
        problems.String_Review2("Hacker");
        problems.String_Review3("Rank");
        assertEquals(List.of("Hce akr", "Rn ak"), console.lines());
    }

    @Test
    void String_Review_readsTestCasesFromStdin(ConsoleCapture console) {
        console.provideInput("2\nHacker\nRank\n");
        problems.String_Review();
        assertEquals(List.of("Hce akr", "Rn ak"), console.lines());
    }

    @Test
    void Java_String_Introduction_readsTwoWords(ConsoleCapture console) {
        console.provideInput("hello\njava\n");
        problems.Java_String_Introduction();
        assertEquals(List.of("9", "no", "Hello Java"), console.lines());
    }

    @Test
    void Java_String_Introduction_firstShorter_printsYes(ConsoleCapture console) {
        console.provideInput("ab\ncde\n");
        problems.Java_String_Introduction();
        assertEquals(List.of("5", "yes", "Ab Cde"), console.lines());
    }

    @Test
    void verify_String(ConsoleCapture console) {
        problems.verify_String();
        assertEquals(List.of("9", "No", "Hello Java"), console.lines());
    }

    @Test
    void reverseArray_printsListThenReversed(ConsoleCapture console) {
        problems.reverseArray();
        assertEquals(List.of("[1, 2, 3, 4, 5, 6]", "[6, 5, 4, 3, 2, 1]", "6 5 4 3 2 1 "), console.lines());
    }

    @Test
    void Map_dictionary_consumesStdinWithoutError(ConsoleCapture console) {
        console.provideInput("2\nsam 99912222\ntom 11122222\nsam\nharry\n");
        assertDoesNotThrow(problems::Map_dictionary);
    }

    @Test
    void findXOR(ConsoleCapture console) {
        problems.findXOR();
        assertEquals(List.of("the findXOR is: 111", "the findXOR2 is: 111"), console.lines());
    }
}
