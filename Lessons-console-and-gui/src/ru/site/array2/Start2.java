// Урок от Java Blogger 007

package ru.site.array2;

import java.util.Scanner;

public class Start2 {

	public static void main (String[] args) {
		
		int[] bmw = new int[3];
		int[] audi = new int[3];
		String[] name = new String [3];
		
		// Как нужно прописывать условия, чтобы они работали. Для массива String и для массива int по-разному нужно оформлять условия
//		if (BMW[0] == 1 | Audi[0] == 1) { } else { } // если указана переменная массива int, то нужно писать цифрру. Если писать null, то будет ошибка (данное значение в массиве, например, [0] не пустое (not null), скорей там по умолчанию 0 стоит, поэтому он и ошибку выводит. Указывать цифру и ошибки не будет.
//		if (name[0] == null | name[0] == null) { } else { } // если указана переменная массива стринг, то нужно писать null или текст в кавычках. Если будет число, то это уже int, а не String, и при int появится ошибка. Что не может сконвертировать String в int.
		// Если писать инт в массиве и потом делать условие по этому массиву (if), если было указано инт, и если в условие if было указано null, то будет ошибка, что в инте не может быть null, но если инт переименовать на Integer, то будет работать null.
		
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
		for (int i = 0; i < bmw.length; i++) {
			sumBMW = sumBMW + bmw[i];
		}
		for (int i = 0; i < audi.length; i++) {
			sumAudi = sumAudi + audi[i];
		}
		
//		2 вариант 1 часть. Подсчет значений в массиве вручную:
//		sumBMW = BMW[0] + BMW[1] + BMW[2];
//		sumAudi = Audi[0] + Audi[1] + Audi[2];
		
//		1 и 2 варианты 3 часть. Вывод результатов голосования.
		if (sumBMW ==0 && sumAudi == 0) {
			System.out.println(resultVote  + "\n" + votesNoCast);
		} else {
			System.out.println(resultVote);
			System.out.println("За BMW - " + sumBMW);
			System.out.println("За Audi - "+ sumAudi + "\n");
		}
		
//		2 вариант 2 часть. Вывод результатов вручную, указывая каждый массив, выводит имена, убирает null с имен
//		if (name[0] == null && name[1] == null && name[2] == null) {
//		} else if (!(name[0] == null) && !(name[1] == null) && !(name[2] == null)) {
//			System.out.println(theSurveyWasAttendedBy + name[0] + ", " + name[1] + ", " + name[2]);
//		} else if (!(name[0] == null) && name[1] == null && name[2] == null) {
//			System.out.println(theSurveyWasAttendedBy + name[0]);
//		} else if (!(name[0] == null) && !(name[1] == null) && name[2] == null) {
//			System.out.println(theSurveyWasAttendedBy + name[0] + ", " + name[1]);
//		} else if (!(name[0] == null) && name[1] == null && !(name[2] == null)) {
//			System.out.println(theSurveyWasAttendedBy + name[0] + ", " + name[2]);
//		} else if (name[0] == null && !(name[1] == null) && name[2] == null) {
//			System.out.println(theSurveyWasAttendedBy + name[1]);
//		} else if (name[0] == null && !(name[1] == null) && !(name[2] == null)) {
//			System.out.println(theSurveyWasAttendedBy + name[1] + ", " + name[2]);
//		} else if (name[0] == null && name[1] == null && !(name[2] == null)) {
//			System.out.println(theSurveyWasAttendedBy + name[2]);
//		}
		
		// 1 вариант 2 часть.
		if (name[0] == null && name[1] == null && name[2] == null) {
		} else {		
			System.out.println(theSurveyWasAttendedBy);
			for (int i = 0; i < name.length; i++) {
				if (name[i] == null) {
				} else if (!(name[i] == null)) {
					System.out.println(name[i]);
				}
			}
		}
		
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
		
		// Задание написано в конце файла Start.java. В Start2 добавлен ввод имени и вывод всех имен, кто принимал участие в опросе. Если не верно 2 раза введен ответ, то имя не спрашивать, а результат null не выводить в списке имен, кто голосовал.
		
	}
	
}
