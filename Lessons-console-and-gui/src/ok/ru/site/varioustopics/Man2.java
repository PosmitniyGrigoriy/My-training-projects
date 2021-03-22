package ok.ru.site.varioustopics;

public class Man2 extends BaseInfo {

	public Man2(String name, int height, int weight, ok.ru.site.varioustopics.ColorEye colorEye,
			ok.ru.site.varioustopics.ColorSkin colorSkin) {
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