package ru.site.lesson9;

public class People {
	
	String name;
	int age;
	
	People(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(name + " " + age);
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	
}
