package ru.site.varioustopics;

public class Man2 extends BaseInfo {

	public Man2(String name, int height, int weight, ru.site.varioustopics.ColorEye colorEye,
			ru.site.varioustopics.ColorSkin colorSkin) {
		super(name, height, weight, colorEye, colorSkin);
	}

	public boolean isReadyToDoctor () {
		if (age > 20) {
			return true;
		} else {
			return false;
		}
	}
	
}