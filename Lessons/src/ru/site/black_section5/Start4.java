package ru.site.section5;

class Math {
	
	// Ниже будет теория по третьему типу - локальный внутренний класс (в методе).
	
	// Локальный внутренний класс не является внутренним классом обычного класса или стэтик класса. Это отдельно от класса. Часть метода, например, или часть блока кода какого-то.
	
	// Внутри класса Math создан метод getResult. Внутри метода создан класс с полями и методами.  Также за пределами созданного класса, внутри класса getResult вводятся числа и выводятся результаты.
	
	public void getResult() {
		
		class Delenie {
			
			private int delimoe;
			private int delitel;
			
			public int getDelimoe() {return delimoe; }
			public void setDelimoe(int delimoe) { this.delimoe = delimoe; }
			public int getDelitel() { return delitel; }
			public void setDelitel(int delitel) { this.delitel = delitel; }
			public int getChastnoe() { return delimoe/delitel; }
			public int getOstatok() { return delimoe%delitel; }

		}
		
		Delenie delenie = new Delenie();
		delenie.setDelimoe(21);
		delenie.setDelitel(4);
		System.out.println("Делимое = " + delenie.getDelimoe());
		System.out.println("Делитель = " + delenie.getDelitel());
		System.out.println("Частное = " + delenie.getChastnoe());
		System.out.println("Остаток = " + delenie.getOstatok());
		
	}
	
	
	
}


public class Start4 {

	public static void main(String[] args) {
		
		
		
	}

}
