package ru.site.lesson8;

public class Math {
	
	static final double PI = 3.14;
		
	static void operationMultiplication(int a, int b, int c) {
		int result = a * b * c;
		System.out.println(result);
	}
	
	static void operationDivisions(int a, int b) {
		int resultOne = a / b;
		int resultTwo = a % b;
		System.out.println("Целое частное: "+ resultOne + " и остаток: "+ resultTwo);
	}
	
	static double squareCircle(double radius) {
		double squareCircle = PI * radius * radius;
		return squareCircle;
	}
	
	static double circumference(double radius) {
		double Circumference = 2 * PI * radius;
		return Circumference;
	}
	
	static void info(double radius) {
		System.out.println("Радиус = " + radius);
		System.out.println("Площадь круга = " + squareCircle(radius));
		System.out.println("Длина окружности = " + circumference(radius));
	}
	
}
