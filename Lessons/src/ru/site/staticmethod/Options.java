package ru.site.staticmethod;

public class Options {
	
	void weigth () {
		System.out.println("текст 1");
	}
	
	void heigth () {
		System.out.println("текст 2");
	}
	
	
	// Добавлен статический метод, поэтому можно вызывать метод без экземпляра
	static void year () {
		System.out.println("текст 3");
	}
}
