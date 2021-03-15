// Урок от Book Yakov Fine

package ok.ru.site.game2;

public class Start {

	public static void main(String[] args) {

//		Variant one
		String[] namePlayer = new String[4];
		namePlayer[0] = "Alex";
		namePlayer[1] = "Nicole";
		namePlayer[2] = "Igor";
		namePlayer[3] = "Nikita";

//		Variant two
//		String[] namePlayers = { "Alex", "Nicole", "Igor", "Nikita" };

		int totalplayers = namePlayer.length;
		System.out.println("Итого игроков: " + totalplayers);

		String theWinner = namePlayer[1];
		System.out.println("Победил игрок: " + theWinner + "\n");

		System.out.println("Список игроков:");

		for (int i = 0; i < namePlayer.length; i++) {
			String thePlayer = namePlayer[i];
			if (thePlayer.equals("Nicole")) {
				break; // continue or break
			}
			System.out.println(thePlayer);
		}

//			Variant one
//			int counter = 0;
//			while (counter < namePlayer.length) {
//				if (counter == 3) {
//					break;
//				}
//				String thePlayer = namePlayer[counter];
//				System.out.println("Поздравляем, " + thePlayer + "!");
//				counter++;
//			}
			
//		Variant two
//		int i = 0;
//		while (i < namePlayer.length) {
//
//			String thePlayer = namePlayer[i];
//			i++;
//			if (thePlayer.equals("Igor")) {
//				continue;
//			}
//			System.out.println("Поздравляем, " + thePlayer + "!");
//
//		}

		}

	}

