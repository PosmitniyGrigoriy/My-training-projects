package ru.site.collectionscar;

import java.util.Comparator;

public class PriceCarComparator implements Comparator<Car> {

	@Override
	public int compare(Car car1, Car car2) {
		return car1.price - car2.price;
	}
	
}
