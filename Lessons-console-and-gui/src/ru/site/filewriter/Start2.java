// Урок от Book Yakov Fine

package ru.site.filewriter;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Start2 {

	public static void main(String[] args) {
		
		FileWriter myFile = null;
		BufferedWriter buff = null;
		String[] scores = new String[3];
		//заполнение массива результатами игры
		
		Scanner On = new Scanner(System.in);
		
		System.out.println("Введите первое слово:");
	    String text0 = On.nextLine();
	    scores[0] = text0;
	    
	    System.out.println("Введите второе слово:");
	    String text1 = On.nextLine();
	    scores[1] = text1;
	    
	    System.out.println("Введите третье слово:");
	    String text2 = On.nextLine();
	    scores[2] = text2;
	    
	    
		
		
		try {
			myFile = new FileWriter("c:\\Java\\test\\test.txt", true); // эта часть(, true) позволяет дозаписывать. если ее удалить, то будет перезаписывать файл. Сохраняет по-русски.
			buff = new BufferedWriter(myFile);
			for (int i = 0; i < scores.length; i++) {
				//запись строк из массива в файл scores2.txt
				buff.write(scores[i] + "\n");
				System.out.println("Записывается " + scores[i]);
			}
			System.out.println("Запись файла завершена");
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
