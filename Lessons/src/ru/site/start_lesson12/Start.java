package ru.site.lesson12;

public class Start {
	
	String name;
	int age;
	
	Start(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Start other = (Start) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}



	public static void main(String[] args) {

		
		Start test1 = new Start("Имя1", 20);
		Start test2 = new Start("Имя1", 20);
		
		// Сравнение по области памяти
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test1==test2);
		
		// Сравнение по аргументам объекта
		System.out.println(test1.equals(test2));
		

		byte x = 10;
		byte y = 15;
		int result = (x > y) ? 1 : 0;
		System.out.println(result);
		
		byte x2 = 10;
		byte y2 = 5;
		boolean result2 = (x2 > y2) ? true : false;
		System.out.println(result2);
		
		String text1 = "I go";
		String text2 = "I go to";
		String result3 = (text1 == text2) ? "Текст одинаковый" : "Текст разный";
		System.out.println(result3);
		
		
	}
}
