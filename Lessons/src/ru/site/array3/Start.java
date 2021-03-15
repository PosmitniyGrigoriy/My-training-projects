// Урок от Java Blogger 007

package ru.site.array3;

import java.util.ArrayList;
import java.util.List;

public class Start {

	public static void main(String[] args) {
		
		// Какие бывают массивы и в каждом массиве есть 2 варианта вывода данных: через цикл и вручную. В этом файле есть 2 массива: обычный и ArrayList. Циклы по-разному нужно писать, чтобы данные выводились.
		
		// Вариант 1
		String[] names = new String[3];
		names[0] = "Алена";
		names[1] = "Никита";
		names[2] = "Михаил";
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println();
		System.out.println(names[0] + ", " + names[1] + ", " + names[2]);
		System.out.println("-----------------------------------");

		
		// Вариант 2
		String[] names2 = {"Алена2", "Никита2", "Михахил2"};
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names2[i]);
		}
		System.out.println();
		System.out.println(names2[0] + ", " + names2[1] + ", " + names2[2]);
		System.out.println("-----------------------------------");
		
		
		// Вариант 3
		int[] numbers = new int [3];
		numbers[0] = 1;
		numbers[1] = 5;
		numbers[2] = 9;
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println();
		System.out.println(numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
		System.out.println("-----------------------------------");
		
		
		// Вариант 4
		int[] numbers2 = {2, 6, 10};
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println(numbers2[i]);
		}
		System.out.println();
		System.out.println(numbers2[0] + ", " + numbers2[1] + ", " + numbers2[2]);
		System.out.println("-----------------------------------");
		
		
		// Вариант 5
		List<String> names3 = new ArrayList<String>();
		names3.add("Григорий");
		names3.add("Алена");
		names3.add("Николай");
		names3.add("Михаил");
		names3.set(1, "Ольга"); // Если имя не верно было указано или в коде поменять или сделать эту команду, первая цифра - это порядковый номер в массиве, который нужно заменить, далее новое текстовое значение (имя)
		names3.remove(3); // Удаляет четвертый элемент в массиве, так как с нуля начинается, если 3 установлено, значит 4-ое значение будет удалено.
		names3.remove("Николай"); // Удаляет конкретное значение в массиве по имени, не нужно указывать порядковый номер в массиве, что удобно
		names3.add(0, "Мария");  // Можно добавить в массив новое имя, указывая номер массива и имя
		names3.clear(); // Очистка массива
		names3.add(0, "Валерия");  // Можно добавить в массив новое имя, указывая номер массива и имя
		names3.add("Григорий");
		names3.add("Алена");
		names3.add("Николай");
		names3.add("Михаил");
		System.out.println("Размер массива: " + names3.size() + "\n");
		System.out.println("Первое имя: " + names3.get(0) + "\n");
		int result = names3.indexOf("Алена")+1;
		System.out.println("Алена пришла " + result + "\n");
		for (int i = 0; i < names3.size(); i++) {
			System.out.println(names3.get(i));
		}
		System.out.println();
		System.out.println(names3);
		System.out.println("-----------------------------------");
		
		
		// Вариант 6
		List<Integer> numbers3 = new ArrayList<Integer>();
		numbers3.add(3);
		numbers3.add(6);
		numbers3.add(14);
		System.out.println(numbers3.get(2) + "\n"); // Получить значение в массиве 2 и вывести
		for (int i = 0; i < numbers3.size(); i++) {
			System.out.println(numbers3.get(i));
		}
		System.out.println();
		System.out.println(numbers3);
		System.out.println("-----------------------------------");
		
	}

}
