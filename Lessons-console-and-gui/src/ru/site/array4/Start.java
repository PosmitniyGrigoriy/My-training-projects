// Урок от Java Blogger 007

package ru.site.array4;

public class Start {

	public static void main(String[] args) {
		
		int[] numbers = new int[6];
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		numbers[3] = 4;
		numbers[4] = 5;
		numbers[5] = 6;
//		System.out.println(numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4] + " " + numbers[5]); // ниже есть вывод через i, так что указывать вручную не нужно
		int sumNumbers = 0;
		for (int i = 5; i >= 0; i--) { // выведено в обратном порядке
			System.out.print(numbers[i] + " "); // если будет println, то он выведет на каждой строке по 1 цифре, а нужно на 1 строке. Поэтому или вручную прописывать с 0 по 5 значение массива или делать print и после вывода i еще делать + " ", тогда будет делаться отступ и можно в 1 строку вывести результат.
			sumNumbers += numbers[i];
		}
		System.out.println("\nСумма массива: " + sumNumbers);
		
		
		for (int i = 1; i < numbers.length; i = i + 2) { // вывод четных цифр
			System.out.print(numbers[i] + " "); // если будет println, то он выведет на каждой строке по 1 цифре, а нужно на 1 строке. Поэтому или вручную прописывать с 0 по 5 значение массива или делать print и после вывода i еще делать + " ", тогда будет делаться отступ и можно в 1 строку вывести результат.
			sumNumbers += numbers[i];
		}
		
		
		System.out.println("\n-------------");
		int[] numbers2 = {1, 2, 3, 4, 5, 6};
		for (int i = 0; i < numbers2.length; i++) {
			System.out.print(numbers2[i] + " "); // если будет println, то он выведет на каждой строке по 1 цифре, а нужно на 1 строке. Поэтому или вручную прописывать с 0 по 5 значение массива или делать print и после вывода i еще делать + " ", тогда будет делаться отступ и можно в 1 строку вывести результат.
		}
	}

}
