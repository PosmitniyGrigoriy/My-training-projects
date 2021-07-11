package ru.site.section4;

public class Student {
	
	private String name;
	private int age;
	private int course;
	private double averageRating;
	
	Student(String name, int age, int course, double averageRating) {
		this.name = name;
		this.age = age;
		this.course = course;
		this.averageRating = averageRating;
	}
	
	@Override
	public String toString() {
		return name + " " + age + " " + course + " " + averageRating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		long temp;
		temp = Double.doubleToLongBits(averageRating);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + course;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (Double.doubleToLongBits(averageRating) != Double.doubleToLongBits(other.averageRating))
			return false;
		if (course != other.course)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
