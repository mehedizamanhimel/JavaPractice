import ConceptPractice.*;
import problems.CodilityTest;
import problems.Fibonacci;
import problems.ScannerClass;

import java.util.ArrayList;
import java.util.Arrays;

public class MainClass implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread has ended");
	}

	/*
	@author Mehedi Zaman Himel
	@code int a = 5;
	@link https://www.youtube.com/

	 */

	public MainClass (int abcd){
	}

	public static void main(String[] args) {

		int age;

		SwitchStatementClass switchClass = new SwitchStatementClass();
		ConditionalStatement conditionalStatements = new ConditionalStatement();
		ScannerClass scanner = new ScannerClass();
		WhileLoop whileLoop = new WhileLoop();
		ConditionalOperator conditionalOperator = new ConditionalOperator();
		Loop_Class loopClass = new Loop_Class();
		SampleProgrammingProblems sampleProgram = new SampleProgrammingProblems();

		AbsoluteValue absoluteValue = new AbsoluteValue();
		ArrayTasks arrayTasks = new ArrayTasks();
		FileSystem files = new FileSystem();
		Loop loop = new Loop();
		reverseString reverse = new reverseString();
		Regex regx = new Regex();
		Fibonacci fibonacci = new Fibonacci();
		Palindrome palindrome = new Palindrome();
		Seaching search = new Seaching();
		Calculation_OPeration calc = new Calculation_OPeration();
		CommandClass commandClass = new CommandClass();
		DataTypes dataTypes = new DataTypes();
		Variables variables = new Variables();
		Operators operators = new Operators();
		Switch switchStatement = new Switch();
		HashMapClass hashMapClass = new HashMapClass();
		List list = new List();
		StringOperations stringOperations = new StringOperations();
		StringBuilder stringBuilder = new StringBuilder();
		MaxMin maxMin = new MaxMin();
		Binary binary = new Binary();
		Sorting sorting= new Sorting();
		StackOperations stackOperations = new StackOperations();

		/**
		 loop.whileLoopOne();
		 loop.DoWhileLoop();

		 arrays.listSortStringTwo();

		 MainClass main = new MainClass();
		 Thread thread = new Thread(main);
		 thread.start();
		 System.out.println("test");

		 reverse.reverStringWithScanner();



		 arrays.arList();
		 arrays.arList_int();
		 arrays.arList_double();

		 regx.patternMatchesOne();

		arrayTasks.arrayAdd();

		reverse.reverseInt(12);
		reverse.reverseIntTwo(-345);

		fibonacci.fiboTwo();

		palindrome.palin();

		search.LinearSearchOne(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, 4);
		search.binarySearch();

		ArrayTasks.arMerge();

		reverse.reverseMethod("asdfasdflll");
		arrayTasks.findSmallestInArray();
		arrayTasks.SumofTwoArray();

		calc.SumAndMultiply(5, 6);

		//System.out.println("the number of even is"+calc.sendEven());

		dataTypes.allDataTypes();
		variables.variableOne();

		operators.incrementMethod();
		arrayTasks.hr_2dArray_for();
		arrayTasks.hr_2dArray_forEach();
		arrayTasks.arrayDeclare();
		arrayTasks.TwoDArrayOne();
		arrayTasks.hr_2dArray_forEach();


		Constructor constructor_int = new Constructor(5);
		Constructor constructor_string = new Constructor("abc");
		Constructor constructor_char = new Constructor('c');
		Constructor constructor_boolean = new Constructor(true);
		Constructor constructor_combo1 = new Constructor("",666);

		arrayTasks.array_oct();
		arrayTasks.arrayTask();



		switchStatement.switchOne(50);
		arrayTasks.newMethodDec2021(3);
		//arrayTasks.forEachArray();
		arrayTasks.nestedFor();
		arrayTasks.whileLoopOne();

		arrayTasks.E2EArrayPractice();
		arrayTasks.arraychangeViaInput();
		arrayTasks.rubyTest();
		arrayTasks.leetcode_One();
		 **/


		arrayTasks.fullPhase();
		arrayTasks.problem30();
		arrayTasks.arrT();
		hashMapClass.hashSetOne();

		//arrayTasks.boopal("A man, a plan, a canal: Panama");
		System.out.println(arrayTasks.boopal("A man, a plan, a canal: Panama"));
		arrayTasks.returnFirstDuplicate();

		arrayTasks.SumOfUnique();
		arrayTasks.TestingALoop(5);
		System.out.println("the recurssion value is: "+arrayTasks.TestingALoop(4));


		//arrayTasks.replaceDuplicatewithDash(new int[]{1, 2, 3, 5});

		//System.out.println("the final array is: "+arrayTasks.replaceDuplicatewithDash(new int[]{1, 2, 3, 5}));

		regx.IntToString();
		list.returnBoth(5,6, 5,6);
		System.out.println(list.returnBoth(11,11, 11,11));
		hashMapClass.findingOccurance();
		list.removeDuplicate();
		arrayTasks.removeDisSimilarValue();
		arrayTasks.SumOfEvenNumber();
		arrayTasks.addingArrayNumbers();
		//System.out.println("the majority number: First method is >> " + arrayTasks.majority(new int[]{3,2,3}));
		System.out.println("the majority number: First method is >> " + arrayTasks.majority(new int[]{6,6,6,7,7}));
		//System.out.println("the majority number: First method is >> " + arrayTasks.majority(new int[]{6,5,5}));
		//arrayTasks.majorityElement(new int[]{1});
		//System.out.println("The majority elements are: " + arrayTasks.majorityElement(new int[]{7,7,1,1,1,7,7}));

		System.out.println("the majority number: First method is >> " + arrayTasks.major(new int[]{6,6,6,7,7}));


		System.out.println("the array after removing duplicate element is >> " + arrayTasks.removeElements(new int[]{1,2,6,3,4,5,6}, 6));
		stringOperations.removeSubString();

		stringBuilder.practiceOne();
		stringBuilder.practiceTwo();
		System.out.println(stringOperations.removeSubstring2(new String[]{"uexk","aeuexkf","wgxih","yuexk","gxea","yuexkm","ypmfx","jjuexkmb","wqpri","aeuexkfpo","kqtnz","pkqtnza","nrbb","hmypmfx","krqs","jjuexkmbyt","zvru","ypmfxj"}));
		System.out.println(stringOperations.arrayStringsAreEqual(new String[]{"ac", "b"}, new String[]{"a", "bc"}));
		System.out.println(stringOperations.restoreString("codeleet",new int[]{4,5,6,7,0,2,1,3}));
		System.out.println(stringOperations.restoreString2("codeleet",new int[]{4,5,6,7,0,2,1,3}));
		//System.out.println(arrayTasks.plusOne(new int[]{1,2,3}));
		System.out.println(Arrays.toString(arrayTasks.plusOne(new int[]{1,2,3,4})));
		arrayTasks.kthSmallest(new int[][]{{1,2,3},{1,2,3}}, 5);
		//System.out.println(Arrays.deepToString(arrayTasks.kthSmallest(new int[][]{{1},{1}}, 5)));


		System.out.println("the leetcode shuffle answer is: "+ Arrays.toString(arrayTasks.shuffle(new int[]{1,2,3,4,4,3,2,1},4)));
		System.out.println("the leetcode shuffle answer is: "+ ("the maxProfit is: "+arrayTasks.maxProfit(new int[]{7,1,5,3,6,4})));

		arrayTasks.maxProfit(new int[]{1});
		maxMin.maxmin1();
		maxMin.finding_lowest_highest();
		stringOperations.StringOps();
		System.out.println("the leetcode shuffle answer is: "+ ("the maxProfit is: "+arrayTasks.maximumDifference(new int[]{7,1,5,4})));
		arrayTasks.arrayMaxMinTest();
		arrayTasks.fiboprac();
		System.out.println(arrayTasks.containsNearbyDuplicate(new int[]{1,2,3,1,2,3},2));
		System.out.println(arrayTasks.search(new int[]{1},0));
		System.out.println(arrayTasks.getSum(1,2));
		System.out.println(binary.missingNumber(new int[]{3,0,1}));
		System.out.println(arrayTasks.missingNumber(new int[]{3,0,1,4,5,6}));
		System.out.println( "The duplicate value is: "+ arrayTasks.findDuplicate(new int[]{3,1,2,4,2}));
		System.out.println( "The error value is: "+ Arrays.toString(arrayTasks.findErrorNums(new int[]{1,2,3,4,5,6,7,7,9})));
		System.out.println( "The error value2 is: "+ Arrays.toString(arrayTasks.finderror2(new int[]{1,2,3,4,5,6,7,7,9})));
		System.out.println( "The max difference is: "+ (arrayTasks.maxProductDifference(new int[]{4,2,5,9,7,4,8})));
		arrayTasks.practice();
		arrayTasks.pointerCompare();
		System.out.println("The highest value is substring is: "+arrayTasks.maxPower("abbcccddddeeeeedcba"));
		System.out.println("The max consutive is: "+arrayTasks.findMaxConsecutiveOnes(new int[]{0}));
		System.out.println("The value of checkZeroOnes is: "+arrayTasks.checkZeroOnes("110100010"));
		System.out.println("The value of checkOnesSegment is: "+arrayTasks.checkOnesSegment("110"));
		System.out.println( "The max difference is: "+ (arrayTasks.longestCommonPrefix(new String[]{"flower","flow","flight","fldd" })));
		System.out.println( "The max difference is: "+ (arrayTasks.longestCommonPrefix(new String[]{"ab", "a"})));

		System.out.println( "The smallerNumbersThanCurrent is: "+ (Arrays.toString( arrayTasks.smallerNumbersThanCurrent(new int[]{8,1,2,2,3}))));
		System.out.println( "The smallerNumbersThanCurrent2 is: "+ (Arrays.toString( arrayTasks.smallerNumbersThanCurrent2(new int[]{8,1,2,2,3}))));

		System.out.println( "The max difference is: "+ (arrayTasks.mostWordsFound(new String[]{"abcd abcd abcd abcd abcd eee","abc abc abc abcd"})));
		System.out.println( "The max difference is: "+ (arrayTasks.mostWordsFound(new String[]{"w jrpihe zsyqn l dxchifbxlasaehj","nmmfrwyl jscqyxk a xfibiooix xolyqfdspkliyejsnksfewbjom","xnleojowaxwpyogyrayfgyuzhgtdzrsyococuqexggigtberizdzlyrdsfvryiynhg","krpwiazoulcixkkeyogizvicdkbrsiiuhizhkxdpssynfzuigvcbovm","rgmz rgztiup wqnvbucfqcyjivvoeedyxvjsmtqwpqpxmzdupfyfeewxegrlbjtsjkusyektigr","o lgsbechr lqcgfiat pkqdutzrq iveyv iqzgvyddyoqqmqerbmkxlbtmdtkinlk","hrvh efqvjilibdqxjlpmanmogiossjyxepotezo","qstd zui nbbohtuk","qsdrerdzjvhxjqchvuewevyzlkyydpeeblpc"})));
		System.out.println( "The countValidWords is: "+ (arrayTasks.countValidWords("abcd abcd abcd")));

		//System.out.println( "The commonChars is: "+ ( arrayTasks.commonChars(new String[]{"bella","label","roller"})));
		System.out.println( "The minMaxGame is: "+ ( arrayTasks.minMaxGame(new int[]{1,3,5,2,4,8,2,2})));
		System.out.println( "The minMaxGame2 is: "+ ( arrayTasks.minMaxGame(new int[]{70,38,21,22})));
		System.out.println( "The threeConsecutiveOdds is: "+ ( arrayTasks.threeConsecutiveOdds(new int[]{2,6,4,1})));
		System.out.println( "The threeConsecutiveOdds is: "+ ( arrayTasks.threeConsecutiveOdds(new int[]{1,2,34,3,4,5,7,23,12})));
		System.out.println( "The threeConsecutiveOdds is: "+ ( arrayTasks.threeConsecutiveOdds(new int[]{})));
		System.out.println( "The intersection is: "+ Arrays.toString(arrayTasks.intersection(new int[]{1,2,2,1},new int[]{2,2})));
		System.out.println( "The intersection is: "+ Arrays.toString(arrayTasks.intersection(new int[]{4,9,5},new int[]{9,4,9,8,4})));
		System.out.println( "The findGCD is: "+ arrayTasks.findGCD(new int[]{2,5,6,9,10}));
		System.out.println( "The findGCD is: "+ arrayTasks.findGCD(new int[]{7,5,6,8,3}));
		//System.out.println( "The gcdOfStrings is: "+ arrayTasks.gcdOfStrings_1071("ABCABC","ABC"));
		//System.out.println( "The gcdOfStrings is: "+ arrayTasks.gcdOfStrings_1071("ABABAB","ABAB"));
		//System.out.println( "The gcdOfStrings is: "+ arrayTasks.gcdOfStrings_1071("LEET","CODE"));
		//arrayTasks.arrpractice_July();
		System.out.println( "The lengthOfLongestSubstring is: "+ arrayTasks.lengthOfLongestSubstring("abcabcbb"));
		System.out.println( "The lengthOfLongestSubstring is: "+ arrayTasks.lengthOfLongestSubstring("bbbbb"));
		System.out.println( "The lengthOfLongestSubstring is: "+ arrayTasks.lengthOfLongestSubstring("pwwkew"));
		System.out.println( "The lengthOfLongestSubstring is: "+ arrayTasks.lengthOfLongestSubstring(""));
		System.out.println( "The lengthOfLongestSubstring is: "+ arrayTasks.lengthOfLongestSubstring("a"));
		arrayTasks.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
		arrayTasks.moveZeroes(new int[]{0,1,0,3,12});
		System.out.println( "The targetIndices1 is: "+ arrayTasks.targetIndices(new int[]{1,2,5,2,3}, 2));
		System.out.println( "The targetIndices2 is: "+ arrayTasks.targetIndices(new int[]{1,2,5,2,3}, 3));
		System.out.println( "The targetIndices3 is: "+ arrayTasks.targetIndices(new int[]{1,2,5,2,3}, 5));
		System.out.println( "The arrayRankTransform is: "+ Arrays.toString(arrayTasks.arrayRankTransform_1331(new int[]{40,10,20,30})));
		System.out.println( "The intersection_349 is: "+ Arrays.toString(arrayTasks.intersection_349(new int[]{1,2,2,1},new int[]{2,2})));
		System.out.println( "The canMakeArithmeticProgression is: "+ arrayTasks.canMakeArithmeticProgression(new int[]{3,5,1}));
		System.out.println( "The canMakeArithmeticProgression is: "+ arrayTasks.canMakeArithmeticProgression(new int[]{1,2,4}));
		System.out.println( "The canMakeArithmeticProgression is: "+ arrayTasks.canMakeArithmeticProgression(new int[]{1,100}));
		arrayTasks.samplePractice_1();
		System.out.println( "The solution is: "+ arrayTasks.solution(new int[]{1, 3, 6, 4, 1, 2}));
		System.out.println( "The solution is: "+ arrayTasks.solution(new int[]{1, 2,3}));
		System.out.println( "The solution is: "+ arrayTasks.solution(new int[]{-1, -3}));
		System.out.println( "The solution is: "+ arrayTasks.solution(new int[]{1,3,5,6,8,10,16}));

		CodilityTest codilityTest = new CodilityTest();

		System.out.println(codilityTest.solution(new int[]{1,1,2,3,3}, 3));
		System.out.println(codilityTest.solution(new int[]{1,1,2,3,3}, 3));
		System.out.println(codilityTest.solution(new int[]{1,1,2,3,3,4}, 4));

		System.out.println(codilityTest.solution(new int[]{1,3}, 2));
		System.out.println(codilityTest.solution(new int[]{0,1,3}, 2));
		System.out.println(codilityTest.solution(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2}, 1));
		System.out.println(codilityTest.solution2(14));
		System.out.println(codilityTest.solution2(10));
		System.out.println(codilityTest.solution2(99));

		System.out.println("The strStr is: "+ arrayTasks.strStr("hello","ll"));
		System.out.println("The strStr is: "+arrayTasks.strStr("aaaaa","bba"));
		System.out.println("The strStr is: "+arrayTasks.strStr("a","a"));
		System.out.println("The strStr is: "+arrayTasks.strStr("abc","c"));
		System.out.println("The addBinary_67 is: "+arrayTasks.addBinary_67("11","1"));
		System.out.println("The addBinary_67 is: "+arrayTasks.addBinary_67("1010","1011"));
		System.out.println("The sortSentence_1859 is: "+sorting.sortSentence_1859("a1 b2 c3"));
		System.out.println("The sortedSquares_977 is: "+Arrays.toString(arrayTasks.sortedSquares_977(new int[] {-4,-1,0,3,10})));
		System.out.println("The sortedSquares_977 is: "+Arrays.toString(arrayTasks.sortedSquares_977(new int[] {-7,-3,2,3,11})));
		System.out.println("The trimMean_1619 is: "+ arrayTasks.trimMean_1619(new int[] {5,5,5,5,5}));
		arrayTasks.merge_88(new int[]{1,2,3,0,0,0}, 3,new int[]{2,5,6}, 3);
		arrayTasks.merge_88_v2(new int[]{1,2,3,0,0,0}, 3,new int[]{2,5,6}, 3);
		System.out.println("The sumOfFlooredPairs_1862 is: "+ arrayTasks.sumOfFlooredPairs_1862(new int[] {5,5,5,5,5}));
		System.out.println("The sumOfFlooredPairs_1862 is: "+ arrayTasks.sumOfFlooredPairs_1862(new int[] {2,5,9}));
		System.out.println("The thirdMax_414 is: "+ arrayTasks.thirdMax_414(new int[] {9,1}));
		System.out.println("The thirdMax_414 is: "+ arrayTasks.thirdMax_414(new int[] {9,1,11}));

		System.out.println("The nextGreatestLetter_744 is: "+ arrayTasks.nextGreatestLetter_744(new char[] {'a','b'}, 'z'));
		System.out.println("The nextGreatestLetter_744 is: "+ arrayTasks.nextGreatestLetter_744(new char[] {'c','f','j'}, 'a'));

		System.out.println("The largestPerimeter_976 is: "+ arrayTasks.largestPerimeter_976(new int[] {2,2,1}));
		System.out.println("The largestPerimeter_976 is: "+ arrayTasks.largestPerimeter_976(new int[] {2,1,1}));
		System.out.println("The largestPerimeter_976 is: "+ arrayTasks.largestPerimeter_976(new int[] {2,3,2}));
		System.out.println("The largestPerimeter_976 is: "+ arrayTasks.largestPerimeter_976(new int[] {3,2,3,4}));

		System.out.println("The maximumWealth_1672 is: "+ arrayTasks.maximumWealth_1672(new int[][] {{3,2},{1,0}}));
		System.out.println("The maximumWealth_1672 is: "+ arrayTasks.maximumWealth_1672(new int[][] {{2,8,7},{7,1,3},{1,9,5}}));

		System.out.println("The canBeIncreasing_1909 is: "+ arrayTasks.canBeIncreasing_1909(new int[] {1,2,10,5,7}));
		System.out.println("The canBeIncreasing_1909 is: "+ arrayTasks.canBeIncreasing_1909(new int[] {2,3,1,2}));

		//System.out.println("The isValid_20 is: "+ arrayTasks.isValid_20("()"));
		//System.out.println("The isValid_20 is: "+ arrayTasks.isValid_20("(){}[]"));
		//System.out.println("The isValid_20 is: "+ arrayTasks.isValid_20("(]"));
		System.out.println("The isValid_20 is: "+ arrayTasks.isValid_20("[(({})}]"));

		stackOperations.StackOne();


		System.out.println(arrayTasks.twoOutOfThree_2032(new int[]{1,1,3,2}, new int[]{2,3}, new int[]{3}));
		System.out.println(arrayTasks.twoOutOfThree_2032(new int[]{1,2,2}, new int[]{4,3,3}, new int[]{5}));

		System.out.println("The findTheDifference_389 is: "+sorting.findTheDifference_389("abc","abcd"));
		//System.out.println("The findTheDifference_389 is: "+sorting.findTheDifference_389("","a"));

		System.out.println("\nThe intersect_350 is: "+Arrays.toString(sorting.intersect_350(new int[]{1,2,2,1}, new int[]{2,2})));
		System.out.println("The intersect_350 is: "+Arrays.toString(sorting.intersect_350(new int[]{4,9,5}, new int[]{9,4,9,8,4})));


		System.out.println("\nThe intersection_2248 is: "+ sorting.intersection_2248(new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
		System.out.println("The intersection_2248 is: "+ sorting.intersection_2248(new int[][]{{1,2,3},{4,5}}));
		System.out.println("The intersection_2248 is: "+ sorting.intersection_2248(new int[][]{{1,2},{2,3}}));

		System.out.println("\nThe findDifference_2215 is: "+ sorting.findDifference_2215(new int[]{1,2,3},new int[]{2,4,6}));
		System.out.println("The findDifference_2215 is: "+ sorting.findDifference_2215(new int[]{1,2,3,3},new int[]{1,1,2,2}));

		System.out.println("\nThe distributeCandies_575 is: "+ arrayTasks.distributeCandies_575_hashset(new int[] {1,1,2,2,3,3}));
		System.out.println("The distributeCandies_575 is: "+ arrayTasks.distributeCandies_575_hashset(new int[] {1,1,2,3}));
		System.out.println("The distributeCandies_575 is: "+ arrayTasks.distributeCandies_575_hashset(new int[] {6,6,6,6}));
		System.out.println("The distributeCandies_575 is: "+ arrayTasks.distributeCandies_575_hashset(new int[] {1,1,1,1,2,2,2,3,3,3}));
		System.out.println("The distributeCandies_575 is: "+ arrayTasks.distributeCandies_575_hashset(new int[] {0,0,0,4}));
		System.out.println("The distributeCandies_575 is: "+ arrayTasks.sumOddLengthSubarrays_1588(new int[] {1,4,2,5,3}));

		System.out.println("\nThe isPowerOfFour_342 is: "+ arrayTasks.isPowerOfFour_342(16));
		System.out.println("The isPowerOfFour_342 is: "+ arrayTasks.isPowerOfFour_342(5));
		System.out.println("The isPowerOfFour_342 is: "+ arrayTasks.isPowerOfFour_342(3));
		System.out.println("The isPowerOfFour_342 is: "+ arrayTasks.isPowerOfFour_342(1));

		System.out.println("\nThe isPowerOfTwo_231 is: "+ arrayTasks.isPowerOfTwo_231(1));
		System.out.println("The isPowerOfTwo_231 is: "+ arrayTasks.isPowerOfTwo_231(16));
		System.out.println("The isPowerOfTwo_231 is: "+ arrayTasks.isPowerOfTwo_231(3));

		System.out.println("\nThe isPowerOfThree_326 is: "+ arrayTasks.isPowerOfThree_326(27));
		System.out.println("The isPowerOfThree_326 is: "+ arrayTasks.isPowerOfThree_326(0));
		System.out.println("The isPowerOfThree_326 is: "+ arrayTasks.isPowerOfThree_326(-1));

	}

}

/*

 */



