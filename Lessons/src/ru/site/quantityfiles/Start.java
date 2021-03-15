// Урок от Project of unknown source

package ru.site.quantityfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;

public class Start {

	 public long countFilesInDirectory(String path) {
	        int c = 0;
	        int i;
	        File file = new File(path);
	        File[] s = file.listFiles();
	        for (i = 0; i < s.length; i++) {
	            if(!s[i].isDirectory())
	                c++;
	            if (s[i].isDirectory())
	                countFilesInDirectory(s[i].getPath());
	        }
	        return c;
	    }
	
	 // Верхний блок нужен, чтобы нижний блок работал.
	 // 2 варианта ниже делают одно и то же. Считают количество файлов в папке, которая указана. Но если в корневой папке есть еще папки и в них файлы, то туда уже программа не заходит и не считает. Получается не правильно выводится кол-во папок и файлов сколько есть в корневой папке. Нужно дорабатывать 2 варианта ниже, чтобы они считали еще файлы и папки внутри папок в корне.
	 
	 
	public static void main(String[] args) {
		
		Start On = new Start();
		System.out.println(On.countFilesInDirectory("C:\\Users\\pgapr\\Desktop\\Разное\\Key Collector\\"));
		
		// v1
		File listFile = new File("C:\\Users\\pgapr\\Desktop\\Разное\\Key Collector\\");
		File exportFiles[] = listFile.listFiles();
		String[] names = new String[exportFiles.length];
		for (int i = 0; i < names.length; i++) {
			names[i] = exportFiles[i].getName();
//			System.out.println(names[i]);
		}
//		System.out.println("\nПапок и файлов (без вложенных файлов и папок): " + names.length);
		
		
		// v2
//		File dir = new File("C:\\Users\\pgapr\\Desktop\\Разное\\Key Collector\\"); //path указывает на директорию
//		File[] arrFiles = dir.listFiles();
//		List<File> lst = Arrays.asList(arrFiles);
//		for (int i = 0; i < lst.size(); i++) {
//			System.out.println(lst.get(i));
//		}
		
		
		
	}

}
