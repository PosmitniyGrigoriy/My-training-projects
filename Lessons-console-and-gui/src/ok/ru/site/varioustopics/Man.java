package ok.ru.site.varioustopics;

public class Man extends BaseInfo {

	public Man(String name, int height, int weight, ok.ru.site.varioustopics.ColorEye colorEye,
			ok.ru.site.varioustopics.ColorSkin colorSkin) {
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