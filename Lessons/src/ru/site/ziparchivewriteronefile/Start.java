// Урок от Vladlen Vojjaev

package ru.site.ziparchivewriteronefile;

import java.io.*;
import java.util.zip.*;

public class Start {

	public static void main(String[] args) throws IOException {
		
		// Архивирование файла (1 файл только). Может папку еще сможет. Протестировать.
		
		ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:\\Java\\test\\archive.zip")); // Указывается путь и название архиве с форматом zip
		ZipEntry entry = new ZipEntry("test.xlsx"); // Указывается как будет внутри архива этот файл называться
		zout.putNextEntry(entry);
		FileInputStream fis = new FileInputStream("C:\\Java\\test\\1.txt"); // Указывается путь и название файла, который нужно положить в архив
		byte[] buffer = new byte[fis.available()];
		fis.read(buffer);
		zout.write(buffer);
		zout.closeEntry();
		zout.close();
		
	}

}
