package basicPractice;

public class SwitchStatementClass {
	

	
	public void switchStatement() {
		
		int statement, statement2, statement3; 
		statement = 2;
		
		switch (statement) {
		case 1:
			System.out.println("this is for case 1");
			break;
			
		case 2:
			System.out.println("this is for case 2");
			break;
			
		case 3:
			System.out.println("this is for case 3");
			break;

		default:
			System.out.println("This is for if the value is out of range");
			break;
		}
	}

}
