// ”рок от Book Yakov Fine

package ru.site.animals;

public class StartFishMaster {

	public static void main (String[] args) {
		
		Fish myFish = new Fish ();
		myFish.dive(1);
		myFish.dive(3);
		myFish.sleep();
		
		System.out.println(myFish.say(null));
		
	}

}

