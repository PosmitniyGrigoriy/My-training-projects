package ok.ru.site.grades;

public class Options {

	public char writeTestRezult (int testRezult) {
		
		char grade;		

		if (testRezult >= 90) {
			grade = 'A';
		} else if (testRezult >= 80 && testRezult <=89) {
			grade = 'B';
		} else if (testRezult >=70 && testRezult <=79) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		return grade;
	
	}
	
}