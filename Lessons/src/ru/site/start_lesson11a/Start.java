package ru.site.lesson11a;

public class Start {
	
	public static void main(String[] args) {
		
		Car car1 = new Car("red", "V6", 4);
		System.out.println(car1);
		car1.changeQuantityDoor(2);
		System.out.println(car1);
		car1.changeColorAndEngine("blue", "V8");
		
		// Переменные вывел, чтобы проверить, что объект поменял значение на новое.
//		System.out.println(car1.color);
//		System.out.println(car1.engine);
//		System.out.println(car1.quantityDoor);
			
		System.out.println(car1);
		
		Car car2 = new Car("black", "V4", 4);
		System.out.println(car2);
		car2.color = "yellow";
		System.out.println(car2);
		
		Car car3 = new Car("white", "V4", 5);
		Car car4 = new Car("pink", "V4", 4);
		System.out.println(car3);
		System.out.println(car4);
		
		System.out.println();
		
		Car.changeColor(car3, car4);
		System.out.println(car3);
		System.out.println(car4);
		
		
		System.out.println();
		System.out.println(car3);
		car3.color = "pink";
		System.out.println(car4);
		car4.color = "white";
		System.out.println(car3);
		System.out.println(car4);
		
		System.out.println();
		
		System.out.println(car3);
		System.out.println(car4);
		
		Car.changeColorObject1(car3);
		Car.changeColorObject2(car4);
		
		System.out.println(car3);
		System.out.println(car4);
	
		System.out.println();
		
		System.out.println(car3);
		System.out.println(car4);
		
		Car.changeColorObject3(car3, car4);
		
		System.out.println(car3);
		System.out.println(car4);
		
		
		System.out.println();
		Car car10 = new Car("black-green", "V12", 5);
		Car car11 = new Car("black-red", "V12", 4);
		System.out.println(car10);
		System.out.println(car11);
		Car.changeCarTwoCars(car10, car11);
		System.out.println(car10);
		System.out.println(car11);
		System.out.println();
		System.out.println(car10);
		Car.changeQuantityDoor2(car10, 2);
		System.out.println(car10);
		
		
		
	}
	
}
