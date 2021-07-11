package ru.site.lesson7y;

import ru.site.lesson7x.*;

public class Test extends People{
	
	Test(String name, int age) {
		super(name, age);
	}

	// Пустой конструктор нужен, чтобы в Start запустить пустой конструктор без аргументов
	Test() {
	}

//		name = " "; если так пробовать отобразить переменную (name или age, то она не отобразится, будет ошибка, нужно создавать метод и внутри этого метода переменные протэктэд тогда отобразятся и с ними можно будет работать, метод ниже создан и там протэкэд переменные и метод и конструктор получилось отобразить и данные вывести тоже получилось протэктэд)

	void myProtectedMethod() {
	Test people = new Test("Имя", 30);
	people.say(); // Вызов метода с другого пэкэджа и вывод текста
	System.out.println(people.name); // Вызов протэктэд переменных и вывод их
	System.out.println(people.age); // Вызов протэктэд переменных и вывод их

	// Вызов протэктэд переменных и вывод их
	name = "22222";
	age = 33;
	System.out.println(name);
	System.out.println(age);
	}
	
}
