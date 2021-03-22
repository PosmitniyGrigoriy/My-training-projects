// Урок от Java Blogger 007

package ru.site.array2;

import java.util.Scanner;

public class Start3 {

	public static void main (String[] args) {
		
		int[] bmw = new int[3];
		int[] audi = new int[3];
		String[] name = new String [3];
		
		int result = 0;
		int sumBMW = 0;
		int sumAudi = 0;
		
		String resultName;
		String aSurveyOfTheFirstPerson = "(опрос первого человека)\nКакой автомобиль вам нравится?\n1 - BMW, 2 - Audi\n\nВаш ответ:";
		String aSurveyOfTheSecondPerson = "------------------------------------------------------------------\n(опрос второго человека)\nКакой автомобиль вам нравится?\n1 - BMW, 2 - Audi\n\nВаш ответ:";
		String aSurveyOfTheThirdPerson = "------------------------------------------------------------------\n(опрос третьего человека)\nКакой автомобиль вам нравится?\n1 - BMW, 2 - Audi\n\nВаш ответ:";
		String repeatVote = "Такого варианта нет. Нужно указать 1 или 2. Проголосуйте еще раз.";
		String canNotVote = "Такого варианта нет. Голосовать больше нельзя.";
		String voiceAdd = "Голос принят.";
		String inputName = "Ваше имя: ";
		String resultVote ="------------------------------------------------------------------\nРезультаты опроса:\n";
		String theSurveyWasAttendedBy = "\nВ опросе приняли участие:\n";
		String votesNoCast = "Все участники опроса не верно ввели вариант ответа, поэтому были исключены. Проголосовавших нет.";
		
		Scanner on = new Scanner (System.in);
		
			for (int i = 0; i < name.length; i++) {
				if (i == 0) {
					System.out.println(aSurveyOfTheFirstPerson);
				} else if (i == 1) {
					System.out.println(aSurveyOfTheSecondPerson);
				} else if (i == 2) {
					System.out.println(aSurveyOfTheThirdPerson);
				}
				result = on.nextInt();
				if (result == 1) {
					bmw[i] = 1;
				} else if (result == 2) {
					audi[i] = 1;
				} else if (!(result == 1 & result == 2)) {
					System.out.println(repeatVote);
					result = on.nextInt();
					if (result == 1) {
						bmw[i] = 1;
					} else if (result == 2) {
						audi[i] = 1;
					} else {
						System.out.println(canNotVote);
					}
				}
				if (result == 1) {
					System.out.println(inputName);
					resultName = on.next();
					name[i] = resultName;
					System.out.println(voiceAdd);
				} else if (result == 2) {
					System.out.println(inputName);
					resultName = on.next();
					name[i] = resultName;
					System.out.println(voiceAdd);
				} else {
				}
			}
		
		// 1 вариант 1 часть. Подсчет значений в массиве через цикл:
//		for (int i = 0; i < BMW.length; i++) {
//			sumBMW = sumBMW + BMW[i];
//		}
//		for (int i = 0; i < Audi.length; i++) {
//			sumAudi = sumAudi + Audi[i];
//		}
		
//		2 вариант 1 часть. Подсчет значений в массиве вручную:
		sumBMW = bmw[0] + bmw[1] + bmw[2];
		sumAudi = audi[0] + audi[1] + audi[2];
		
//		1 и 2 варианты 3 часть. Вывод результатов голосования.
		if (sumBMW ==0 && sumAudi == 0) {
			System.out.println(resultVote  + "\n" + votesNoCast);
		} else {
			System.out.println(resultVote);
			System.out.println("За BMW - " + sumBMW);
			System.out.println("За Audi - "+ sumAudi + "\n");
			System.out.println(theSurveyWasAttendedBy);
			System.out.printf("----------------------------\n%-11s%-5s%-5s%n", "Имя       ", "За BMW ","  За Audi\n----------------------------");
		}
		
//		2 вариант 2 часть. Вывод результатов вручную, указывая каждый массив, выводит имена, убирает null с имен
		if (name[0] == null && name[1] == null && name[2] == null) {
		} else if (!(name[0] == null) && !(name[1] == null) && !(name[2] == null)) {
			System.out.printf("%-14s%-9s%-5s%n", name[0], bmw[0], audi[0]);
			System.out.printf("%-14s%-9s%-5s%n", name[1], bmw[1], audi[1]);
			System.out.printf("%-14s%-9s%-5s%n", name[2], bmw[2], audi[2]);
		} else if (!(name[0] == null) && name[1] == null && name[2] == null) {
			System.out.printf("%-14s%-9s%-5s%n", name[0], bmw[0], audi[0]);
		} else if (!(name[0] == null) && !(name[1] == null) && name[2] == null) {
			System.out.printf("%-14s%-9s%-5s%n", name[0], bmw[0], audi[0]);
			System.out.printf("%-14s%-9s%-5s%n", name[1], bmw[1], audi[1]);
		} else if (!(name[0] == null) && name[1] == null && !(name[2] == null)) {
			System.out.printf("%-14s%-9s%-5s%n", name[0], bmw[0], audi[0]);
			System.out.printf("%-14s%-9s%-5s%n", name[2], bmw[2], audi[2]);
		} else if (name[0] == null && !(name[1] == null) && name[2] == null) {
			System.out.printf("%-14s%-9s%-5s%n", name[1], bmw[1], audi[1]);
		} else if (name[0] == null && !(name[1] == null) && !(name[2] == null)) {
			System.out.printf("%-14s%-9s%-5s%n", name[1], bmw[1], audi[1]);
			System.out.printf("%-14s%-9s%-5s%n", name[2], bmw[2], audi[2]);
		} else if (name[0] == null && name[1] == null && !(name[2] == null)) {
			System.out.printf("%-14s%-9s%-5s%n", name[2], bmw[2], audi[2]);
		}
		
		// 1 вариант 2 часть.
//		if (name[0] == null && name[1] == null && name[2] == null) {
//		} else {		
//			System.out.println(theSurveyWasAttendedBy);
//			System.out.printf("----------------------------\n%-11s%-5s%-5s%n", "Имя       ", "За BMW ","  За Audi\n----------------------------");
//			for (int i = 0; i < name.length; i++) {
//				if (name[i] == null) {
//				} else if (!(name[i] == null)) {
//					System.out.printf("%-14s%-9s%-5s%n", name[i], BMW[i], Audi[i]);
//				}
//			}
//		}

		/*
		 3 человека. У каждого есть 2 варианта: или правильно отвечает (1 или 2) или не правильно, по-другому как-то. Например, 5. Получается всего 8 комбинаций условий, чтобы выводить имена тех, кто проголосовал. С ростом кол-ва вариантов ответов или с ростом кол-ва людей, кол-во комбинаций условий вывода имен проголосовавших будет сильно увеличиваться.
		
		Для 3 человек и 2 вариантов ответов будет 8 комбинаций условий вывода имен, кто голосовал:
		
		1) - - -
		2) + + +
		3) + - -
		4) + + -
		5) + - +
		6) - + -
		7) - + +
		8) - - +
		
		Там, где есть +, нужно ставить ! и в круглые скобки именно вывод этого массива делать, тогда работать будет правильно. Если соединить круглыми скобками 2 или 3 сразу, то не правильно будет работать.
		 */
		
		// Задание написано в конце файла Start.java. Сначала выводятся итоговый результаты сколько голосов за 1 и за 2 марку. Ниже выводится таблица по каждому конкретному человеку: имя и за что голосовали. Также есть ввод имени. Сделано форматирование таблицы, чтобы красиво выводились результаты.
		
	}
	
}
