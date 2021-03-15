// Урок от Book Yakov Fine

package ru.site.filewriter;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Start {

	public static void main(String[] args) {
		
		FileWriter myFile = null;
		BufferedWriter buff = null;
		String[] scores = new String[3];
		//заполнение массива результатами игры
		scores[0] = "Mr. Smith 240";
		scores[1] = "Ms. Lee 300";
		scores[2] = "Mr. Dolittle 190";
		try {
			myFile = new FileWriter("c:\\Java\\test.txt");
			buff = new BufferedWriter(myFile);
			for (int i = 0; i < scores.length; i++) {
				//запись строк из массива в файл scores2.txt
				buff.write(scores[i]);
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
