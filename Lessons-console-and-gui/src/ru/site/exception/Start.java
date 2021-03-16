// Урок от Java Blogger 007

package ru.site.exception;

import java.util.Scanner;

public class Start {

	public static void main (String[] args){
	
//		try {
//			// код, где может быть ошибка
//		} catch (Exception e) {
//			// текст предупреждения, что найден Exception
//		}
//		// программа продолжает работу (далее строки программы идут)
//		// также можно добавить еще finally { ... } внутри скобок код, который нужно обязательно выполнить в добавок к try и catch. Finally устраняет ошибку, чтобы программа дальше работала и вывела результаты.
		
		int[] BMW = new int[3];
		int[] Audi = new int[3];
		
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
		String exceptionStart = "Нужно было указать 1 или 2. Цифрами. Попробуйте еще.";
		String exceptionEnd = "Вы отвечаете не верно. Голосовать больше нельзя.";
		
		// Start1 - там через массив дедал. Работает все. Но есть 1 баг. Если вводят стринговое значение, то появляется ошибка и работа программы останавливается. Через цикл не получилось добавить модуль "исключение". Пришлось делать новый файл (этот) и по каждому отдельно человеку прописывать исключение, чтобы работало правильно.
		// В Start 2 и 3 не исправлял баг с Exception, так как это долго и нужно другое учить, новые темы. По Exception есть 1 рабочий файл (этот).
		// В пэкэдже ru.site.array2 лежат 3 Start. Этот старт1_2 улучшенный старт1 в том пэкэдже. Так как в этом старте добавлены исключения, чтобы ошибки не выводились и программа до конца смогла доработать и вывести результаты.
		
		// По первому человеку
		try {
			System.out.println(aSurveyOfTheFirstPerson);
			Scanner On = new Scanner(System.in);
			result = On.nextInt();
			if (result == 1) {
				BMW[0] = 1;
				System.out.println(voiceAdd);
			} else if (result == 2) {
				Audi[0] = 1;
				System.out.println(voiceAdd);
			} else if (!(result == 1 & result == 2)) {
				System.out.println(repeatVote);
				result = On.nextInt();
				if (result == 1) {
					BMW[0] = 1;
					System.out.println(voiceAdd);
				} else if (result == 2) {
					Audi[0] = 1;
					System.out.println(voiceAdd);
				} else {
					System.out.println(canNotVote);
				}
			}
		} catch (Exception e) {
			System.out.println(exceptionStart);
		} finally {
			try {
				if (BMW[0] == 0 && Audi[0] == 0) {
					Scanner On = new Scanner(System.in);
					result = On.nextInt();
					if (result == 1) {
						BMW[0] = 1;
						System.out.println(voiceAdd);
					} else if (result == 2) {
						Audi[0] = 1;
						System.out.println(voiceAdd);
					} else if (!(result == 1 & result == 2)) {
						System.out.println(repeatVote);
						result = On.nextInt();
						if (result == 1) {
							BMW[0] = 1;
							System.out.println(voiceAdd);
						} else if (result == 2) {
							Audi[0] = 1;
							System.out.println(voiceAdd);
						} else {
							System.out.println(canNotVote);
						}
					}
				}
			} catch (Exception e) {
				System.out.println(exceptionEnd);
			}
		}
			
		// По второму человеку
		try {
			System.out.println(aSurveyOfTheSecondPerson);
			Scanner On = new Scanner(System.in);
			result = On.nextInt();
			if (result == 1) {
				BMW[1] = 1;
				System.out.println(voiceAdd);
			} else if (result == 2) {
				Audi[1] = 1;
				System.out.println(voiceAdd);
			} else if (!(result == 1 & result == 2)) {
				System.out.println(repeatVote);
				result = On.nextInt();
				if (result == 1) {
					BMW[1] = 1;
					System.out.println(voiceAdd);
				} else if (result == 2) {
					Audi[1] = 1;
					System.out.println(voiceAdd);
				} else {
					System.out.println(canNotVote);
				}
			}
		} catch (Exception e) {
			System.out.println(exceptionStart);
		} finally {
			try {
				if (BMW[1] == 0 && Audi[1] == 0) {
					Scanner On = new Scanner(System.in);
					result = On.nextInt();
					if (result == 1) {
						BMW[1] = 1;
						System.out.println(voiceAdd);
					} else if (result == 2) {
						Audi[1] = 1;
						System.out.println(voiceAdd);
					} else if (!(result == 1 & result == 2)) {
						System.out.println(repeatVote);
						result = On.nextInt();
						if (result == 1) {
							BMW[1] = 1;
							System.out.println(voiceAdd);
						} else if (result == 2) {
							Audi[1] = 1;
							System.out.println(voiceAdd);
						} else {
							System.out.println(canNotVote);
						}
					}
				}
			} catch (Exception e) {
				System.out.println(exceptionEnd);
			}
		}
			
		// По второму человеку
		try {
			System.out.println(aSurveyOfTheThirdPerson);
			Scanner On = new Scanner(System.in);
			result = On.nextInt();
			if (result == 1) {
				BMW[2] = 1;
				System.out.println(voiceAdd);
			} else if (result == 2) {
				Audi[2] = 1;
				System.out.println(voiceAdd);
			} else if (!(result == 1 & result == 2)) {
				System.out.println(repeatVote);
				result = On.nextInt();
				if (result == 1) {
					BMW[2] = 1;
					System.out.println(voiceAdd);
				} else if (result == 2) {
					Audi[2] = 1;
					System.out.println(voiceAdd);
				} else {
					System.out.println(canNotVote);
				}
			}
		} catch (Exception e) {
			System.out.println(exceptionStart);
		} finally {
			try {
				if (BMW[2] == 0 && Audi[2] == 0) {
					Scanner On = new Scanner(System.in);
					result = On.nextInt();
					if (result == 1) {
						BMW[2] = 1;
						System.out.println(voiceAdd);
					} else if (result == 2) {
						Audi[2] = 1;
						System.out.println(voiceAdd);
					} else if (!(result == 1 & result == 2)) {
						System.out.println(repeatVote);
						result = On.nextInt();
						if (result == 1) {
							BMW[2] = 1;
							System.out.println(voiceAdd);
						} else if (result == 2) {
							Audi[2] = 1;
							System.out.println(voiceAdd);
						} else {
							System.out.println(canNotVote);
						}
					}
				}
			} catch (Exception e) {
				System.out.println(exceptionEnd);
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
		sumBMW = BMW[0] + BMW[1] + BMW[2];
		sumAudi = Audi[0] + Audi[1] + Audi[2];
		
		if (sumBMW ==0 && sumAudi == 0) {
			System.out.println(resultVote  + "\n" + votesNoCast);
		} else {
			System.out.println(resultVote);
			System.out.println("За BMW - " + sumBMW);
			System.out.println("За Audi - "+ sumAudi + "\n");
		}
		
		// Задание. Есть 2 автомобиля. БМВ и Ауди. Опросить 3-х человек: какой автомобиль нравится? Сделать ввод через консоль. Вывести результаты: сколько проголосовало за БМВ, а сколько за Ауди. Если первый раз вводят не 1 и не 2, то выводить ошибку, и давать еще 1 шанс, чтобы ответить, но если во второй раз было указано не верное значение, то больше попытки не давать и переходить к следующему человеку.
		// Добавил в это задание еще исключения, чтобы не было ошибок и программа до конца доработала и вывела результат.

	}
	
}
