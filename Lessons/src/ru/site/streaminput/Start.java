// Урок от Book Yakov Fine

package ru.site.streaminput;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Start {

	public static void main(String[] args) {

		// ByteReader
		// Программа выводит на экран цифры (в закодированном виде - в цифрах). Так файл (картинка, текст или другое что-то) хранится на диске
		FileInputStream myFile = null;
		BufferedInputStream buff = null;
		try {
			// Открытие байтового потока, указывающего на файл
			myFile = new FileInputStream("c:\\java\\test\\test.txt");
			//соединяем потоки FileInputStream и BufferedInputStream
			buff = new BufferedInputStream(myFile);
			while (true) {
				int intValueOfByte = buff.read();
				System.out.print(" " + intValueOfByte);
				if (intValueOfByte == -1) {
					// Достигнут конец файла нужно выйти из цикла
					break;
				}
			}
		} catch (IOException e) {
			System.out.println("Невозможно прочитать файл: " + e.toString());
			e.printStackTrace();
		} finally {
			try {
				buff.close();
				myFile.close();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
			System.out.println("\nЧтение файла завершено успешно");
		}

	}

}