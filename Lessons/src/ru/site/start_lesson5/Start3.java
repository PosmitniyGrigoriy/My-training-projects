package ru.site.lesson5;

class Car3 {
	
	private String color;
	private String engine;
	
	Car3(String color, String engine) {
		this.color = color;
		this.engine = engine;
		System.out.println("Цвет автомобиля: " + color);
		System.out.println("Двигатель автомобиля: " + engine);
	}
	
}

public class Start3 {

	public static void main(String[] args) {
		
		Car3 car3 = new Car3("black", "V6");
		System.out.println();
		Car3 car33 = new Car3("white", "V8");
		
	}

}
