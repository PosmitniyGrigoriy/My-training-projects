package ru.site.lesson5a;

public class Air {
	
	String name;
	int quantity;
	int speed;
	String humidity;
	
	public Air(String name, int quantity, int speed, String humidity) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.speed = speed;
		this.humidity = humidity;
		
		System.out.println(name + ", " + quantity + " единица, " + "скорость объекта - " + speed + ", влажность объекта - " + humidity);
		
	}
	
}
