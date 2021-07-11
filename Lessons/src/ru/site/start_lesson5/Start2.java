package ru.site.lesson5;

class Car {
	
	String color;
	String engine;
	
	Car(String color, String engine) {
		this.color = color;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", engine=" + engine + "]";
	}
	
}

public class Start2 {

	public static void main(String[] args) {
		
		Car car1 = new Car("yellow", "V4");
		System.out.println(car1.color); // Для такого вывода не нужен String to String
		System.out.println(car1.engine); // Для такого вывода не нужен String to String
		System.out.println(car1); // Для такого вывода нужен String to String
		
	}

}
