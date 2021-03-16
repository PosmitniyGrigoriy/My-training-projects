// ”рок от Book Yakov Fine

package ok.ru.site.car;

public class Start {

	public static void main(String[] args) {
		
		Car Start = new Car ();
		Start.start();
		Start.stop();
		Start.drive(2);
		
		Car Start2 = new CarMans ();
		Start2.drive(10);
		
		System.out.println(Start.distance + " test");
		System.out.println(Start2.distance + " ok");
		
	}

}
