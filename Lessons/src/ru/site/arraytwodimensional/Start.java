// Урок от Byte++

package ru.site.arraytwodimensional;

public class Start {

	public static void main(String[] args) {
		
		// Двух-мерный массив. В примере ниже размер 4 на 3.
		// Сначала отображается строка, затем столбик.
		
//		Первое значение - номер строки, второе значение - номер столбика
//		00  01  02  03
//		10  11  12  13
//		20  21  22  23
		
//		Пример:
//		1  2  3  4
//		5  6  7  8
//		9 10 11 12
		
		int[][] mass1 = new int[3][4];
		
		mass1 [0][0] = 1;
		mass1 [0][1] = 2;
		mass1 [0][2] = 3;
		mass1 [0][3] = 4;
		mass1 [1][0] = 5;
		mass1 [1][1] = 6;
		mass1 [1][2] = 7;
		mass1 [1][3] = 8;
		mass1 [2][0] = 9;
		mass1 [2][1] = 10;
		mass1 [2][2] = 11;
		mass1 [2][3] = 12;
		
		System.out.println("Результат:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mass1[i][j] + " ");
			}
			System.out.println();
		}
		
		// ----------------------------
		
		int [][] mass2 = new int[][] {{ 12, 11, 10, 9 }, { 8, 7, 6, 5 }, { 4, 3, 2, 1 }};
		
		System.out.println("\nРезультат:");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(mass2[i][j] + " ");
			}
			System.out.println();
		}
		
		// ----------------------------
		
		int [][] mass3 = new int[][] {{ 2021 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 }, { 1, 2, 3, 4 }};
		
		System.out.println("\nРезультат:");
		for (int i = 0; i < mass3.length; i++) {
			for (int j = 0; j < mass3[i].length; j++) {
				System.out.print(mass3[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
