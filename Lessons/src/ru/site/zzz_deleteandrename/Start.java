// ”рок от Book Yakov Fine

package ru.site.deleteandrename;

import java.io.File;

public class Start {

	public static void main(String[] args) {
		
		File file = new File("c:\\Java\\test\\test.txt");
		File backup = new File("c:\\Java\\test\\test.txt.bak");
		if (backup.isFile()){
		backup.delete();
		}
		file.renameTo(backup);
		
		System.out.println(file.renameTo(backup));
		
	}

}
