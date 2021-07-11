package ru.site.collectionsfood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestEntities {
	
	public static List<Food> getListFoods() {
		ArrayList<Food> listFoods = new ArrayList<>();
		listFoods.add(new Food(Type.ОВОЩИ, "Тыква"));
		listFoods.add(new Food(Type.ОВОЩИ, "Баклажан"));
		listFoods.add(new Food(Type.ОВОЩИ, "Кабачок"));
		listFoods.add(new Food(Type.ОВОЩИ, "Свекла"));
		listFoods.add(new Food(Type.ОВОЩИ, "Огурец"));
		listFoods.add(new Food(Type.ОВОЩИ, "Картошка"));
		listFoods.add(new Food(Type.ОВОЩИ, "Морковь"));
		listFoods.add(new Food(Type.ОВОЩИ, "Морковь"));
		
		listFoods.add(new Food(Type.ФРУКТЫ, "Манго"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Грейпфрукт"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Дыня"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Абрикос"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Киви"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Яблоко"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Груша"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Банан"));
		listFoods.add(new Food(Type.ФРУКТЫ, "Банан"));
		
		listFoods.add(new Food(Type.ЯГОДЫ, "Клубника"));
		listFoods.add(new Food(Type.ЯГОДЫ, "Малина"));
		listFoods.add(new Food(Type.ЯГОДЫ, "Смородина"));
		
		return listFoods;
	}
	
	public static Map<Type, List<String>> getMapFoods() {
		Map<Type, List<String>> mapFoods = new HashMap<>();
		mapFoods.put(Type.ОВОЩИ, List.of("Тыква", "Баклажан", "Кабачок", "Свекла", "Огурец", "Картошка", "Морковь", "Морковь"));
		mapFoods.put(Type.ФРУКТЫ, List.of("Манго", "Грейпфрукт", "Дыня", "Абрикос", "Киви", "Яблоко", "Груша", "Банан", "Банан"));
		mapFoods.put(Type.ЯГОДЫ, List.of("Клубника", "Малина", "Смородина"));
		
		return mapFoods;
	}
	
}
