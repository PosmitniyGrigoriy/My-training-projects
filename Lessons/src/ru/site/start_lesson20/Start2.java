package ru.site.lesson20;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Start2 {
	
	static String[] sorting(String ... list) {
		List<String> resultList = Arrays.asList(list);
		Collections.sort(resultList);
		for(int i = 0; i < list.length; i++) {
			for(int j = i + 1; j < list.length; j++) {
				if(list[i] == list[j]) {
					list[i] = null;
				}
			}
		}
		for(String s : list) {
			if(s != null) {
				System.out.print(s + " ");
			}
		}
		System.out.println();
		return list;
	}
	
	public static void main(String[] args) {
		sorting("Один", "Два", "Три", "Один", "Два", "Десять");
		sorting("Отдых", "Море", "Море", "Отдых", "Пляж", "Солнце", "Море");
	}

}
