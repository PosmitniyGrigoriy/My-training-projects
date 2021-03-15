package ru.site.copyandmove;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Options {
	
	public boolean copy() {
		// Для копирования файла. Создает новый файл с именем 222.txt.
//		File scr = new File("c:\\Java\\test.txt");
//		File target = new File("c:\\Java\\222.txt");
		
		// Для копирования папки. Создает новую папку с именем 333. Но все файлы, внутри папки 111 не копируются в папку 333. Только папка создается.
		File scr = new File("c:\\Java\\test\\111\\");
		File target = new File("c:\\Java\\test\\333\\");
		try {
			Files.copy(scr.toPath(), target.toPath());
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	// Для перемещения файла должна быть создана папка. Если она не создана, то файл не получится переместить. Будет ошибка. Нужно сначала создать новую папку. И потом указать файл, который нужно переместить и путь с названием файла и расширение файла, куда файл нужно переместить.
	
	public boolean move() {
		// Для перемещения файла
//		File scr = new File("c:\\Java\\test.txt");
//		File target = new File("c:\\Java\\test\\test.txt");
		
		// Для перемещения папки. Перемещает папку и все внутренние в ней файлы.
		File scr = new File("c:\\Java\\test\\111\\");
		File target = new File("c:\\Java\\test\\333\\111\\");
		try {
			Files.move(scr.toPath(), target.toPath());
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
}
