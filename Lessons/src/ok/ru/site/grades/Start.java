// Урок от Book Yakov Fine

package ok.ru.site.grades;

public class Start {

	public static void main(String[] args) {

		Options Grades = new Options ();
		
		System.out.println("----------------------");
		
		char rezult = Grades.writeTestRezult(92);
		System.out.println("Ваша первая оценка: " + rezult);
		
		switch (rezult) {
		case 'A':
			System.out.println("Превосходная работа!");
			break;
		case 'B':
			System.out.println("Хорошая работа!");
			break;
		case 'C':
			System.out.println("Нужно подучить!");
			break;
		case 'D':
			System.out.println("Посерьезнее!");
			break;
		}
		
		System.out.println("----------------------");
		
		rezult = Grades.writeTestRezult(82);
		System.out.println("Ваша вторая оценка: " + rezult);
		
		switch (rezult) {
		case 'A':
			System.out.println("Превосходная работа!");
			break;
		case 'B':
			System.out.println("Хорошая работа!");
			break;
		case 'C':
			System.out.println("Нужно подучить!");
			break;
		case 'D':
			System.out.println("Посерьезнее!");
			break;
		}
		
		System.out.println("----------------------");
		
	}

}
