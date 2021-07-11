// ”рок от Book Yakov Fine

package ru.site.car;

public class Start {

	public static void main(String[] args) {
		
		Car start = new Car ();
		start.start();
		start.stop();
		start.drive(2);
		
		Car start2 = new CarMans ();
		start2.drive(10);
		
		System.out.println(start.distance + " test");
		System.out.println(start2.distance + " ok");
		
	}

}
