package ok.ru.site.animals;

public class Fish2 {

	// Для FishMaster 2
	int currentDepth;
	
	Fish2 (int currentDepth) {
		this.currentDepth = currentDepth;

	if (currentDepth > 100) {
		System.out.println("Я не погружаюсь глубже 100 метров");
	} else {
		System.out.println("Ныраю на глубину " + currentDepth + " футов");
		System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
	}
	}
	
	// Для FishMaster 3
	public int dive (int howDeep) {
		currentDepth += howDeep;

		if (currentDepth > 100) {
			System.out.println("Я не погружаюсь глубже 100 метров");
		} else {
			System.out.println("Ныраю на глубину " + howDeep + " футов");
			System.out.println("Я на глубине " + currentDepth + " футов ниже уровня моря");
		}
		return currentDepth;
		}
}