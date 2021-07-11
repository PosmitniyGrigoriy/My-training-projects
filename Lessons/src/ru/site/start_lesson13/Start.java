package ru.site.lesson13;

public class Start {
	
	int z;
	
	public Start(int z) {
		this.z = z;
	}
	
	static String setExpression(String setWord) {
		setWord = setWord;
		return setWord;
	}

	public static void main(String[] args) {
		
		// для if
		byte a = 5;
		short b = 5;
		int c = 5;
		long d = 5L;
		float e = 5F;
		double f = 5;
		char g = 'a';
		boolean z1 = true;
		boolean z2 = false;
		String text1 = "Текст";
		
		// для switch
		byte a1 = 1;
		short b1 = 1;
		int c1 = 1;
//		long d1 = 1L; // Такой тип данных нельзя использовать в переключателе
//		float e1 = 1F; // Такой тип данных нельзя использовать в переключателе
//		double f1 = 1; // Такой тип данных нельзя использовать в переключателе
		char g1 = 'a';
//		boolean z11 = true; // Такой тип данных нельзя использовать в переключателе
//		boolean z21 = false; // Такой тип данных нельзя использовать в переключателе
		String text2 = "Текст";
		
		// В выражениях ниже (* * *) или тру получается, или фолс, поэтому данные выводятся через саут. Если получалось бы другое что-то, то не выводилось бы. Была ошибка.
		if (a > 2) {
//		if (b > 2) {
//		if (c > 2) {
//		if (d > 2) {
//		if (e > 2) {
//		if (f > 2) {
//		if (g > 2) {
//		if (z1) {
//		if (z2) {
//		if (a == 6) {
//		if (z2 == true) {
//		if (z2 == false) {

//		if (text1 == 1) { // Здесь ошибка. Так как к другому типу значение другого типа присваивается. Так делать нельзя.
//		if (text1 == true) { // Здесь ошибка. Так как к другому типу значение другого типа присваивается. Так делать нельзя.
//		if (a = true) { // Здесь ошибка. Так как к другому типу значение другого типа присваивается. Так делать нельзя.
		
		System.out.println("Первое значение больше второго");
		} else {
			System.out.println("Текст 2");
		}
		
		System.out.println("\nПереключатель с case, где цифры:");
		switch(a1) {
		case 1:
			System.out.println("Первый");
			break;
		case 2:
			System.out.println("Второй");
			break;
		default:
			System.out.println("Последний");
		}
		
		System.out.println("\nПереключатель с case, где чар:");
		switch(g1) {
		case '1':
			System.out.println("Первый");
			break;
		case 'y':
			System.out.println("Второй");
			break;
		default:
			System.out.println("Последний");
		}
		
		System.out.println("\nПереключатель с case, где стринг:");
		switch(text2) {
		case "1":
			System.out.println("Текст 1");
			break;
		case "Текст":
			System.out.println("Текст 3");
			break;
		case "y":
			System.out.println("Текст 2");
			break;
		default:
			System.out.println("Еще один текст");
		}
		
		Start test = new Start(10);
		
		System.out.println("\nПереключатель с case, где значение конструктора:");
		switch(test.z) {
		case 1:
			System.out.println("Текст 1");
			break;
		case 10:
			System.out.println("Текст 3");
			break;
		case 2:
			System.out.println("Текст 2");
			break;
		default:
			System.out.println("Еще один текст");
		}
		
		System.out.println("\nПереключатель с case, где значение слово:");
		switch("words") {
		case "key":
			System.out.println("Текст 1");
			break;
		case "words":
			System.out.println("Текст 3");
			break;
		case "base":
			System.out.println("Текст 2");
			break;
		default:
			System.out.println("Еще один текст");
		}
		
		System.out.println("\nПереключатель с case, где используется метод для ввода значения:");
		switch(Start.setExpression("base")) {
		case "key":
			System.out.println("Текст 1");
			break;
		case "words":
			System.out.println("Текст 3");
			break;
		case "base":
			System.out.println("Текст 2");
			break;
		default:
			System.out.println("Еще один текст");
		}
		
	}

}
