package ok.ru.site.varioustopics;

public class Man2 extends BaseInfo {

	public Man2(String name, int height, int weight, ok.ru.site.varioustopics.ColorEye ColorEye,
			ok.ru.site.varioustopics.ColorSkin ColorSkin) {
		super(name, height, weight, ColorEye, ColorSkin);
	}

	public boolean isReadyToDoctor () {
		if (age > 20) {
			return true;
		} else {
			return false;
		}
	}
	
}