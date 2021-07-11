// Урок от Book Yakov Fine

package ru.site.temperature;

public class Start {

	public static void main(String[] args) {
		
		// Variant one
		Options convertTemp = new Options ();
		convertTemp.convertTemp(50, 'F');
		
		// Variant two
		Options convertTemp2 = new Options ();
		convertTemp2.addTemp(50, 'C');
		
		
		
		
		
//		// Convert F to C
//		// F = from 20 to 200
//		float F = 50.0f;
//		float convertFtoC = (F - 32) / 1.8f;
//		System.out.println("Конвертирование F в C: " + convertFtoC);
//		
//		
//		// Convert C to F
//		// C = from -6.7 to 93.3
//		float C = 50.0f;
//		float convertCtoF = (C * 1.8f) + 32;
//		System.out.println("Конвертирование C в F: " + convertCtoF);
	
	}

}
