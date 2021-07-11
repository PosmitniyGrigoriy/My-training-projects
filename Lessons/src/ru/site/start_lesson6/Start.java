package ru.site.lesson6;

public class Start {

	public static void main(String[] args) {
		
		Method method = new Method();
		
		method.sum(); // 0
		method.sum(1); // 1
		method.sum(1,2); // 3
		method.sum(1,2,3); // 6
		method.sum(1,2,3,4); // 10
		method.sum("Привет, ", "Мир!");
		
	}

}
