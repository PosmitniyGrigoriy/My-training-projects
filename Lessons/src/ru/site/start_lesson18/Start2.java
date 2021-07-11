package ru.site.lesson18;

public class Start2 {

	public static void main(String[] args) {
		
		int array[] = {1, 2, 3, 10, 11, 12, 20, 21, 22, 30, 31, 32, 40, 41, 42, 50, 51, 52, 60, 61, 62};
		int result = array.length;
		System.out.println(result);
		
		int find = 40;
		int a = find + 10;
		int b = find - 10;
		System.out.println("Искать в диапазоне от " + b + " до " + a);
		
		for(int i = 9; i < array.length; i++) {
			System.out.println("\nИндекс массива: " + i + ". Значение: " + array[i]);
			
			
//			if(array[i] > b && array[i] < a) {
			if(array[i] == 40) {
				System.out.println("Найдено число: " + array[i]);
				break;
			} else {
				System.out.println("Найдено число: " + array[i] + ". Число 40 пока не найдено. Поиск продолжается.");
			}
		}
		
	}

}
