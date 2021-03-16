package ok.ru.site.car;

public class Car {
	
	int distance;
	
	public void start () {
		System.out.println("Машина заведена");
	}
	public void stop () {
		System.out.println("Машина выключена");
	}
	
	public int drive (int howlong) {
		
		distance = howlong * 60;
		return distance;
	}
	

	
	
}
