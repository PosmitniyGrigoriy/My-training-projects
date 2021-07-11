package ru.site.lesson18;

public class Start5 {
	
	static void sorting(int ... a) {
		for(int i = 0; i < a.length; i++) {
			for(int j = i + 1; j < a.length; j++) {
				int x = 0;
				if(a[i] > a[j]) {
					x = a[i];
					a[i] = a[j];
					a[j] = x;
				}
			}
			System.out.print(a[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		sorting(9, 3, 6, 1, 4, 7, -1, -7, 4, 8, 3, 1, 5);
		sorting(new int[] {3, 4, 7, -7, 4, 8});
		
		int[] array = new int[] {4, -7, 1, 3, 2};
		sorting(array);
		
	}

}
