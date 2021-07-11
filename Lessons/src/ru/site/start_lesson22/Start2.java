package ru.site.lesson22;

public class Start2 {

	private String name;
	private StringBuilder name22;
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	// v1 - им€ можно мен€ть через append. —начала получаем им€, потом дописываем append и им€ мен€етс€
//	StringBuilder getName22() {
//		return name22;
//	}

	// v2 - им€ нельз€ мен€ть через append. —начала получаем им€, потом, если будет мен€тьс€ им€ через append, то это будет на копии, а на оригинал не отразитьс€. ѕоэтому выведетс€ оригинал.
	StringBuilder getName22() {
		StringBuilder sbName = new StringBuilder(name22);
		return sbName;
	}
	
	
	void setName22(StringBuilder name22) {
		this.name22 = name22;
	}
	
	@Override
	public String toString() {
		return name + " " + name22;
	}
	
	public static void main(String[] args) {
		
		Start2 start = new Start2();
		start.setName("Ѕарон");
		System.out.println(start);
		System.out.println(start.name);
		System.out.println(start.getName());
		System.out.println(start);
		
		start.setName22(new StringBuilder("Ѕарон"));
		start.getName22().append("!!!");
		System.out.println(start.getName22());
		
	}

}
