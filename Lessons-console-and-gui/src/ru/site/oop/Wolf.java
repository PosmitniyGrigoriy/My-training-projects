package ru.site.oop;

public class Wolf {

	int heigth;
	int weight;

	public void say() {
		System.out.println("Волк говорит");
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth (int heigth) {
		if (heigth > 120) {
			System.out.println("Таких волков нет");
		} else {		
			this.heigth = heigth;
			System.out.println("Рост волка " + heigth + " см");
		}
	}
	
}