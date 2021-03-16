// Урок от Project of unknown source

package ru.site.foldersandfiles2;

import java.io.File;
import java.io.IOException;

public class Start {

	public static void main(String[] args) throws IOException {
		
		// Весь код ниже работает. Если нужно что-то запустить, то убрать комментарии.
		
		// Работа с папками. Создание, переименование, удаление.
//		File dir = new File("c:\\Java\\test2021\\"); // Создался объект в памяти, но еще не создалась папка
//		dir.mkdir(); // Создалась папка test2021
//		
//        File newName = new File("c:\\Java\\test2222\\"); // Создался объект в памяти, но еще не переименовалась папка
//        if ( dir.isDirectory() ) { // Ниже идет условие. И папка меняет свое название со старого на новое (test222). Переименовывается
//                dir.renameTo(newName);
//        } else {
//                dir.mkdir();
//                dir.renameTo(newName);
//        } // Если папка test2021 создана, то она переименовывается на test2222. Если папка не создана, то создается и сразу переименовывается на test2222.
		
        
        
//		// Если папка не создана, то она создается. Если создана, то удаляется
//        File newName = new File("c:\\Java\\test333\\");
//        if (!newName.exists()) {
//        	newName.mkdir();
//        } else {
//        	newName.delete();
//        }
        
        
		
		
		
		
		// Работа с файлами. Создание, переименование, удаление.
		File dir = new File("c:\\Java\\test\\test.txt"); // Создался объект в памяти, но еще не создался файл
//		dir.createNewFile(); // Создание файла
//		dir.delete(); // Удаляет файл. Эта команда только для файла работает. Для папки не работает. Папку по-другому как-то удалять нужно.
		
		// Переименовывает файл. Файл сначала нужно создать. Код выше.
		File newName2 = new File("c:\\Java\\test\\ok.txt"); // Создался объект в памяти, но еще не переименовался файл
		if (dir.isFile() ) {
			dir.renameTo(newName2);
		} else {
			dir.createNewFile();
			dir.renameTo(newName2);
		}
		
		
		
		

	}

}
