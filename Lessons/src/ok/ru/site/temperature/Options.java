package ok.ru.site.temperature;

public class Options {

	// Variant one
    public String convertTemp(float temperature, char convertTo) {
        String temperature2;
        switch (convertTo) {
            case 'C':
            case 'c':
                temperature = (temperature * 1.8f) + 32;	// Convert C to F and C = from -6.7 to 93.3
                break; 
            case 'F':
            case 'f':
                temperature = (temperature - 32) / 1.8f;	// Convert F to C and F = from 20 to 200
                break;
            default:
                System.out.println("Ошибка");
        }
        temperature2 = "Температура: " + temperature;
        System.out.println(temperature2);
        return temperature2;
        
    }
    
    // Variant two
	public String addTemp(float Temp, char symbol) {
		
		String RezTemp;
		
		if (symbol == 'F') {
			Temp = (Temp - 32) / 1.8f;
		} else {
			Temp = (Temp * 1.8f) + 32;
		}
		
		RezTemp = "Температура: " + Temp;
		System.out.println(RezTemp);
		return RezTemp;
		
	}
	
}
