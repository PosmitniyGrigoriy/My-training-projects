package ok.ru.site.grades2;

public class Options {

	public String addResult(int testResult) {

		String Result;
		String text = "Ваша оценка: ";

		if (testResult >= 51) {
			Result = "Введите правильное значение";
		} else if (testResult >= 40 && testResult <= 50) {
			Result = text + "5" + "\n" + "Превосходная работа!";
		} else if (testResult >= 30 && testResult <= 39) {
			Result = text + "4" + "\n" + "Хорошо!";
		} else if (testResult >= 20 && testResult <= 29) {
			Result = text + "3" + "\n" + "Надо подучить!";
		} else {
			Result = text + "2" + "\n" + "Посерьезнее!";
		}

		return Result;

	}

}
