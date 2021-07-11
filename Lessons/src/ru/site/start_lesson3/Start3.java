package ru.site.lesson3;

public class Start3 {

	public static void main(String[] args) {
		
		// Задание 1
		int a = 5;
		int b = 8;
		
		System.out.println((a--)-(--a)+(++a)+(a++)+a); // 15
		System.out.println((++b)-(b++)+(++b)-(--b)); // 1
		
		// Задание 2
		int i1 = 5;
		int i2 = 11;
		double d1 = 5.5;
		double d2 = 1.3;
		long l = 20L;
		double result = 0;
		result = i2 / d1 + d2 % i1 - l;
		System.out.println("Ответ на второе задание: "+ result);
		
	}

}
