package ru.site.lesson14;

public class Start {

	static int test(int i) {
		return i;
	}
	
	public static void main(String[] args) {
		
		// От 1 по 10
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
		
		// С 10 по 1
//		for (int i = 10; i >= 1; i--) {
//			System.out.println("1: " + i);
//		}
		
		// Есть 2 переменные. Одна считает от 1 по 10, вторая считает с 10 по 1
//		for (int i = 1, j = 10; i <= 10 && j >= 1; i++, j --) {
//			System.out.println(i + " " + j);
//		}
		
		// С 10 по 1, но другой вариант.
//		for (int i = 10; i >= 1; --i) {
//			System.out.println("2: " + i);
//		}
		
		// Вывод четных значений
//		for (int i = 2; i <= 10; i = i + 2) {
//			System.out.println(i);
//		}
		
		// Вывод четных значений через метод
//		for (int i = 2; i <= 20; i = i + test(2)) {
//			System.out.println(i);
//		}
		
		// Запускается бесконечный цикл. Будет работать, пока памяти хватает у компьютера.
		// Условие пустое. Не указано. Так тоже работать будет. Значит всегда true, значит цикл бесконечный.
//		for (int i = 1; ; i++) {
//			System.out.println(i);
//		}
		
		// В условии false. Смысла от такого условия нет и от цикла тоже смысла нет, так как он никогда не выполниться. Ни разу.
		// Также выводится ошибка. Что нужно удалить false.
//		for (int i = 1; false ; i++) {
//			System.out.println(i);
//		}
		
		// С break
//		for (int i = 1; i <= 10; i++) {
//			if (i == 6) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		// С continue
//		for (int i = 1; i <= 10; i++) {
//			if (i == 6 | i == 8 | i == 9) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		// Сначала исключает 4 значения, а потом заканчивает цикл, когда доходит до определенного значения
//		for (int i = 1; i <=50; i++) {
//			if (i == 10 | i == 20 | i == 30 | i == 40) {
//				continue;
//			}
//			if (i == 45) {
//				break;
//			}
//			System.out.println(i);
//		}
		
		// Вывод времени через вложенный цикл
//		for (int a = 0; a <= 2; a++) {
//			for (int b = 0; b <= 9; b++) {
//				if (a == 2 && b == 4) {
//					break;
//				}
//				for (int c = 0; c <= 5; c++) {
//					for (int d = 0; d <= 9; d++) {
//						System.out.println(a + "" + b + " : " + c + "" + d);
//					}
//				}
//			}
//		}
		
//		for (int a = 0; a <= 23; a++) {
//				for (int b = 0; b <= 59; b++) {
//						System.out.println(a + " : " + b);
//			}
//		}
		
	}

}
