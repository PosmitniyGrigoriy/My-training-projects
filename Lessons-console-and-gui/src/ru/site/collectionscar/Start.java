package ru.site.collectionscar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Start {

	public static void main(String[] args) {
		
		Car car1 = new Car(Model.BMW, 5000, Color.BLACK);
		Car car2 = new Car(Model.AUDI, 3500, Color.BLUE);
		Car car3 = new Car(Model.FIAT, 4000, Color.BLACK);
		Car car4 = new Car(Model.TOYOTA, 3850, Color.WHITE);
		Car car5 = new Car(Model.TOYOTA, 2100, Color.YELLOW);
		Car car6 = new Car(Model.FIAT, 8000, Color.PINK);
		Car car7 = new Car(Model.AUDI, 6400, Color.GREEN);
		
		ArrayList<Car> cars = new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		cars.add(car7);
		
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
		ArrayList<Car> bmw = new ArrayList<>();
		ArrayList<Car> toyota = new ArrayList<>();
		ArrayList<Car> audi = new ArrayList<>();
		ArrayList<Car> skoda = new ArrayList<>();
		ArrayList<Car> peugeot = new ArrayList<>();
		ArrayList<Car> fiat = new ArrayList<>();
		
		Map<String, List<Car>> mapCars = new HashMap<>();
		
		for(int i = 0; i < cars.size(); i++) {
			if(cars.get(i).getModel() == Model.BMW) {
				bmw.add(cars.get(i));
			} else if (cars.get(i).getModel() == Model.TOYOTA) {
				toyota.add(cars.get(i));
			} else if (cars.get(i).getModel() == Model.AUDI) {
				audi.add(cars.get(i));
			} else if (cars.get(i).getModel() == Model.SKODA) {
				skoda.add(cars.get(i));
			} else if (cars.get(i).getModel() == Model.PEUGEOT) {
				peugeot.add(cars.get(i));
			} else if (cars.get(i).getModel() == Model.FIAT) {
				fiat.add(cars.get(i));
			}
		}
		
		mapCars.put("BMW", bmw);
		mapCars.put("TOYOTA", toyota);
		mapCars.put("AUDI", audi);
		mapCars.put("SKODA", skoda);
		mapCars.put("PEUGEOT", peugeot);
		mapCars.put("FIAT", fiat);
		
		System.out.println(mapCars);
		
	}

}
