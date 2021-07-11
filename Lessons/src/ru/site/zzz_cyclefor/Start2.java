package ru.site.cyclefor;

public class Start2 {

	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		for (int i = 0; i < 100; i++) {
			array[i] = i;
		}
		
		for (int i = 0; i < 100 - 2; i++ ) {
			int j;
			int k;
			System.out.print(array[i] + ": ");
			for (k = 0; k < 3; k++) {
				j = i + k;
				System.out.print(array[j] + " ");
			}
			System.out.println();
		}
		
	}

}
