package ru.site.lesson18;

public class Start4 {
	
	public static int[] sorting(int[] array) {
		int a;
		for(int i = 0; i < array.length; i++) {
			int min = array[i];
			int index = i;
			for(int j = i + 1; j < array.length; j++) {
				if(array[j] < min) {
					min = array[j];
					index = j;
				}
			}
			if(i != index) {
				a = array[i];
				array[i] = min;
				array[index] = a;
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		
		int[] array = {5, 8, 1, -3, 0, 8, 2, 2};
		sorting(array);
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
	}

}
