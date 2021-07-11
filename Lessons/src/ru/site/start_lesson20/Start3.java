package ru.site.lesson20;

import java.util.*;
import java.util.Collections;

public class Start3 {
	
	static ArrayList<String> sorting(String ... listWords) {
		ArrayList<String> listWordsNoDuplicates = new ArrayList<>();
		for(String word : listWords) {
			if(!listWordsNoDuplicates.contains(word)) {
				listWordsNoDuplicates.add(word);
			}
		}
		Collections.sort(listWordsNoDuplicates);
		System.out.println(listWordsNoDuplicates);
		return listWordsNoDuplicates;
	}
	
	public static void main(String[] args) {
		sorting("Один", "Два", "Три", "Один", "Два", "Десять");
		sorting("Отдых", "Море", "Море", "Отдых", "Пляж", "Солнце", "Море");
	}

}
