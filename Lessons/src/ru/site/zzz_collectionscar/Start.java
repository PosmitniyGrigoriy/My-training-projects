package ru.site.collectionscar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(new Car(Model.BMW, 5000, Color.BLACK));
		cars.add(new Car(Model.AUDI, 3500, Color.BLUE));
		cars.add(new Car(Model.FIAT, 4000, Color.BLACK));
		cars.add(new Car(Model.TOYOTA, 3850, Color.WHITE));
		cars.add(new Car(Model.TOYOTA, 2100, Color.YELLOW));
		cars.add(new Car(Model.FIAT, 8000, Color.PINK));
		cars.add(new Car(Model.AUDI, 6400, Color.GREEN));
		
		// Сортирует автомобили по цене (от меньшей к большей)
//		Comparator priceCar = new PriceCarComparator();
//		Collections.sort(cars, priceCar);
//		System.out.println(cars);
		
		// Сортирует модели автомобилей (от A до Z)
//		Comparator modelCar = new ModelCarComparator();
//		Collections.sort(cars, modelCar);
//		System.out.println(cars);
		
		// Сортирует модели автомобилей (от A до Z), если модели одинаковые, то сортирует по цене (от меньшей к большей)
//		Comparator modelAndPriceCar = new ModelAndPriceCarComparator();
//		Collections.sort(cars, modelAndPriceCar);
//		System.out.println(cars);
		
		// Множество моделей
//		Set<Model> setModel = new HashSet<>();
//		for(int i = 0; i < cars.size(); i++) {
//			setModel.add(cars.get(i).getModel());
//		}
//		for(Model m : setModel) {
//			System.out.println(m);
//		}
		
		// Map из моделей. Выводит в формате: модель=[список автомобилей]
		Map<String, List<Car>> mapCars = new HashMap<>();
		for(Car car : cars) {
			if(mapCars.get(car.model.toString()) == null) {
				mapCars.put(car.model.toString(), new ArrayList<Car>() {{add(car); }});
			} else {
				mapCars.get(car.model.toString()).add(car);
			}
		}
		System.out.println(mapCars);
		
	}

}
