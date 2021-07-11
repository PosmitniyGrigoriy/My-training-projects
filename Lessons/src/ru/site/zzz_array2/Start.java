// Урок от Java Blogger 007

package ru.site.array2;

import java.util.Scanner;

public class Start {

	public static void main (String[] args){
	
		int[] bmw = new int[3];
		int[] audi = new int[3];
		
		int result = 0;
		int sumBMW = 0;
		int sumAudi = 0;
		
		String aSurveyOfTheFirstPerson = "(опрос первого человека)\nКакой автомобиль вам нравится?\n1 - BMW, 2 - Audi\n\nВаш ответ:";
		String aSurveyOfTheSecondPerson = "------------------------------------------------------------------\n(опрос второго человека)\nКакой автомобиль вам нравится?\n1 - BMW, 2 - Audi\n\nВаш ответ:";
		String aSurveyOfTheThirdPerson = "------------------------------------------------------------------\n(опрос третьего человека)\nКакой автомобиль вам нравится?\n1 - BMW, 2 - Audi\n\nВаш ответ:";
		String repeatVote = "Такого варианта нет. Нужно указать 1 или 2. Проголосуйте еще раз.";
		String canNotVote = "Такого варианта нет. Голосовать больше нельзя.";
		String resultVote ="------------------------------------------------------------------\nРезультаты опроса:\n";
		String voiceAdd = "Голос принят.";
		String votesNoCast = "Все участники опроса не верно ввели вариант ответа, поэтому были исключены. Проголосовавших нет.";
		
		Scanner on = new Scanner (System.in);
		
		for (int i = 0; i < bmw.length; i++) {
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
				System.out.println(voiceAdd);
			} else if (result == 2) {
				audi[i] = 1;
				System.out.println(voiceAdd);
			} else if (!(result == 1 & result == 2)) {
				System.out.println(repeatVote);
				result = on.nextInt();
				if (result == 1) {
					bmw[i] = 1;
					System.out.println(voiceAdd);
				} else if (result == 2) {
					audi[i] = 1;
					System.out.println(voiceAdd);
				} else {
					System.out.println(canNotVote);
				}
			}
		}
		
		// Вывод результатов через цикл
//		for (int i = 0; i < BMW.length; i++) {
//			sumBMW = sumBMW + BMW[i];
//		}
//		
//		for (int i = 0; i < Audi.length; i++) {
//			sumAudi = sumAudi + Audi[i];
//		}
		
		// Вывод результатов вручную, указывая каждый массив
		sumBMW = bmw[0] + bmw[1] + bmw[2];
		sumAudi = audi[0] + audi[1] + audi[2];
		
		if (sumBMW ==0 && sumAudi == 0) {
			System.out.println(resultVote  + "\n" + votesNoCast);
		} else {
			System.out.println(resultVote);
			System.out.println("За BMW - " + sumBMW);
			System.out.println("За Audi - "+ sumAudi + "\n");
		}
		
		// Задание. Есть 2 автомобиля. БМВ и Ауди. Опросить 3-х человек: какой автомобиль нравится? Сделать ввод через консоль. Вывести результаты: сколько проголосовало за БМВ, а сколько за Ауди. Если первый раз вводят не 1 и не 2, то выводить ошибку, и давать еще 1 шанс, чтобы ответить, но если во второй раз было указано не верное значение, то больше попытки не давать и переходить к следующему человеку.


	}
	
}
