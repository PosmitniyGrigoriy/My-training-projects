package ru.site.modificators;

public class Options {

	// пэкэдж модификатор 1 и 2 и 3 - это одно задание.
	
	/*
	 Есть 4 уровня доступа:
	 1. private - доступ только внутри класса
	 2. default - доступ внутри пакета
	 3. protected - доступ внутри пакета + наследники
	 4. public - доступ всем классам
	 */
	
	
	
	
	private String text1 = "private";
	String text2 = "default";
	protected String text3 = "protected";
	public String text4 = "public";
	
	
	
	
	private void strPrivate () {
		System.out.println(text1);
	}
	
	void strDefault () {
		System.out.println(text2);
	}
	
	protected void strProtected () {
		System.out.println(text3);
	}
	
	public void strPublic () {
		System.out.println(text4);
	}
	
	
	

}
