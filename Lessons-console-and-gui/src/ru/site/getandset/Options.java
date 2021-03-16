package ru.site.getandset;

public class Options {
	private int oilCar = 0;
	private int tempCar = 0;

	public int getOilCar () {
		return oilCar;
		
		
	}

	public void setOilCar (int oil) {
		
		if (oil > 0) {
			oilCar = oil;
			System.out.println("Добавлено топлива: " + oil);
		} else {
			System.out.println("Ошибка");
		}


	}
	
	
}
