package ru.site.collectionscar;

import java.util.Comparator;

public class ModelAndPriceCarComparator implements Comparator<Car> {
	
	@Override
	public int compare(Car car1, Car car2) {
		int modelEquals = car1.model.toString().compareTo(car2.model.toString());
			if(modelEquals == 0) {
				modelEquals = car1.price.compareTo(car2.price);
			}
		return modelEquals;
	}
	
}
