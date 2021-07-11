package ru.site.lesson12;

public class Start2 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		boolean result = true;
		
		if(a < 20)
		System.out.println("Текст 1");
		System.out.println("Текст 2");
		
		
		System.out.println();
		
		
		
		if(b < 20)
		System.out.println("Текст 1");
		System.out.println("Текст 2");
		
		System.out.println();
		
		// Вложенный if
		if(b > a)
			if(a > b) {
				System.out.println("да1");
			} else {
				System.out.println("нет1");
			}

		if(true) {
			System.out.println("да2");
		}
		
		
		
		
		
		if (result == false) {
			System.out.println("да3");
		}
		if (result == true) {
			System.out.println("да3_2");
		}
//		True или False не может быть > 10, поэтому на строке ниже будет ошибка.
//		if (result > 10) {
//			System.out.println("да4");
//		}
//		В примере ниже true пристваивается в result. Ошибки компиляции нет. При запуске программы выведется да5. Так тоже можно делать для true и false
		if(result = true) {
			System.out.println("да5");
		}
//		True или False не может быть == 10, поэтому на строке ниже будет ошибка. Нельзя инт преобразовать в булиэн.
//		if(result == 10) {
//			System.out.println("да6");
//		}
//		True или False не может быть = 10, поэтому на строке ниже будет ошибка.
//		if(result = 10) {
//			System.out.println("да6");
//		}

		
	}

}
