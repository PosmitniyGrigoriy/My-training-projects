package ru.site.lesson8;

public class StartMath {
	
	public static void main(String[] args) {
				
		Math.operationMultiplication(2, 5, 3);
		Math.operationMultiplication(10, 2, 3);
		
		Math.operationDivisions(5, 2);
		Math.operationDivisions(14, 3);
			
		System.out.println("----");
		
		// v1
		Math.info(4);
		
		System.out.println("----");
		
		// v2
		
		// Вызов статического метода с экземпляром
		
		int radius = 4;
		
		Math math = new Math();
		System.out.println(math.squareCircle(radius));
		System.out.println(math.circumference(radius));
		
		System.out.println();		
		
		// Вызов статического метода без экземпляра
		System.out.println(Math.squareCircle(radius));
		System.out.println(Math.circumference(radius));
		
	}
	
}
