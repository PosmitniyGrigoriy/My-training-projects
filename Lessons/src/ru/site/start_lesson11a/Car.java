package ru.site.lesson11a;

public class Car {
	
	String color;
	String engine;
	int quantityDoor;
	
	Car(String color, String engine, int quantityDoor) {
		this.color = color;
		this.engine = engine;
		this.quantityDoor = quantityDoor;
	}
	
	@Override
	public String toString() {
		return "Цвет: " + color + ". Мотор: " + engine + ". Кол-во дверей: " + quantityDoor + "";
	}

	void changeQuantityDoor(int quantityDoor) {
		this.quantityDoor = quantityDoor;
	}
	
	static void changeQuantityDoor2(Car numberCar, int quantityDoor) {
		numberCar.quantityDoor = quantityDoor;
	}
	
	static void changeCarTwoCars(Car number1, Car number2) {
		String number3 = number1.color;
		number1.color = number2.color;
		number2.color = number3;
	}
	
	void changeColorAndEngine(String color, String engine) {
		this.color = color;
		this.engine = engine;
	}
	
	static void changeColor(Car car3, Car car4) {
		Car car5 = car3;
		car3 = car4;
		car4 = car5;
		System.out.println(car3);
		System.out.println(car4);
	}
	
	static void changeColorObject1(Car changeColorObject1) {
		changeColorObject1.color = "white";
	}
	
	static void changeColorObject2(Car changeColorObject2) {
		changeColorObject2.color = "pink";
	}
	
	static void changeColorObject3(Car changeColorObject1, Car changeColorObject2) {
		changeColorObject1.color = "pink";
		changeColorObject2.color = "white";
	}
	
	
	// Изменяет количество дверей
	// Принимает в параметры 2 объекта и меняеих их цвета местами
	// Применить оба метода в main и вывести на экран атрибуты всех объектов
		
	
	
	
	
}
