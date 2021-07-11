package ru.site.lesson9;

public class Start {
	
	public static void main(String[] args) {
		
		Various car = new Various("Toyota Prius");
		System.out.println(car);
		car = null;
		System.out.println(car);
		car = new Various("Toyota Mark 2");
		System.out.println(car);
		car = new Various("BMW X6");
		car = null;
		
		Various total = new Various();
		
		Various car2 = new Various("222");
		System.out.println(car2);
		Various car23 = new Various("22212");
		car23 = null;
		System.out.println(car23);
		
		
	}

}
