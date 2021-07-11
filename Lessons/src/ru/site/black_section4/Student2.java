package ru.site.section4;

public class Student2 {

	String name;
	Integer age;

	Student2(String name, int age) {
			this.name = name;
			this.age = age;
		}

	@Override
	public String toString() {
		return name + " " + age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
//	@Override
//	public int hashCode() {
//		return name.length() * 7 + age * 11;
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student2 other = (Student2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
