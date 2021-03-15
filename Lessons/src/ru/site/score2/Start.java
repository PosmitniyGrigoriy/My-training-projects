package ru.site.score2;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class Start {
	
	/**
	 * Метод main выполняет следующие действия: 1. Создает экземпляр массива 2.
	 * Создает объекты Score и заполняет ими массив 3. Записывает счет игры в файл
	 */
	
	public static void main(String[] args) {
		FileWriter myFile = null;
		BufferedWriter buff = null;
		Date today = new Date();
		Score scores[] = new Score[3];
		
		
		Score Score0 = new Score("Николай", "Смирнов", 250, today);
		Score Score1 = new Score("Анна", "Егорова", 300, today);
		Score Score2 = new Score("Сергей", "Данилов", 190, today);
		
		scores[0] = Score0;
		scores[1] = Score1;
		scores[2] = Score2;
		
		try {
			myFile = new FileWriter("c:\\java\\scores2.txt");
			buff = new BufferedWriter(myFile);
			for (int i = 0; i < scores.length; i++) {
				// Преобразует каждый счет в объект String и записывает его в scores2.txt
				buff.write(scores[i].toString() + "\n");
				System.out.println("Запись " + scores[i]);
			}
			System.out.println("Запись файла завершена");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				buff.flush();
				buff.close();
				myFile.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}