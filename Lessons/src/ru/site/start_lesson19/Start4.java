package ru.site.lesson19;

public class Start4 {
	
	static void abc(String ... args) {
		String[] listWord = {"Boy", "Girl", "One", "Two"};
		for(int i = 0; i < listWord.length; i++) {
			for(int j = 0; j < args.length; j++) {
				if(listWord[i] == args[j]) {
					listWord[i] = null;
				}
			}
			
			// Использовать что-то одно: или традиционный фор, или фор ич
			
			// Ниже традиционный фор. Выводит без null
//			if(listWord[i] != null) {
//				System.out.println(listWord[i]);
//			}
		}
		// Ниже фор ич. Выводит с null
		for(String result : listWord) {
			System.out.println(result);
		}
	}
	
	public static void main(String[] args) {
		abc("s", "Boy", "Акула", "One", "Банан");
	}

}
