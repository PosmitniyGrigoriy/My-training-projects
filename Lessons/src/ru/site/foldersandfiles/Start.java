// Урок от Vladlen Vojjaev

package ru.site.foldersandfiles;

import java.io.*;

public class Start {

	public static void main(String[] args) throws IOException {
		
		// Прописывается абсолютный путь и отдельно файл
		
		File dir = new File("c:\\java\\test\\", "test.txt");
		File dir2 = new File("c:\\java\\test\\", "222.txt");
		
		dir.createNewFile();
		
//		if (dir.exists()) {
//			dir.delete();
//		} else {
//			System.out.print("Файл не найден");
//		}

		dir.renameTo(dir2);
		
	}

}
