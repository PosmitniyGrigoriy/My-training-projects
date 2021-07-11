package ru.site.lesson15;

public class Start {

	public static void main(String[] args) {
		
		// Нужно 1 цикл использовать, тогда ошибки не будет. Если будет 2 цикла раскомментированных или более, то будет ошибка и IDE предложит удалить полностью цикл.
		
		// Бесконечный цикл, так как условие цикла всегда будет true
//		int a = 1;
//		while(1 < 10) {
//			System.out.println(a);
//			a++;
//		}
		
		// Цикл выведет от 1 по 9
		// Если закомментировать a1++;, то будет бесконечный цикл с выводом 1.
//		int a1 = 1;
//		while (a1 < 10) {
//			System.out.println(a1);
//			a1++;
//		}
		
		// Пока деньги > 0 возможно сделать ставку. Как только денег 0 или меньше 0, возможность делать ставку пропадает
//		int money = 50;
//		int bet = 10;
//		System.out.println("Баланс: " + money + "\n");
//		while (money > 0) {
//			System.out.println("Сделайте ставку");
//			System.out.println("Вы сделали ставку: " + bet);
//			System.out.println("Вы проиграли");
//			System.out.println("Баланс: " + (money -= bet) + "\n");
//		}
		
		// У while есть условие. Там или true или false изначально. Через код мы можем влиять на условие и заменить true на false.
//		boolean b = true;
//		int a = 1;
//		while (b) {
//			System.out.println(a);
//			if (a % 3 == 0 && a % 7 == 0) {
//				b = false;
//			}
//			a++;
//		}
		
		// В данном примере есть оставить первый саут, а второй, третий, четвертый закомментировать, то выведется 1 и 2, далее будет на 2 false и 3-е значение не выведется.
		// Но при получениии false, идет последний заход по false. И дополнительные false показывают, что после a++ получается 3, но она уже не выводится, так как был получен false.
//		boolean b = true;
//		int a = 1;
//		while (b) {
//			System.out.println(a);
//			if (a == 2) {
//				System.out.println(a);
//				b = false;
//			}
//			System.out.println(a);
//			a++;
//			System.out.println(a);
//		}
		
		// Выведется 7, 9, 11, так как false еще считает и выводит значение (а это 11).
//		int a = 5;
//		while (a++ < 10) {
//			a++;
//			System.out.println(a);
//		}
		
		// Выведется 7 и 9. Считает сам, у меня вышло 10, но 10 не выводится почему-то.
//		int a = 5;
//		while (++a < 10) {
//			a++;
//			System.out.println(a);
//		}
		
		// Если с первой итерации false, то в тело программы не заходит.
		
		// Ничего не выведется
//		int a = 5;
//		while(a==10) {
//			System.out.println("Текст");
//		}
		
//		int a = 5;
//		while(a == 10); // false
//		System.out.println(a);

		// Это был бы бесконечный цикл, и пока он идет, нет вывода саута.
//		int a = 5;
//		while(a < 10);
//		System.out.println(a);

		// Do while отличается от while тем, что сначала делает хотя бы 1 раз, а потом проверяет условие.
		
		// Вывод от 1 по 10
//		int a = 1;
//		do {
//			System.out.println(a);
//			a++;
//		} while(a <= 10);
		
		
		// Важно смотреть где в do while и while стоит statement i++ (вначале или в конце), так как это важно. От этого будет зависить вывод.
		// Вывод от 2 по 11
//		int a = 1;
//		do {
//			a++;
//			System.out.println(a);
//		} while(a <= 10);

		// Выведен 1
//		int a = 1;
//		do {
//			System.out.println(a);
//			a++;
//		} while(a == 10);
		
		// Можно комбинировать циклы. Использовать do while, далее вложенный while или наоборот
		
		
		// Вывод времени от 00:00 до 23:59. Сначала while, далее do while
//		int hour = -1;
//		while(hour < 23) {
//			hour++;
//			int minutes = 1;
//			do {
//				System.out.println(hour + " : " + minutes);
//				minutes++;
//			} while(minutes <= 59);
//		}
		
		// Вывод времени от 00:00 до 23:59. Сначала do while, далее while
//		int hour = -1;
//		do {
//			hour++;
//			int minutes = 0;
//			while(minutes < 60) {
//				System.out.println(hour + " : " + minutes);
//				minutes++;
//			}
//		} while(hour < 23);
				
		// Вывод времени от 00:00 до 23:59. Сначала for, далее while
//		for(int hour = 0; hour < 24; hour++) {
//			int minutes = 0;
//			while(minutes < 60) {
//				System.out.println(hour + " : " + minutes);
//				minutes++;
//			}
//		}
		
		// Как только j становится равна 6, то основной цикл завершается
//		OUTER: for(int i = 0; i < 10; i++) {
//			INNER: for(int j = 0; j < 15; j++) {
//				if (j == 6) {
//					break OUTER;
//				}
//				System.out.println(i + " : " + j);
//			}
//		}
		
		// Создан бесконечный цикл
//		for (int i = 0; ; i++) {
//			for (int j = 0; ; j++) {
//				if (j == 6) {
//					break;
//				}
//				System.out.println(i + " : " + j);
//			}
//		}
		
		
		// Шаг за шагом идти и анализировать программу, чтобы понять как она работает и понять что будет в результате вывода
		
		// Инициализация переменной в do while и в while в самом начале идет, а потом уже цикл начинать писать.
		
		// Для цикла do while. Если переменную a объявить не до do, а внутри тела do {...}, то потом нужно писать while (a < 10); и переменная а не распознается, так как переменная а в области видимости тела do. Будет ошибка. Переменная объявляется внутри тела и видна внутри тела.
		
	}

}
