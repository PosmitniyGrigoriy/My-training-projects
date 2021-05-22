package ru.site.collectionsfood;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FoodUtils {
	
	public static Map<String, List<String>> collectFoodToMap(List<Food> listFoods) {
		Map<String, List<String>> mapFoods = new HashMap<>();
		for(Food food : listFoods) {
			if(mapFoods.get(food.type.toString()) == null) {
				mapFoods.put(food.type.toString(), new ArrayList<String>() {{add(food.name);}});
			} else {
				mapFoods.get(food.type.toString()).add(food.name);
			}
		}
//		System.out.println(mapFoods.values());
		return mapFoods;
	}
	
	public static Map<String, Set<String>> addSetsByTypesToMap(List<Food> listFoods) {
		Map<String, Set<String>> mapFoodsByType = new HashMap<>();
		for(Food food : listFoods) {
			if(mapFoodsByType.get(food.type.toString()) == null) {
				mapFoodsByType.put(food.type.toString(), new HashSet<String>() {{add(food.name);}});
			} else {
				mapFoodsByType.get(food.type.toString()).add(food.name);
			}
		}
//		System.out.println(mapFoodsByType.values());
		return mapFoodsByType;
	}
	
	public static Map<String, Integer> numberOfProductsOfEachTypeCounted(List<Food> listFoods) {
		Map<String, Integer> mapFoods = new HashMap<>();
		int count = 0;
		for(Food food : listFoods) {
			if(mapFoods.get(food.type.toString()) == null) {
				mapFoods.put(food.type.toString(), count = 1);
			} else {
				mapFoods.put(food.type.toString(), count += 1);
			}
		}
//		System.out.println(mapFoods);
		return mapFoods;
	}
	
	public static List<Food> creatingListOfProductsFromMap(Map<Type, List<String>> mapFoods) {
		List<Food> listFoods = new ArrayList<>();
		for (Map.Entry<Type, List<String>> entry : mapFoods.entrySet()) {
			for(String nameFood : entry.getValue()) {
				listFoods.add(new Food(entry.getKey(), nameFood));
			}
		}
//		System.out.println(listFoods);
		return listFoods;
	}
	
	public static Set<String> creatingMultipleProductNames(Map<Type, List<String>> mapFoods) {
		Set<String> setFoods = new HashSet<>();
		for(Map.Entry<Type, List<String>> entry : mapFoods.entrySet()) {
			for(String nameFood : entry.getValue()) {
				setFoods.add(nameFood);
			}
		}
//		System.out.println(setFoods);
		return setFoods;
	}
	
}
