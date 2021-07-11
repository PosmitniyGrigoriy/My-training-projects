package ru.site.lesson22;

public class Start {

	private String name;
	private int age;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		if(age > 30) {
			this.age = age;
		}
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	public static void main(String[] args) {
		
		Start start = new Start();
		start.setName("Барон");
		start.setAge(32);
		System.out.println(start);
		System.out.println(start.name);
		System.out.println(start.getName());
		start.setAge(20);
		System.out.println(start.getAge());
		System.out.println(start);
		
		
	}

}
