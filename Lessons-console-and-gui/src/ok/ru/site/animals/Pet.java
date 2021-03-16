package ok.ru.site.animals;

public class Pet {

	int age;
	protected float weight;
	protected float height;
	protected String color;
	int depth = 0;

	public final void sleep () {
		System.out.println("Спокойной ночи! До завтра");
	}
		
	public void eat () {
		System.out.println("Я очень голоден. Давайте перекусим чипсами!");
	}
	
	public String say (String aWord) {
		String perResponse = "Ну ладно! " + aWord;
		return perResponse;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
