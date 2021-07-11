package ru.site.lesson21;

class NumberSybmol {
	
	void outputNumberSymbol(int a) {
		System.out.println(a);
	}
	
}

public class Start3 {
	
	public static void main(String[] args) {
		
		NumberSybmol numberSybmol = new NumberSybmol();
		char symbol = 'b';
		numberSybmol.outputNumberSymbol(symbol); // Выводит значение в DEC
		
	}
	
}
