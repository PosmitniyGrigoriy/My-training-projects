package ru.site.math;

public class Start {

	public static void main(String[] args) {
		
		System.out.println("Pi  = " + Math.PI);
		
		System.out.println("Cos = " + Math.cos(1));
		System.out.println("Sin = " + Math.sin(1));
		
		System.out.println("Log = " + Math.log10(0.5));
		
		System.out.println("Max = " + Math.max(1, 2));
		System.out.println("Min = " + Math.min(1, 2));
		
		System.out.println("E   = " + Math.E);
				
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			double rnd = Math.random();
			int randomInt = (int) (rnd * 100);
			System.out.println(randomInt);
			sum +=randomInt;
		}
		System.out.println("\nÑóììà: " + sum);
		
	}

}
