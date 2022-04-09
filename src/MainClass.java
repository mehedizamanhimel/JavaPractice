import ConceptPractice.*;
import problems.Fibonacci;
import problems.ScannerClass;

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
		arrayTasks.merge();
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

	}

}
