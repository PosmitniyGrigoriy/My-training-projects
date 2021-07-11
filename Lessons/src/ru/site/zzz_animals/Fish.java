package ru.site.animals;

public class Fish extends Pet {

	int currentDepth = 0;
	
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
	
	@Override
	public String say(String something) {
		return "Ты чё не знаешь, что рыбы не разговаривают?";
	}

}