// Урок от Book Yakov Fine

package ok.ru.site.logic;

public class Start3 {

	public static void main(String[] args) {
		
//		variant one
		
		int discount;
		int price = 150;
		String city = "moscow";
		
		if (city.equals("khabarovsk") || city.equals("vladivostok") || city.equals("rostov") || !city.equals("khabarovsk") || !city.equals("vladivostok") || !city.equals("rostov")) {

			if (city == "khabarovsk") {
			
				if (city.equals("khabarovsk") && price > 100) {
					discount = 20;
					System.out.println("Ваша скидка " + discount + "%");
				} else {
					discount = 10;
					System.out.println("Ваша скидка " + discount + "%");
				}
		
			} else if (city == "vladivostok") {
		
				if (city.equals("vladivostok") && price > 100) {
					discount = 8;
					System.out.println("Ваша скидка " + discount + "%");
				} else {
					discount = 4;
					System.out.println("Ваша скидка " + discount + "%");
				}
			} else if (city == "rostov") {
			System.out.println("В этом городе скидок пока нет.");
		} else {
			System.out.println("Вашего города нет в списке. Скидок нет.");
		}
		}
		
		
		
		
		
		
		
		
//		variant two
		
//		int discount;
//		int price = 50;
//		
//		discount = price > 100 ? 20:10;
//		
//		if (price > 100) {
//			discount = 20;
//			System.out.println("20%");
//		} else {
//			discount = 10;
//			System.out.println("10%");
//		}
		
	}

}
