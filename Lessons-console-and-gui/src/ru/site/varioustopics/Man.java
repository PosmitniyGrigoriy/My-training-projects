package ru.site.varioustopics;

public class Man extends BaseInfo {

	public Man(String name, int height, int weight, ru.site.varioustopics.ColorEye colorEye,
			ru.site.varioustopics.ColorSkin colorSkin) {
		super(name, height, weight, colorEye, colorSkin);
	}
	
	public boolean isReadyToDoctor () {
		if (age > 22) {
			return true;
		} else {
			return false;
		}
	}
	
}