// ”рок от Sergey Nemchinsky Java Start

package ok.ru.site.outtextandnumbersandboolean;

public class Start7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
		int b = 5;
		int rez = a * b;
		
		int c = 15;
		
		
		boolean rez2;
		if (rez > c) {
			rez2 = true;
		} else {
			rez2 = false;
		}
		
		
		boolean rez3 = rez > c ? true:false;
		
		
		System.out.println(rez + " | " + rez2);
		System.out.println(rez + " | " + rez3);
	}

}
