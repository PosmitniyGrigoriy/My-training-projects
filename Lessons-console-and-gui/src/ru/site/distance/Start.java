package ru.site.distance;

public class Start {
	
	public static void main(String[] args) {
		
		byte car1 = 50;
		byte car2 = 30;
		byte time = 5;
		
		short distanceCar1 = (short)(car1 * time);
		short distanceCar2 = (short)(car2 * -time);
		
		System.out.println(distanceCar1);
		System.out.println(distanceCar2);
		
	}
	
}