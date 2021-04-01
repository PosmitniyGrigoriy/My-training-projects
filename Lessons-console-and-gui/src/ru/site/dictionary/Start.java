package ru.site.dictionary;

public class Start {

	public static void main(String[] args) {
		
		String translation = "мальчик девочка книга спать привет";
		String words = "boy girl book sleep hellow";
		String transcriptionEng = "bɔɪ gɜːl bʊk sliːp həˈləʊ";

		String[] translationArray = translation.split(" ");
		String[] wordsArray = words.split(" ");
		String[] transcriptionEngArray = transcriptionEng.split(" ");

		System.out.println("По-русски" + "\t" + "|    " + "По-английски" + "\t" + "|    " + "Произношение");
		System.out.println("---------------------------------------------------------");
		
		for (int i = 0; i < wordsArray.length; i++) {
		
			System.out.println(translationArray[i] + "\t" + "\t" + "|    " + wordsArray[i] + "\t" + "\t" + "|    " + transcriptionEngArray[i]);
					
		}
		
	}

}
