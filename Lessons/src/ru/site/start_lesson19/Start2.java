package ru.site.lesson19;

public class Start2 {

	// v1
	static void total(int ... a) {
		int total = 0;
		for(int i= 0; i < a.length; i++) {
		total += a[i];
		}
		System.out.println(total);
	}
	
	
	// v2
	static void total2(int [] a) {
		int total = 0;
		for(int i= 0; i < a.length; i++) {
		total += a[i];
		}
		System.out.println(total);
	}
	
	
	// v3
//	static void total3(String text1, int [] a) { // v3_1
	static void total3(String text1, int ... a) { // v3_2
		int total = 0;
		for(int i= 0; i < a.length; i++) {
		total += a[i];
		}
		System.out.println(total);
		System.out.println(text1); // Добавлен еще 1 саут для вывода стринг
	}
	
	
	// v4
	static void total4(String text1, int [] a, String text2) {
		int total = 0;
		for(int i= 0; i < a.length; i++) {
		total += a[i];
		}
		System.out.println(total);
		System.out.println(text1 + " " + text2); // Добавлен еще 1 саут для вывода стринг (текст 1 и текст 2)
	}
	
	
	private static void abc(int a, int ... b) { System.out.println(b.length); }
	
	
//	public void text(String[] text) { System.out.println(text); } // v1
//	public void text(String ... text) { System.out.println(text); } // v2
	
	
	
	public static void main(String[] args) {

		// v1
		total(3, 5, 2); // Можно указывать разное количество аргументов и в консоли будет выводиться сумма
		
		
		// v2
		total2(new int[] {3, 5, 1}); // Можно указывать разное количество аргументов и в консоли будет выводиться сумма
		
		
		// v3
//		total3( "Текст", new int[] {3, 5, 12}); // v3_1 Можно указывать разное количество аргументов и в консоли будет выводиться сумма
		total3("Текст", 3, 5, 1); // v3_2 Можно указывать разное количество аргументов и в консоли будет выводиться сумма		
		
		
		// v4
		total4("Текст1", new int[] {30, 50, 10}, "Текст2");
		
		
		
		// Над main есть метод private static void abc(int a, int ... b) { System.out.println(b.length); }
		// Код ниже для этого метода. По очереди раскомментировать и смотреть на результат. Ошибочные варианты оставлять и обратно комментировать
		
//		abc(2, new int[2]);
//		abc(2, {0, 1});
//		abc(1, {2});
//		abc(0, 1, 2);
//		abc(0, 1);
//		abc(3);
//		abc();

		
		
		
		
		
		
		
	}

}
