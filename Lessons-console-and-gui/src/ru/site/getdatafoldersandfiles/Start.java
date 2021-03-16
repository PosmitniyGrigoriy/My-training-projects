// Урок от Vladlen Vojjaev

package ru.site.getdatafoldersandfiles;

import java.io.File;
import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		
		File dir = new File("C:\\Java\\test\\", "1.xlsx");
		File dir1 = new File("C:\\Java\\test\\");
		File dir2 = new File("C:\\Java\\test\\new\\");
		
		boolean result = dir.createNewFile();
		System.out.println("Абсолютный путь: " + dir.getAbsolutePath());
		System.out.println("Название файла и формат: " + dir.getName());
		System.out.println("Основная папка: " + dir.getParent());
		System.out.println("Размер файла в байтах: " + dir.length());
		System.out.println("Размер файла в килобайтах: " + dir.length()/1024);
		System.out.println("Размер файла в мегабайтах: " + dir.length()/1024/1024);
		System.out.println("Полный путь: " + dir.getCanonicalPath());
		System.out.println("Полный путь: " + dir.getPath());
		System.out.println("Главный файл лежит в папке: " + dir.getParentFile());
		
		String[] arr = dir1.list();
		System.out.println("\nВ папке лежат папки и файлы:"); // Считывает то, что лежит. Что лежит во внутренних папках уже не считывает.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);			
		}

		dir2.mkdir();
		
	}

}
