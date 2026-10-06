import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/** Array-oriented methods of {@link ArrayTasks}. */
class ArrayTasksArraysTest {

    private ArrayTasks tasks;

    @BeforeEach
    void setUp() {
        tasks = new ArrayTasks();
    }

    @Nested
    @DisplayName("removing and replacing elements")
    class Removing {

        @Test
        void replaceDuplicatewithDash_sortedArray_returnsUniqueCountAndCompactsPrefix() {
            int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
            int k = tasks.replaceDuplicatewithDash(nums);
            assertEquals(5, k);
            assertArrayEquals(new int[]{0, 1, 2, 3, 4}, Arrays.copyOf(nums, k));
        }

        @Test
        void replaceDuplicatewithDash_emptyArray_returnsZero() {
            assertEquals(0, tasks.replaceDuplicatewithDash(new int[]{}));
        }

        @Test
        void replaceDuplicatewithDash_singleElement_returnsOne() {
            assertEquals(1, tasks.replaceDuplicatewithDash(new int[]{7}));
        }

        @Test
        void removeElements_removesEveryOccurrence() {
            assertArrayEquals(new int[]{2, 2}, tasks.removeElements(new int[]{3, 2, 2, 3}, 3));
        }

        @Test
        void removeElements_valueNotPresent_returnsSameValues() {
            assertArrayEquals(new int[]{1, 2, 3}, tasks.removeElements(new int[]{1, 2, 3}, 9));
        }

        @Test
        void removeElements_allRemoved_returnsEmpty() {
            assertArrayEquals(new int[]{}, tasks.removeElements(new int[]{4, 4}, 4));
        }

        @Test
        void moveZeroes_movesZerosToEndKeepingOrder() {
            int[] nums = {0, 1, 0, 3, 12};
            tasks.moveZeroes(nums);
            assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums);
        }

        @Test
        void sortColors_75_sortsZerosOnesTwos() {
            int[] nums = {2, 0, 2, 1, 1, 0};
            tasks.sortColors_75(nums);
            assertArrayEquals(new int[]{0, 0, 1, 1, 2, 2}, nums);
        }

        @Test
        void sortColors_75_singleElement_unchanged() {
            int[] nums = {1};
            tasks.sortColors_75(nums);
            assertArrayEquals(new int[]{1}, nums);
        }
    }

    @Nested
    @DisplayName("majority element")
    class Majority {

        @ParameterizedTest(name = "{0} -> {1}")
        @MethodSource("ArrayTasksArraysTest#majorityCases")
        void majorityElement(int[] nums, int expected) {
            assertEquals(expected, tasks.majorityElement(nums.clone()));
        }

        @ParameterizedTest(name = "{0} -> {1}")
        @MethodSource("ArrayTasksArraysTest#majorityCases")
        void majority(int[] nums, int expected) {
            assertEquals(expected, tasks.majority(nums.clone()));
        }

        @ParameterizedTest(name = "{0} -> {1}")
        @MethodSource("ArrayTasksArraysTest#majorityCases")
        void major(int[] nums, int expected) {
            assertEquals(expected, tasks.major(nums.clone()));
        }

        @Test
        void majority_noElementAboveHalf_returnsMinusOne() {
            // 1 and 2 each appear exactly n/2 times: not a majority
            assertEquals(-1, tasks.majority(new int[]{1, 2, 1, 2}));
            assertEquals(-1, tasks.major(new int[]{1, 2, 1, 2}));
        }
    }

    static Stream<Arguments> majorityCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 3}, 3),
                Arguments.of(new int[]{2, 2, 1, 1, 1, 2, 2}, 2),
                Arguments.of(new int[]{5}, 5),
                Arguments.of(new int[]{-1, -1, 4}, -1 /* -1 is the majority value itself */));
    }

    @Nested
    @DisplayName("plusOne (LeetCode 66)")
    class PlusOne {

        @Test
        void noCarry() {
            assertArrayEquals(new int[]{1, 2, 4}, tasks.plusOne(new int[]{1, 2, 3}));
        }

        @Test
        void carryIntoMiddle() {
            assertArrayEquals(new int[]{1, 3, 0}, tasks.plusOne(new int[]{1, 2, 9}));
        }

        @Test
        void allNines_growsByOneDigit() {
            assertArrayEquals(new int[]{1, 0, 0, 0}, tasks.plusOne(new int[]{9, 9, 9}));
        }

        @Test
        void emptyInput_returnsNull() {
            assertNull(tasks.plusOne(new int[]{}));
        }
    }

    @Test
    void shuffle_interleavesHalves() {
        assertArrayEquals(new int[]{2, 3, 5, 4, 1, 7}, tasks.shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3));
    }

    @Nested
    @DisplayName("profit and difference")
    class Profit {

        @ParameterizedTest
        @CsvSource({
                "'7,1,5,3,6,4', 5",
                "'7,6,4,3,1', 0",
                "'1', 0",
                "'2,4,1', 2"
        })
        void maxProfit(String prices, int expected) {
            assertEquals(expected, tasks.maxProfit(ints(prices)));
        }

        @ParameterizedTest
        @CsvSource({
                "'7,1,5,4', 4",
                "'9,4,3,2', 0",
                "'1,5,2,10', 9"
        })
        void maximumDifference(String nums, int expected) {
            assertEquals(expected, tasks.maximumDifference(ints(nums)));
        }

        @Test
        void maxProductDifference_usesTwoLargestAndTwoSmallest() {
            assertEquals(34, tasks.maxProductDifference(new int[]{5, 6, 2, 7, 4}));
            assertEquals(64, tasks.maxProductDifference(new int[]{4, 2, 5, 9, 7, 4, 8}));
        }
    }

    @Nested
    @DisplayName("three sum")
    class ThreeSum {

        @Test
        void threeSum_findsUniqueTriplets() {
            List<List<Integer>> result = tasks.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
            assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), result);
        }

        @Test
        void threeSum_noTriplet_returnsEmpty() {
            assertTrue(tasks.threeSum(new int[]{0, 1, 1}).isEmpty());
        }

        @Test
        void threeSum_allZeros_returnsSingleTriplet() {
            assertEquals(List.of(List.of(0, 0, 0)), tasks.threeSum(new int[]{0, 0, 0, 0}));
        }

        @Test
        void threeSum2_matchesThreeSumAsSet() {
            List<List<Integer>> result = tasks.threeSum2(new int[]{-1, 0, 1, 2, -1, -4});
            assertEquals(2, result.size());
            assertTrue(result.contains(List.of(-1, -1, 2)));
            assertTrue(result.contains(List.of(-1, 0, 1)));
        }
    }

    @Nested
    @DisplayName("duplicates and missing numbers")
    class Duplicates {

        @ParameterizedTest
        @CsvSource({
                "'1,2,3,1', 3, true",
                "'1,0,1,1', 1, true",
                "'1,2,3,1,2,3', 2, false",
                "'', 1, false"
        })
        void containsNearbyDuplicate(String nums, int k, boolean expected) {
            assertEquals(expected, tasks.containsNearbyDuplicate(ints(nums), k));
        }

        @ParameterizedTest
        @CsvSource({
                "'3,0,1', 2",
                "'0,1', 2",
                "'9,6,4,2,3,5,7,0,1', 8",
                "'1', 0"
        })
        void missingNumber(String nums, int expected) {
            assertEquals(expected, tasks.missingNumber(ints(nums)));
        }

        @Test
        void findDuplicate_returnsRepeatedValue() {
            assertEquals(2, tasks.findDuplicate(new int[]{1, 3, 4, 2, 2}));
            assertEquals(3, tasks.findDuplicate(new int[]{3, 1, 3, 4, 2}));
        }

        @Test
        void findDuplicate_noDuplicate_returnsLength() {
            assertEquals(3, tasks.findDuplicate(new int[]{1, 2, 3}));
        }

        @Test
        void findErrorNums_returnsDuplicateThenMissing() {
            assertArrayEquals(new int[]{2, 3}, tasks.findErrorNums(new int[]{1, 2, 2, 4}));
            assertArrayEquals(new int[]{1, 2}, tasks.findErrorNums(new int[]{1, 1}));
        }

        @Test
        void finderror2_returnsDuplicateThenMissing() {
            assertArrayEquals(new int[]{2, 3}, tasks.finderror2(new int[]{1, 2, 2, 4}));
            // the missing number is the last one
            assertArrayEquals(new int[]{1, 2}, tasks.finderror2(new int[]{1, 1}));
        }

        @Test
        void twoOutOfThree_2032_returnsValuesInAtLeastTwoArrays() {
            List<Integer> result = tasks.twoOutOfThree_2032(new int[]{1, 1, 3, 2}, new int[]{2, 3}, new int[]{3});
            assertEquals(List.of(2, 3), result.stream().sorted().toList());
        }

        @Test
        void twoOutOfThree_2032_duplicatesInsideOneArrayDoNotCount() {
            assertTrue(tasks.twoOutOfThree_2032(new int[]{1, 1}, new int[]{2}, new int[]{3}).isEmpty());
        }
    }

    @Nested
    @DisplayName("searching")
    class Searching {

        @ParameterizedTest
        @CsvSource({
                "'-1,0,3,5,9,12', 9, 4",
                "'-1,0,3,5,9,12', 2, -1",
                "'', 1, -1"
        })
        void search(String nums, int target, int expected) {
            assertEquals(expected, tasks.search(ints(nums), target));
        }

        @Test
        void targetIndices_returnsIndexesAfterSorting() {
            assertEquals(List.of(1, 2), tasks.targetIndices(new int[]{1, 2, 5, 2, 3}, 2));
            assertEquals(List.of(), tasks.targetIndices(new int[]{1, 2, 5, 2, 3}, 4));
        }

        @Test
        void nextGreatestLetter_744() {
            assertEquals('c', tasks.nextGreatestLetter_744(new char[]{'c', 'f', 'j'}, 'a'));
            assertEquals('f', tasks.nextGreatestLetter_744(new char[]{'c', 'f', 'j'}, 'c'));
            // wraps around when nothing is greater
            assertEquals('x', tasks.nextGreatestLetter_744(new char[]{'x', 'x', 'y', 'y'}, 'z'));
        }

        @Test
        void thirdMax_414() {
            assertEquals(1, tasks.thirdMax_414(new int[]{3, 2, 1}));
            assertEquals(2, tasks.thirdMax_414(new int[]{1, 2}));
            assertEquals(1, tasks.thirdMax_414(new int[]{2, 2, 3, 1}));
            assertEquals(7, tasks.thirdMax_414(new int[]{7}));
        }
    }

    @Nested
    @DisplayName("set operations")
    class SetOperations {

        @Test
        void intersection_349_returnsDistinctCommonValues() {
            int[] result = tasks.intersection_349(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
            Arrays.sort(result);
            assertArrayEquals(new int[]{4, 9}, result);
        }

        @Test
        void intersection_349_noCommonValues_returnsEmpty() {
            assertArrayEquals(new int[]{}, tasks.intersection_349(new int[]{1}, new int[]{2}));
        }

        @Test
        void smallerNumbersThanCurrent_bothImplementationsAgree() {
            int[] nums = {8, 1, 2, 2, 3};
            int[] expected = {4, 0, 1, 1, 3};
            assertArrayEquals(expected, tasks.smallerNumbersThanCurrent(nums.clone()));
            assertArrayEquals(expected, tasks.smallerNumbersThanCurrent2(nums.clone()));
        }

        @Test
        void arrayRankTransform_1331() {
            assertArrayEquals(new int[]{4, 1, 2, 3}, tasks.arrayRankTransform_1331(new int[]{40, 10, 20, 30}));
            assertArrayEquals(new int[]{1, 1, 1}, tasks.arrayRankTransform_1331(new int[]{100, 100, 100}));
            assertArrayEquals(new int[]{}, tasks.arrayRankTransform_1331(new int[]{}));
        }

        @Test
        void findRelativeRanks_506() {
            assertArrayEquals(new String[]{"Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"},
                    tasks.findRelativeRanks_506(new int[]{5, 4, 3, 2, 1}));
            assertArrayEquals(new String[]{"Gold Medal", "5", "Bronze Medal", "Silver Medal", "4"},
                    tasks.findRelativeRanks_506(new int[]{10, 3, 8, 9, 4}));
        }

        @Test
        void findRelativeRanks_506_empty_returnsEmpty() {
            assertArrayEquals(new String[]{}, tasks.findRelativeRanks_506(new int[]{}));
        }
    }

    @Nested
    @DisplayName("sequences and windows")
    class Sequences {

        @Test
        void findMaxConsecutiveOnes() {
            assertEquals(3, tasks.findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1}));
            assertEquals(0, tasks.findMaxConsecutiveOnes(new int[]{0, 0}));
        }

        @Test
        void threeConsecutiveOdds() {
            assertTrue(tasks.threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
            assertFalse(tasks.threeConsecutiveOdds(new int[]{2, 6, 4, 1}));
            assertFalse(tasks.threeConsecutiveOdds(new int[]{1, 3}));
        }

        @Test
        void canMakeArithmeticProgression() {
            assertTrue(tasks.canMakeArithmeticProgression(new int[]{3, 5, 1}));
            assertFalse(tasks.canMakeArithmeticProgression(new int[]{1, 2, 4}));
        }

        @ParameterizedTest
        @CsvSource({
                "'1,2,10,5,7', true",
                "'2,3,1,2', false",
                "'1,1,1', false",
                "'1,2,3', true",
                "'100,21,100', true"
        })
        void canBeIncreasing_1909(String nums, boolean expected) {
            assertEquals(expected, tasks.canBeIncreasing_1909(ints(nums)));
        }

        @ParameterizedTest
        @CsvSource({
                "'1,1,2,3,5', 1",
                "'1,1,2,2,3,3', 2",
                "'1,2', 0",
                "'1', 1"
        })
        void minDeletion_2216(String nums, int expected) {
            assertEquals(expected, tasks.minDeletion_2216(ints(nums)));
        }

        @Test
        void minMaxGame() {
            assertEquals(1, tasks.minMaxGame(new int[]{1, 3, 5, 2, 4, 8, 2, 2}));
            assertEquals(3, tasks.minMaxGame(new int[]{3}));
        }

        @Test
        void sumOddLengthSubarrays_1588() {
            assertEquals(58, tasks.sumOddLengthSubarrays_1588(new int[]{1, 4, 2, 5, 3}));
            assertEquals(3, tasks.sumOddLengthSubarrays_1588(new int[]{1, 2}));
        }

        @Test
        void sortedSquares_977() {
            assertArrayEquals(new int[]{0, 1, 9, 16, 100}, tasks.sortedSquares_977(new int[]{-4, -1, 0, 3, 10}));
        }

        @Test
        void maxArea() {
            assertEquals(49, tasks.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
            assertEquals(1, tasks.maxArea(new int[]{1, 1}));
        }

        @Test
        void largestPerimeter_976() {
            assertEquals(5, tasks.largestPerimeter_976(new int[]{2, 1, 2}));
            assertEquals(0, tasks.largestPerimeter_976(new int[]{1, 2, 1, 10}));
        }

        @Test
        void maximumWealth_1672() {
            assertEquals(6, tasks.maximumWealth_1672(new int[][]{{1, 2, 3}, {3, 2, 1}}));
            assertEquals(10, tasks.maximumWealth_1672(new int[][]{{1, 5}, {7, 3}, {3, 5}}));
        }

        @Test
        void findSumOfTwoLargestAdjacent_MIU() {
            assertEquals(13, ArrayTasks.findSumOfTwoLargestAdjacent_MIU(new int[]{1, 6, 7, 2, 3}));
            assertEquals(-3, ArrayTasks.findSumOfTwoLargestAdjacent_MIU(new int[]{-5, -1, -2}));
        }

        @Test
        void adjucentTwoSum_returnsLargestAdjacentPairSum() {
            assertEquals(13, tasks.adjucentTwoSum(new int[]{1, 6, 7, 2, 3}));
        }

        @Test
        void trimMean_1619_removesTopAndBottomFivePercent() {
            int[] arr = {1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3};
            assertEquals(2.0, tasks.trimMean_1619(arr), 1e-5);
            int[] arr2 = {6, 2, 7, 5, 1, 2, 0, 3, 10, 2, 5, 0, 5, 5, 0, 8, 7, 6, 8, 0};
            assertEquals(4.0, tasks.trimMean_1619(arr2), 1e-5);
        }
    }

    @Nested
    @DisplayName("merging")
    class Merging {

        @Test
        void merge_88_mergesIntoFirstArray() {
            int[] nums1 = {1, 2, 3, 0, 0, 0};
            tasks.merge_88(nums1, 3, new int[]{2, 5, 6}, 3);
            assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
        }

        @Test
        void merge_88_v2_mergesIntoFirstArray() {
            int[] nums1 = {0};
            tasks.merge_88_v2(nums1, 0, new int[]{1}, 1);
            assertArrayEquals(new int[]{1}, nums1);
        }
    }

    @Nested
    @DisplayName("candies")
    class Candies {

        @ParameterizedTest
        @CsvSource({
                "'1,1,2,2,3,3', 3",
                "'1,1,2,3', 2",
                "'6,6,6,6', 1"
        })
        void allThreeImplementationsAgree(String candies, int expected) {
            assertEquals(expected, tasks.distributeCandies_575(ints(candies)));
            assertEquals(expected, tasks.distributeCandies_575_(ints(candies)));
            assertEquals(expected, tasks.distributeCandies_575_hashset(ints(candies)));
        }
    }

    @Test
    void reverseList_returnsReversedCopy() {
        List<Integer> input = List.of(1, 2, 3);
        assertEquals(List.of(3, 2, 1), tasks.reverseList(input));
        assertEquals(List.of(1, 2, 3), input);
    }

    @Test
    void reverseList_null_returnsEmpty() {
        assertTrue(tasks.reverseList(null).isEmpty());
    }

    @Test
    void countMatches_byEachRuleKey() {
        List<List<String>> items = List.of(
                List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone"));
        assertEquals(2, tasks.countMatches(items, "type", "phone"));
        assertEquals(1, tasks.countMatches(items, "color", "silver"));
        assertEquals(1, tasks.countMatches(items, "name", "iphone"));
        assertEquals(0, tasks.countMatches(items, "color", "red"));
    }

    /** Parses "1,2,3" into an int array; an empty string gives an empty array. */
    static int[] ints(String csv) {
        if (csv == null || csv.isBlank()) {
            return new int[0];
        }
        return Arrays.stream(csv.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
    }
}
