// ”рок от Java Blogger 007

package ru.site.constructor;

public class Start {

	public static void main(String[] args) {
		
		Options on = new Options ();
		Options on2 = new Options ("Igor", 2008);
		Options on3 = new Options (80, 2008);
		
		System.out.println(on);
		System.out.println(on2);
		System.out.println(on3);
		
		
	}

}
