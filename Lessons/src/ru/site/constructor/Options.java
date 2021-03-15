package ru.site.constructor;

public class Options {
	
	String name;
	String color;
	int weigth;
	int heigth;
	int year;
	
	// ћожно создать 3 варианта или сколько-то вариантов конструкторов. » потом выводить нужные данные. Ќо важно, чтобы типы данных были разные. Ќапример, если 2 данных указано внутри конструкткора, то если один раз есть инт и инт, то второй раз, если так написать, то будет ошибка. Ќужно делать инт и стринг или наоборот или делать 1 данные или 3 или более 3.
	
	public Options () {
		
	}

	public Options(String name, int year) {
		this.name = name;
		this.year = year;
	}
	
	public Options(int weigth, int year) {
		this.color = color;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Options [name=" + name + ", color=" + color + ", weigth=" + weigth + ", heigth=" + heigth + ", year="
				+ year + "]";
	}
	
}
