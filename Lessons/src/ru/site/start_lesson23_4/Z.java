package ru.site.lesson23_4;

public class Z extends ZZZ {
	
	Z(String name, String surname) {
		super(name, surname);
	}
	
	@Override
	public void say() {
		System.out.println("22");
	}
	
	public static void main(String[] args) {
		
		Z z = new Z("111", "222");
		z.say();
		
	}

}
