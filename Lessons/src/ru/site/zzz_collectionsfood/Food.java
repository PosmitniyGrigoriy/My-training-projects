package ru.site.collectionsfood;

public class Food {
	
	Type type;
	String name;
	
	Food(Type type, String name) {
		this.type = type;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
