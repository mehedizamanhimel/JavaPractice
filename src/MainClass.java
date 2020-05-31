import java.util.Scanner;

public class MainClass {
public static void main(String[] args) {
	
	SwitchStatementClass switchClass = new SwitchStatementClass();
	ConditionalStatement conditionalStatements = new ConditionalStatement();
	ScannerClass scanner = new ScannerClass();
	WhileLoop whileLoop = new WhileLoop();
	ConditionalOperator conditionalOperator = new ConditionalOperator();
	Loop_Class loopClass = new Loop_Class();
	Array_Class arrayClass = new Array_Class();
	SampleProgrammingProblems sampleProgram = new SampleProgrammingProblems();
	
	
	
	switchClass.switchStatement();
	conditionalStatements.ifStatement_marriageRules();
	//scanner.initialScanner_Test();
	whileLoop.settingWhile_Int();

	conditionalStatements.NestedIfStatement();
	conditionalOperator.testing_Conditional_Operator();
	loopClass.forLoop();
	
}
}
