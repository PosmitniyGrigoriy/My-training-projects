package ru.site.grades2;

public class Options {

	public String addResult(int testResult) {

		String result;
		String text = "Ваша оценка: ";

		if (testResult >= 51) {
			result = "Введите правильное значение";
		} else if (testResult >= 40 && testResult <= 50) {
			result = text + "5" + "\n" + "Превосходная работа!";
		} else if (testResult >= 30 && testResult <= 39) {
			result = text + "4" + "\n" + "Хорошо!";
		} else if (testResult >= 20 && testResult <= 29) {
			result = text + "3" + "\n" + "Надо подучить!";
		} else {
			result = text + "2" + "\n" + "Посерьезнее!";
		}

		return result;

	}

}
