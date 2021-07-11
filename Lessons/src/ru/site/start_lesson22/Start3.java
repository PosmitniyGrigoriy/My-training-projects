package ru.site.lesson22;

class X {
	public X(String s) {
		System.out.println(s);
	}
}

class Y extends X {
	public Y() {
		super("מך");
		System.out.println("ןנטגוע");
	}
}


public class Start3 {

	public static void main(String[] args) {
		
		X x = new X("ייי");
		
		Y y = new Y();
		
	}

}
