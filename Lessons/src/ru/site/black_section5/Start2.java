package ru.site.section5;

class Car {
	
	// Ниже будет теория по первому типу - статический внутренний класс.
	
	String color;
	int doorCount;
	Engine engine;
	static int a;
	private static int b;
	
	Car(String color, int doorCount, Engine engine) {
		this.color = color;
		this.doorCount = doorCount;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "My car: [color=" + color + ", doorCount=" + doorCount + ", engine=" + engine + "]";
	}
	
	void methode() {
		System.out.println(Engine.countOfObjects); // так можно вывести с 37 строки стэтик переменную стэтик класса.
		Engine engine = new Engine(500);
		System.out.println(engine.horsePower); // Так можно вывести с 36 строки прайвэт переменную стэтик класса.
//		System.out.println(Engine.horsePower); // Так нельзя вывести с 36 строки прайвэт переменную стэтик класса. Будет ошибка. Переменная не видна.
	}
	
	public static class Engine {
		// Если это дополнительный внешний класс, то public может быть только у класса, который называется как файл класс.
		// Если это внутренний класс в основном классе, то там можно писать снова public у неограниченного количества классов.
		
		// Стэтик классы могут содержать как стэтик элементы, так и не стэтик. Пример ниже. Также: не все обычные классы могут содержать стэтик элементы.
		private int horsePower;
		static int countOfObjects;

		Engine(int horsePower) {
			this.horsePower = horsePower;
			countOfObjects++;
			// Стэтик вложенный класс может обращаться к private элементам внешнего класса, но только к static. Ниже пример.
			System.out.println(a); // Указана стэтик переменная с 10 строки. Работает, так как переменная стэтик.
//			System.out.println(doorCount); // А переменную на этой строке (она на 8 строке) нельзя добавить, так как она не стэтик. в статическом класса можно обращаться только к статическим переменным из других классов.
			System.out.println(b); // Также указана переменная b. Она на 11 строке. Она и стэтик, и прайвэт. Но тоже видна. Так как работа с переменной идет в одном файле класса. Внешний класс может обращаться даже в private элементам static nested класса и наоброт.
		}

		@Override
		public String toString() {
			return "My engine: [horsePower=" + horsePower + "]";
		}
		
	}
	
	// У основных классов можно делать или public или дэфалт, а внутри какого-то класса можно создавать вложенные классы уже со всеми уровнями доступа. Показано ниже.
	public static class test1 { }
	protected static class test2 { }
	static class test3 { }
	private static class test4 { }
	
}

public class Start2 {
	public static void main(String[] args) {
		
		Car.Engine engine = new Car.Engine(250); // Указывать основной класс, затем вложенный обязательно должен быть static, иначе new Car.Engine будет с ошибкой.
		System.out.println(engine);
		Car car = new Car("Black", 4, engine);
		System.out.println(car);
		
		Car car2 = new Car("Black", 4, new Car.Engine(300));
		System.out.println(car2);
		
	}
}

class Z extends Car.Engine {
	Z() { super(200); } // Вызывается кэнстрактэ с более высокого класса и указывается значение инт для того кэнстрактэ.
}

// Также как и внутренние классы (вложенные) можно делать и вложенные интерфейсы. Все почти также.
