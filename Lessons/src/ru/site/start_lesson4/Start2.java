package ru.site.lesson4;

class Car {
	
	String color = "red";
	String engine = "V6";

	
	
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

public class Start2 {

	public static void main(String[] args) {
		
		int a;
		Car car1 = new Car();
		car1.setName("Имя машины");
		System.out.println(car1.getName());
		Car car2 = car1;
		car2 = car1;
		System.out.println(car2.getName());
		Car car3 = car2;
		
		System.out.println(new Car().color); // разово вывести можно
		
		// Сверху на 15 и 16 строках идет сначала создание экземпляра, далее результат присваивается к новой переменной. Получается второй объект ссылается на первый. Будет одинаковый вывод.
		System.out.println(car1);
		System.out.println(car2);
		System.out.println(car3);
		
	}

}
