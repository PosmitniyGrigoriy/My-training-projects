package ru.site.section4;

public class Car implements Comparable<Car> {

	int id;
	String nameModel;
	int year;
	String owner;

	Car(int id, String nameModel, int year, String owner) {
		this.id = id;
		this.nameModel = nameModel;
		this.year = year;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return id + " " + nameModel + " " + year + " " + owner;
	}

	@Override
	public int compareTo(Car car) {
		int result = this.id - car.id;
		if (result == 0) {
			this.owner.compareTo(car.owner);
		}
		return result;
	}

}
