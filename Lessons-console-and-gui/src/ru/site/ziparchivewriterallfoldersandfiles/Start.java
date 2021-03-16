// Урок от Anton Sagurov

package ru.site.ziparchivewriterallfoldersandfiles;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Start {

	// Минусы кода:
	// Нужно сделать, чтобы название архива содержало (Копия проектов от (дата).zip).
	
	// Нужно делать GUI приложение, чтобы делать архивирование. Если запускать с IDE архиватор, то будет ошибка, так как IDE испльзует какой-то файл и его не может в архив записать, поэтому ошибка.
	
	public static final String FILE = "C:\\Users\\pgapr\\Desktop\\000.zip"; // Разместить до запуска main (чтобы не было ошибки в коде). Здесь указывается путь сохранения архива и название архива с форматом zip.
		
	public static void main(String[] args) throws Exception {
		
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(FILE));
		
		createZipDir(zos, new File("C:\\Users\\pgapr\\Desktop\\Разное\\Key Collector").listFiles(), ""); // Указать путь откуда нужно взять файлы для архивации.
		
		zos.close();
		
		System.out.println("Архивирование выполнено"); // Когда архивирование завершится, в консоль выведется сообщение. Если будет GUI приложение, то выводить всплывающее окно с уведомлением или в label выводить (что лучше будет).
		
	}
	
	private static void createZipDir(ZipOutputStream zos, File[] files, String path)
		throws Exception {
		
		for (File f : files) {
			if (f.isDirectory()) {
				createZipDir(zos, f.listFiles(), path + f.getName() + "/");
			} else if (!f.getName().equals(FILE)) {
				ZipEntry ze = new ZipEntry (path + f.getName());
				zos.putNextEntry(ze);
				
				FileInputStream fis = new FileInputStream(f);
				byte[] buffer = new byte[1024];
				int size = -1;
				while ((size = fis.read(buffer)) != -1) {
					zos.write(buffer, 0, size);
				}
			}
			
		}
	}

}
