package ru.site.lesson18;

public class Start {
	
	static void sorting(int a, int b, int c, int d) {
		int array[] = {a, b, c, d};
		int array2[] = new int [1];

		// 4 8 6 1
		System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
		System.out.println();
		
		for(int i = 0; i < array.length; i++) {
			if (array[0] > array[1]) {
				array2[0] = array[0];
				array[0] = array[1];
				array[1] = array[2];
				array[2] = array[3];
				array[3] = array2[0];
//				System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
			}
			if (array[1] > array[2]) {
				array2[0] = array[1];
				array[1] = array[2];
				array[2] = array[3];
				array[3] = array2[0];
//				System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
			}
			if (array[2] > array[3]) {
				array2[0] = array[2];
				array[2] = array[3];
				array[3] = array2[0];
//				System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
			}
		}
		System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
	}
	
	public static void main(String[] args) {
		
		sorting(4, 8, 6, 1);
		
	}

}
