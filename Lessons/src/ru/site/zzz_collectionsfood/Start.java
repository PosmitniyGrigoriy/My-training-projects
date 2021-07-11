package ru.site.collectionsfood;

import static ru.site.collectionsfood.FoodUtils.collectFoodToMap;
import static ru.site.collectionsfood.FoodUtils.addSetsByTypesToMap;
import static ru.site.collectionsfood.FoodUtils.numberOfProductsOfEachTypeCounted;
import static ru.site.collectionsfood.FoodUtils.creatingListOfProductsFromMap;
import static ru.site.collectionsfood.FoodUtils.creatingMultipleProductNames;
import static ru.site.collectionsfood.TestEntities.getListFoods;
import static ru.site.collectionsfood.TestEntities.getMapFoods;

public class Start {

	public static void main(String[] args) {
		
		collectFoodToMap(getListFoods());
		addSetsByTypesToMap(getListFoods());
		numberOfProductsOfEachTypeCounted(getListFoods());
		creatingListOfProductsFromMap(getMapFoods());
		creatingMultipleProductNames(getMapFoods());
		
	}

}
