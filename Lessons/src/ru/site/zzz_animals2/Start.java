// ”рок от Sergey Nemchinsky Java Start

package ru.site.animals2;

public class Start {

	public static void main(String[] args) {

		int options = 1;
		int optionsSay = 1;
		int optionsMove = 1;
		
		CommandsAnimals startCommands = new CommandsAnimals ();
		
		if (options == 1) {
		if (optionsSay == 1) {
			System.out.println("¬се животные одновременно начали говорить так, как они могут" + "\n");
			startCommands.sayDog();
			startCommands.sayCat();
			startCommands.sayMouse();
			startCommands.saySnake();
		} else {
			System.out.println("¬се животные внезапно замолчали");
		}
		} else {
		if (optionsMove == 1) {
			System.out.println("¬се животные одновременно начали двигатьс€ так, как они могут" + "\n");
			startCommands.moveDog();
			startCommands.moveCat();
			startCommands.moveMouse();
			startCommands.moveSnake();
		} else {
			System.out.println("¬се животные внезапно перестали двигатьс€");
		}
		}
	}
}
