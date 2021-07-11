package ru.site.lesson5a;

public class Start {

	public static void main(String[] args) {
		
		Planet planet = new Planet("Земля", 7_000_000_000L);
		planet.sun = new Sun("Солнце", 1, "07:00", "20:00", "освещает пространство, при свете вырабатываются компоненты в теле, растут овощи, фрукты и так далее");
		planet.air = new Air("Воздух", 1, 4, "средняя");
		
		System.out.println(planet.air.name = "nameAir");
		
		Country country = new Country();
		System.out.println(country.name = "nameCountry");
		System.out.println(country.quantity = 15);
		
	}

}
