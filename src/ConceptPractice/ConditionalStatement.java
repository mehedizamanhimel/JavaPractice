package ConceptPractice;

public class ConditionalStatement {
	
	public void ifStatement_marriageRules() {
		int age_boy, age_girl ;
		age_boy = 20 ;
		age_girl = 18; 
		
		if (age_boy >= 21 && age_girl >=18) {
			System.out.println("Both boy & girl is eligible for marriage. Alhamdulillah");
		}
		else if (age_boy >= 21 && age_girl <=18) {
			System.out.println("Only boy is eligible for marriage. Not the girl");
		}
		
		else if (age_boy <= 21 && age_girl >=18) {
			System.out.println("Only girl is eligible for marriage. Not the boy");
		}
		
		else if (age_boy <= 21 && age_girl <=18) {
			System.out.println("Both boy & girl are not eligible for marriage");
		}
		
	}

	
	public void NestedIfStatement() {
		
		int age = 12;
		
		if (age <30 && age >20) {
			System.out.println("you are young");
				
			}else {
				System.out.println("you are not young");
				if (age <20) {
					System.out.println("you are not only young but also teenager");
				}
				else {
					System.out.println("stop worring about your age.");
				}
			}
		}
	
}
