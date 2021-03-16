// Урок от Project of unknown source

package ru.site.copyfoldersandfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Start {
	public static void main(String[] args) {
		File srcFolder = new File("C:\\Users\\pgapr\\Desktop2\\Разное\\Key Collector");
		File destFolder = new File("c:\\java\\test\\");
		
		// проверяет существует ли папка
		if (!srcFolder.exists()) {
			System.out.println("Не верно указан путь, с которого нужно скопировать папку или файл(ы).");
			System.exit(0);
		} else {
			try {
				copyFolder(srcFolder, destFolder);
			} catch (IOException e) {
				e.printStackTrace();
				System.exit(0);
			}
		}
		System.out.println("Копирование выполнено");
		
	}

	public static void copyFolder(File src, File dest) throws IOException {

		// проверяет существует ли папка
		if (src.isDirectory()) {

			if (!dest.exists()) {
				dest.mkdir();
				System.out.println("Папка скопирована с " + src + "  в " + dest);
			}

			// Считывает всё содержимое каталога
			String files[] = src.list();

			for (String file : files) {
				// построить файловую структуру src и dest
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);
				// рекурсивная копия
				copyFolder(srcFile, destFile);
			}

		} else {
			// если файл, то скопируйте его
			// Используется поток байтов для поддержки всех типов файлов
			InputStream in = new FileInputStream(src);
			OutputStream out = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// копирование содержимого файлов в байтах
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}

			in.close();
			out.close();
			System.out.println("Файл скопирован с " + src + " в " + dest);
		}
	}
}
