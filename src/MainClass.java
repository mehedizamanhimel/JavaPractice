import ConceptPractice.*;
import problems.Fibonacci;
import problems.ScannerClass;

import javax.swing.*;
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
		arrayTasks.merge();

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
	}

}



