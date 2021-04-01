// ”рок от Book Yakov Fine

package ru.site.animals;

public class StartPetMaster {

	public static void main(String[] args) {
		
		String petReaction;
		Pet myPet = new Pet ();
		myPet.eat();
		petReaction = myPet.say ("„ик! „ирик!");
		System.out.println(petReaction);
		myPet.sleep();
	}

}
