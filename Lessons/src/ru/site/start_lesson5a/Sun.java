package ru.site.lesson5a;

public class Sun {
	
	String name;
	int quantity;
	String theBeginningOfDaylight;
	String endOfDaylight;
	String otherSettings;
	
	public Sun(String name, int quantity, String theBeginningOfDaylight, String endOfDaylight, String otherSettings) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.theBeginningOfDaylight = theBeginningOfDaylight;
		this.endOfDaylight = endOfDaylight;
		this.otherSettings = otherSettings;
		
		System.out.println(name + ", " + quantity + " единица, " + "со скольки до скольки светит объект - " + "с " + theBeginningOfDaylight + " до "  + endOfDaylight + ", что делает объект - " + otherSettings);
		
	}
	
}
