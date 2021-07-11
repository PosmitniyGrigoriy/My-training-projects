package ru.site.lesson19;

public class Start6 {
	
	static String[] listWord(String ... listWord) {
		for(int i = 0; i < listWord.length; i++) {
			System.out.print(listWord[i] + " ");
		}
		System.out.println();
		return listWord;
	}
	
	public static void main(String[] args) {
		
		String[] text = listWord(new String[] {"One", "Two", "Six", "Boy", "Girl"});
		
		for(String a : args) {
			for(int j = 0; j < text.length; j++) {
				if(a.equals(text[j])) {
					text[j] = null;
				}
			}
		}
		
		for(String x2 : text) {
			System.out.print(x2 + " ");
		}
		
	}

}
