package ru.site.lesson5;

class Car4 {
	
	private String color;
	private String engine;
	protected int speed;
	
	public int addSpeed(int speed2) {
		speed += speed2;
		return speed;
	}
	
	public int stopSpeed(int speed2) {
		speed -= speed2;
		return speed;
	}
	
	public void result () {
		System.out.println("Скорость: " + speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}

public class Start4 {

	public static void main(String[] args) {
		
		Car4 car4 = new Car4();
		car4.setSpeed(30);
		car4.result();
		car4.addSpeed(40);
		car4.result();
		car4.stopSpeed(70);
		car4.result();
		
	}

}
