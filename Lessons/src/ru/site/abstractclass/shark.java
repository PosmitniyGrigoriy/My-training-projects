package ru.site.abstractclass;

public class shark extends Fish {

	@Override
	public void swim() {
		System.out.println("Я акула. Я плаваю.");
	}

	@Override
	public void breathe() {
		System.out.println("Я акула. Я дышу.");
	}

	@Override
	public void eat() {
		System.out.println("Я акула. Я ем.");
	}

}
