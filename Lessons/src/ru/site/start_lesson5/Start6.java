package ru.site.lesson5;

class Car10 {
	
	String color;
	String engine;
	int maxSpeed;
	
	Car10(String color, String engine, int maxSpeed) {
		this.color = color;
		this.engine = engine;
		this.maxSpeed = maxSpeed;
		
	}
}

class BankAccount {
	
	int id;
	int balance;
	
	BankAccount(int id, int balance) {
		this.id = id;
		this.balance = balance;
		
	}
}

class Human {
	
	String name;
	Car10 car;
	BankAccount bankAccout;
	
	public void info() {
		System.out.println("»м€: " + name);
		System.out.println("јвтомобиль: " + car.color + ", " + car.engine + ", " + car.maxSpeed);
		System.out.println("—чет в банке: " + bankAccout.id + ", " + bankAccout.balance);
	}

}

public class Start6 {

	public static void main(String[] args) {
		
		Human human = new Human();
		human.name = "Max";
		human.car = new Car10("black", "v8", 320);
		human.bankAccout = new BankAccount(1, 1000);
		human.info();
		
	}

}
