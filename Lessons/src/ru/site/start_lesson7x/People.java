package ru.site.lesson7x;

public class People {
	
	protected String name;
	protected int age;
	
	protected People(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	protected People() {
	}

	protected void say() {
		System.out.println("Фраза");
	}

}
