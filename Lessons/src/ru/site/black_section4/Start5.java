package ru.site.section4;

import java.util.ArrayList;
import java.util.Collections;

public class Start5 {

	public static void main(String[] args) {
		
		Car car1 = new Car(10, "TOYOTA", 2010, "Алена");
		Car car2 = new Car(3, "BMW", 2017, "Григорий");
		Car car3 = new Car(7, "DODGE", 2013, "Полина");
		Car car4 = new Car(1, "HYUNDAI", 2011, "Виталий");
		Car car5 = new Car(4, "LEXUS", 2020, "Мария");
		Car car6 = new Car(2, "MAZDA", 2013, "Виктор");
		Car car7 = new Car(8, "SUZUKI", 2015, "Олег");

		ArrayList<Car> listCars = new ArrayList<>();
		listCars.add(car1);
		listCars.add(car2);
		listCars.add(car3);
		listCars.add(car4);
		listCars.add(car5);
		listCars.add(car6);
		listCars.add(car7);

		System.out.println(listCars);
		Collections.sort(listCars);
		System.out.println(listCars);

		int resultOne = Collections.binarySearch(listCars, car6);
		int resultTwo = Collections.binarySearch(listCars, new Car(7, "DODGE", 2013, "Полина"));
		System.out.println(resultOne);
		System.out.println(resultTwo);
		
	}

}
