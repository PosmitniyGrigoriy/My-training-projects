package ru.site.lesson12;

public class Start3 {

	String name;
	int age;
	
	Start3(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	Start3() {
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Start3 other = (Start3) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	static void comparingObjects(Start3 variable1, Start3 variable2) {
		System.out.println(variable1.equals(variable2));
	}
	
	



	public static void main(String[] args) {
		
		
		
		Start3 test1 = new Start3();
		Start3 test2 = new Start3();
		
		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test1==test2);
		
		System.out.println(test1.equals(test2));
		
		System.out.println();
		
		Start3 test3 = new Start3("Игорь", 25);
		Start3 test4 = new Start3("Игорь", 25);
		
		System.out.println(test3);
		System.out.println(test4);
		System.out.println(test3==test4);
		
		System.out.println(test3.equals(test4));
		
		System.out.println();
		
		Start3 test10 = new Start3("Игорь", 25);
		Start3 test11 = new Start3("Олег", 22);
		Start3 test12 = new Start3("Игорь", 25);
		
		Start3.comparingObjects(test10, test11);
		Start3.comparingObjects(test10, test12);
		
		
		
		
		if (test10.equals(test11)) {
			System.out.println("test10 = test11");
		} else {
			System.out.println("test10 != test11");
		}
		
		if (test10.equals(test12)) {
			System.out.println("test10 = test12");
		} else {
			System.out.println("test10 != test12");
		}
		
		
		if (test10.name.equals(test11.name)) {
			System.out.println(test10.name + " = " + test11.name);
		} else {
			System.out.println(test10.name + " != " + test11.name);
		}
		
		if (test10.name.equals(test12.name)) {
			System.out.println(test10.name + " = " + test12.name);
		} else {
			System.out.println(test10.name + " != " + test12.name);
		}
		
				
		System.out.println();
		
		//  Для областей памяти всегда будет false через ==, хотя аргументы одинаковые могут быть. Все дело в том, что у каждого обекта своя область памяти уникальная и компьютер считает, что они разные, поэтому false. Чтобы было true, нужно использовать equals. test1.equals(test2) и добавить еще код для преобразования для equals. Без него не будет true.
		
		if (test10 == test11) {
			System.out.println("test10 = test11");
		} else {
			System.out.println("test10 != test11");
		}
		
		if (test10 == test12) {
			System.out.println("test10 = test12");
		} else {
			System.out.println("test10 != test12");
		}
		
		
		if (test10.name == test11.name) {
			System.out.println(test10.name + " = " + test11.name);
		} else {
			System.out.println(test10.name + " != " + test11.name);
		}
		
		if (test10.name == test12.name) {
			System.out.println(test10.name + " = " + test12.name);
		} else {
			System.out.println(test10.name + " != " + test12.name);
		}
		
		System.out.println();
		
		Start3 test30 = new Start3("Игорь", 25);
		Start3 test31 = new Start3("Олег", 22);
		Start3 test32 = new Start3("Игорь", 25);
		
		if (test30.name == test31.name) {
			if (test30.age == test31.age) {
				System.out.println("Имя и возраст первого и второго человека совпадают");
			} else {
				System.out.println("Имя первого и второго человека совпадает, а возрасты разные");
			}
		} else {
			System.out.println("Имя первого и второго человека не совпадает. Дальше анализ делать нет смысла.");
		}
		
		if (test30.name == test32.name) {
			if (test30.age == test32.age) {
				System.out.println("Имя и возраст первого и второго человека совпадают");
			} else {
				System.out.println("Имя первого и второго человека совпадает, а возрасты разные");
			}
		} else {
			System.out.println("Имя первого и второго человека не совпадает. Дальше анализ делать нет смысла.");
		}
		
		
	}

}
