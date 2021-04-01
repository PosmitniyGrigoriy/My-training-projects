// Урок от Book Yakov Fine

package ru.site.animals;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StartFishMaster3 {

	public static void main(String[] args) {

		Fish2 myFish = new Fish2(20);
		String feetString = "";
		int feet;
		// Создаем обработчик чтения входного потока InputStreamReader,
		// который подключен к System.in и передаем его буферизованному
		// обработчику чтения BufferedReader
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Готова к погружению. На какую глубину?");

			try {
				feetString = stdin.readLine();
				if (feetString.equals("Q")) {
					System.out.println("Пока!");
					System.exit(0);
				} else {
					feet = Integer.parseInt(feetString);
					myFish.dive(feet);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
