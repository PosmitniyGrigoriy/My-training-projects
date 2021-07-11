package ru.site.lesson19;

public class Start3 {

	public static void main(String[] args) {
		
		// v1
//		int[] array = {1, 5, 2, 6};
//		
//		for(int a : array) {
//			System.out.println(a);
//		}
		
		
		// v2_1
//		int[][] array = { {3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3} };
//		
//		for(int[] array2 : array) {
//			for(int a : array2) {
//				System.out.println(a);
//			}
//			System.out.println();
//		}

		
		// v2_2
//		int[][] array = { {3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3} };
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
		// Меняем инт значения через традишинал фор
//		int[][] array = { {3, 7, 8}, {4, 5}, {9, 4, 4, 6, 8, 3} };
//
//		array[1][0] = 10;
//		array[2][0] = 10;
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
//			}
//			System.out.println();
//		}
		
		
//		StringBuilder[][] array = new StringBuilder[3][2];
//
//		array[1][0] = new StringBuilder("Улитка 2000");
//		
//		array[2][0] = new StringBuilder("Таракан 2000");
//		
//		
//		for(int i = 0; i < array.length; i++) {
//			for(int j = 0; j < array[i].length; j++) {
////				array[1][0] = new StringBuilder("Улитка 44000");
//				System.out.println(array[i][j]);
//			}
//			System.out.println();
//		}
		
		
		
//		int[] array = {3, 5, 2, 6};
//		
//		for(int a : array) {
////			array[a] = 10;
//			System.out.println(a);
//		}
		

		
		// Показано, что фор ич не может изменить динамически элемент в массиве, если тип данных стринг билдер
//		StringBuilder sb1 = new StringBuilder("Привет");
//		StringBuilder sb2 = new StringBuilder("Пока");
//		StringBuilder sb3 = new StringBuilder("Ок");
//		
//		StringBuilder[] array = {sb1, sb2, sb3};
//		
//		for(StringBuilder sb : array) {
////			sb = new StringBuilder("ZZZ");
////			sb.append(" Java");
//			System.out.println(sb); // Если здесь сделать саут, то можно увидеть, что временно объекты стринг билдера были изменены, но потом заканчивается тело цикла, и объекты принимают первичные значения.
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
		
		// Показано, что фор ич не может изменить динамически элемент в массиве, если тип данных стринг
//		String s1 = new String("Привет");
//		String s2 = new String("Пока");
//		String s3 = new String("Ок");
//		
//		String[] array = {s1, s2, s3};
//		
//		for(String s : array) {
////			s = new String("HHH");
//			System.out.println(s); // Если здесь сделать саут, то можно увидеть, что временно объекты стринг были изменены, но потом заканчивается тело цикла, и объекты принимают первичные значения.
//		}
//		
//		for(int i = 0; i < array.length; i++) {
//			System.out.print(array[i] + " ");
//		}
		
		
		
		// Показано, что через традиционный фор можно изменить исходные элементы массива типа Стринг. Тоже самое и к Стринг Билдеру будет относиться.
//		String s1 = new String("Привет");
//		String s2 = new String("Пока");
//		String s3 = new String("Ок");
//		
//		String[] array = {s1, s2, s3};
//		
//		for(int i = 0; i < array.length; i++) {
//			array[i] = array[i] + " TEXT";
//			System.out.println(array[i]);
//		}
//		
//		System.out.println();
//		
//		for(String s : array) {
//			System.out.println(s); // Если здесь сделать саут, то можно увидеть, что временно объекты стринг были изменены, но потом заканчивается тело цикла, и объекты принимают первичные значения.
//		}
		
		
		
//		int[][] array1 = new int[3][];
//		
//		array1[0] = new int [2];
//		array1[1] = new int [4];
//		array1[2] = new int [1];
//		
//		for(int[] arr1 : array1) {
//			for(int arr2 : arr1){
//				System.out.print(arr2 + " ");
//			}
//			System.out.println();
//		}
		
		
		
		// Исходные значения первого массива изменены на 222, а второго массива на 444
//		int[] array1 = { 1, 2, 5, 7, 12 };
//		int[] array2 = { 3, 1, 9, 4, 3 };
//
//		System.out.println(array1[0] + " " + array1[1] + " " + array1[2] + " " + array1[3] + " " + array1[4]);
//		System.out.println(array2[0] + " " + array2[1] + " " + array2[2] + " " + array2[3] + " " + array2[4]);
//
//		for (int i = 0; i < array1.length && i < array2.length; i++) {
//			array1[i] = 222;
//			array2[i] = 444;
//		}
//
//		System.out.println();
//
//		System.out.println(array1[0]);
//		System.out.println(array1[1]);
//		System.out.println(array1[2]);
//		System.out.println(array1[3]);
//		System.out.println(array1[4]);
//		System.out.println();
//		System.out.println(array2[0]);
//		System.out.println(array2[1]);
//		System.out.println(array2[2]);
//		System.out.println(array2[3]);
//		System.out.println(array2[4]);
		
		
		
	}

}
