package ru.site.masstext;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Start {

	public static void main(String[] args) throws Exception {

		FileWriter myFile = null;
		BufferedWriter buff = null;

		String text1 = "1";
		String text2 = "2";
		String text3 = "3";
		String text4 = "4";

		try {
			myFile = new FileWriter("c:\\Java\\test\\test.txt"); // Файл будет перезаписываться
			buff = new BufferedWriter(myFile);
			for (int a = 0; a < 4; a++) {
				for (int b = 10; b < 14; b++) {
					for (int c = 20; c < 24; c++) {
						for (int d = 30; d < 34; d++) {

							// v1 (чтобы увидеть правильно ли выводятся последовательности)
//							System.out.print(a + " " + b + " " + c + " " + d + "\n");

							// v2 (этот вариант использовать для вывода текста)
							buff.write(a + "\n" + b + "\n" + c + "\n" + d + "\n\n");
							System.out.print(a + "\n" + b + "\n" + c + "\n" + d + "\n\n");
							
						}
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buff.flush();
				buff.close();
				myFile.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}

		}

	}

}