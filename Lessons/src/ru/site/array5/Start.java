// Урок от Book Yakov Fine

package ru.site.array5;

import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {

		// Создаем и заполняем ArrayList
//		ArrayList<String> friends = new ArrayList<String>();
		ArrayList friends = new ArrayList(); // Можно положить все типы данных. Если нужно только строки, то вариант выше можно использовать (закоментированный)
		friends.add("Елена");
		friends.add("Анна");
		friends.add("Николай");
		friends.add("Сергей");
		friends.add(123);
		
		// Считает сколько друзей и печатаем содержимое ArrayList
		for (int i = 0; i < friends.size(); i++) {
			System.out.println("Друг №" + i + " это " + friends.get(i));
		}
	}
}