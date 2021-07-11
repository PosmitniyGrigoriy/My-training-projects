package ru.site.overload;

public class Start {

	/*
	 * Перегрузка. Аргументы могут отливаться по:
	 * 1. Количеству
	 * 2. Типу
	 * 3. Последовательности типов аргументов
	 */
	
	public static void print(char symbol) {
		System.out.println(symbol + "\n");
	}
	
	public static void print(char symbol, int times) {
		for (int i = 0; i < times; i++) {
			System.out.println(symbol);			
		}
	}
	
	public static void main(String[] args) {
		
		print('$');
		print(')', 5);
	}

}
