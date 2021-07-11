package ru.site.lesson19;

public class Start {

	public static void main(String[] args) {
		
		// Данный файл нужно скомпилировать и потом запускать через cmd. Там ошибки не будет, как в IDE в консоли. В cmd нужно писать java Start Hello Privet Too и выведутся 2 строки с результатами саутов
		// А то, что если запускать программу через IDE, то в консоли будет ошибка. Так и должно быть. Это особенность этого урока (этой темы).
		
		System.out.println("Нулевой элемент: " + args[0]);
		System.out.println("Длина массива: " + args.length);
		
	}

}
