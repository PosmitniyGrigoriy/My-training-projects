package ru.site.abstractclass;

public class carp extends Fish {

	@Override
	public void swim() {
		System.out.println("Я карп. Я плаваю.");
	}

	@Override
	public void breathe() {
		System.out.println("Я карп. Я дышу.");
	}

	@Override
	public void eat() {
		System.out.println("Я карп. Я ем." + "\n");
	}

}
