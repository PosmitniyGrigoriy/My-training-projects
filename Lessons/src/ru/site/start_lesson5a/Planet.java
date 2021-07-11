package ru.site.lesson5a;

public class Planet {
	
	Sun sun; // Солнце
	Air air; // Воздух
	Country country; // Страна
	Sea sea; // Море
	
	String name; // Название планеты
	long numberOfInhabitants; // Количество жителей
	
	public Planet(String name, long numberOfInhabitants) {
		super();
		this.name = name;
		this.numberOfInhabitants = numberOfInhabitants;
		
		System.out.println(name + ", кол-во жителей " + numberOfInhabitants);
	}
	
}
