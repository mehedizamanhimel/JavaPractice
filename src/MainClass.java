public class MainClass implements Runnable{

	@Override
	public void run() {
		System.out.println("Thread has ended");
	}
	public static void main(String[] args) {
	
	SwitchStatementClass switchClass = new SwitchStatementClass();
	ConditionalStatement conditionalStatements = new ConditionalStatement();
	ScannerClass scanner = new ScannerClass();
	WhileLoop whileLoop = new WhileLoop();
	ConditionalOperator conditionalOperator = new ConditionalOperator();
	Loop_Class loopClass = new Loop_Class();
	SampleProgrammingProblems sampleProgram = new SampleProgrammingProblems();
	

	AbsoluteValue absoluteValue = new AbsoluteValue();
	arrayTasks arrays = new arrayTasks();
	FileSystem files = new FileSystem();
	Loop loop = new Loop();
	reverseString reverse = new reverseString();

	loop.whileLoopOne();
		loop.DoWhileLoop();

	arrays.listSortStringTwo();

	MainClass main = new MainClass();
	Thread thread = new Thread(main);
	thread.start();
	System.out.println("test");

	reverse.reverStringWithScanner();


	
}
}
