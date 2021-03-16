package ok.ru.site.varioustopics;

public abstract class BaseInfo implements Doctor {
	
	String name;
	int height;
	int weight;
	ColorEye ColorEye;
	ColorSkin ColorSkin;
	protected double age = 18;
	
	public BaseInfo(String name, int height, int weight, ColorEye ColorEye, ColorSkin ColorSkin) {
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.ColorEye = ColorEye;
		this.ColorSkin = ColorSkin;
	}

	public void addAge (int addAge2) {
		if (addAge2 < 1) {
			System.out.println("”кажите положительное значение");
			System.out.println("");
		} else {
			age += addAge2;
		}
	}
	
	
	public void addAge (double addAge2) {
		this.addAge((int)addAge2);
	}
	

	public double getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "BaseInfo [name=" + name + ", height=" + height + ", weight=" + weight + ", ColorEye=" + ColorEye
				+ ", ColorSkin=" + ColorSkin + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ColorEye == null) ? 0 : ColorEye.hashCode());
		result = prime * result + ((ColorSkin == null) ? 0 : ColorSkin.hashCode());
		long temp;
		temp = Double.doubleToLongBits(age);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + height;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseInfo other = (BaseInfo) obj;
		if (ColorEye != other.ColorEye)
			return false;
		if (ColorSkin != other.ColorSkin)
			return false;
		if (Double.doubleToLongBits(age) != Double.doubleToLongBits(other.age))
			return false;
		if (height != other.height)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	
}
