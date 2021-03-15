// Урок от Project of unknown source

package ru.site.exception2;

public class Start {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Не нуль делить нельзя");
		}
		
	}

}
