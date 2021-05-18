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
//		Comparator priceCar = new priceCarComparator();
//		Collections.sort(cars, priceCar);
//		System.out.println(cars);
		
		// Сортирует модели автомобилей (от A до Z)
//		Comparator modelCar = new modelCarComparator();
//		Collections.sort(cars, modelCar);
//		System.out.println(cars);
		
		// Сортирует модели автомобилей (от A до Z), если модели одинаковые, то сортирует по цене (от меньшей к большей)
//		Comparator modelAndPriceCar = new modelAndPriceCarComparator();
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
		
		
		
		
		
		// BMW - 1, AUDI - 2, FIAT - 2, TOYOTA - 2
		
//		Map<String, String> mapCars = new HashMap<>();
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.BMW == cars.get(i).getModel()) {
//				mapCars.put("BMW", "111");
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.TOYOTA == cars.get(i).getModel()) {
//				mapCars.put("TOYOTA", "222");
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.AUDI == cars.get(i).getModel()) {
//				mapCars.put("AUDI", "333");
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.SKODA == cars.get(i).getModel()) {
//				mapCars.put("SKODA", "444");
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.PEUGEOT == cars.get(i).getModel()) {
//				mapCars.put("PEUGEOT", "555");
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.FIAT == cars.get(i).getModel()) {
//				mapCars.put("FIAT", "666");
//			}
//		}
//
//		System.out.println(mapCars);
		
		
		
		
		
		
		
		
//		Map<String, List<Car>> mapCars = new HashMap<>();
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.BMW == cars.get(i).getModel()) {
//				mapCars.put("BMW", cars);
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.TOYOTA == cars.get(i).getModel()) {
//				mapCars.put("TOYOTA", cars);
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.AUDI == cars.get(i).getModel()) {
//				mapCars.put("AUDI", cars);
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.SKODA == cars.get(i).getModel()) {
//				mapCars.put("SKODA", cars);
//			}
//		}
//		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.PEUGEOT == cars.get(i).getModel()) {
//				mapCars.put("PEUGEOT", cars);
//			}
//		}
		
//		for(int i = 0; i < cars.size(); i++) {
//			if(Model.FIAT == cars.get(i).getModel()) {
//				mapCars.put("FIAT", cars);
//			}
//		}
		
//		System.out.println(mapCars);
		
		
		
		
		
		

		
	}

}
