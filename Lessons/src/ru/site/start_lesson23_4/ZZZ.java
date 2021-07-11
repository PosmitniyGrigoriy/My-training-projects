package ru.site.lesson23_4;

public class ZZZ {
	
	private String name;
	private String surname;
	
	ZZZ(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	String getName() {
		return name;
	}
	
	String getSurname() {
		return surname;
	}
	
	protected void say() {
		System.out.println("11");
	}
	
}
