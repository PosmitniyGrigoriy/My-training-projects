package ru.site.lesson5;

class Car5 {
	
	private int startSpeed;
	private int addSpeed;
	private int stopSpeed;

	public int getStartSpeed() {
		return startSpeed;
	}

	public void setStartSpeed(int startSpeed) {
		this.startSpeed = startSpeed;
	}

	public int getAddSpeed() {
		return addSpeed;
	}

	public void setAddSpeed(int addSpeed) {
		this.addSpeed = addSpeed;
	}
	
	public int getStopSpeed() {
		return stopSpeed;
	}

	public void setStopSpeed(int stopSpeed) {
		this.stopSpeed = stopSpeed;
	}

	public int addSpeed() {
		int resultSpeed = startSpeed + addSpeed;
		return resultSpeed;
	}
	
	public int stopSpeed() {
		int resultSpeed = stopSpeed - addSpeed - startSpeed;
		return resultSpeed;
	}
	
}

public class Start5 {

	public static void main(String[] args) {
		
		Car5 car5 = new Car5();
		car5.setStartSpeed(50);
		System.out.println(car5.getStartSpeed());
		car5.setAddSpeed(20);
		System.out.println(car5.addSpeed());
		car5.setStopSpeed(70);
		System.out.println(car5.stopSpeed());
	}

}
