// Урок от Book Yakov Fine

package ru.site.streamoutput;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Start {

	public static void main(String[] args) {

		int somedata[] = { 56, 230, 123, 43, 11, 37, 22, 41, 101 };
		FileOutputStream myFile = null;
		BufferedOutputStream buff = null;
		try {
			// Открывается файл xyz.dat, в который
			// записываются данные из массива
			myFile = new FileOutputStream("c:\\java\\test\\test.txt", true); //  // эта часть(, true) позволяет дозаписывать. если ее удалить, то будет перезаписывать файл. Сохраняет не по-русски. Поправить кодировку.
			buff = new BufferedOutputStream(myFile);
			for (int i = 0; i < somedata.length; i++) {
				buff.write(somedata[i]);
			}
		} catch (IOException e) {
			System.out.println("Невозможно записать данные в файл: " + e.toString());
			e.printStackTrace();
		} finally {
			if (myFile != null) {
				try {
					buff.flush();
					buff.close();
					myFile.close();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}

		}

	}
}