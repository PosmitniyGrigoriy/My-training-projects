package ru.site.lesson16;

public class Start4 {

	String email;

	void email(String email) {
		this.email = email;

		String result[] = email.split("; ");
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i].replace("ya@", "").replace("on@", "").replace("ona@", "").replace(".com", "").replace(".ru", "").replace(" ", ""));

		}
	}

	public static void main(String[] args) {

		String list = "ya@yahoo.com;     on@mail.ru;         ona@gmail.com";

		Start4 useDomain = new Start4();
		useDomain.email(list);
		
	}

}
