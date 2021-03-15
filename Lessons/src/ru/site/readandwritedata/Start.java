// Урок от Gosha Dudar

package ru.site.readandwritedata;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Start {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		try {

			File file = new File("c:\\Java\\test\\test.txt");
			
			if(!file.exists()) { // проверяет существует ли файл
				file.createNewFile(); // если не существует, то 1 раз его создает и потом заменяет старый текст на новый (без создания снова файла)
			}
			
			PrintWriter pw = new PrintWriter(file);
			pw.println("Привет");
			pw.println("Тест");
			pw.println("boy");
			pw.close();
			
			br = new BufferedReader(new FileReader("c:\\Java\\test\\test.txt"));
			String line;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e);
			} finally {
				try {
					br.close();
				} catch(IOException e) {
					System.out.println("Error: " + e);
				}
		}
		
	}

}
