package ru.site.collectionscar;

import java.util.Comparator;

public class ModelCarComparator implements Comparator<Car> {
	
	@Override
	public int compare(Car car1, Car car2) {
		return car1.model.toString().compareTo(car2.model.toString());
	}
	
}
