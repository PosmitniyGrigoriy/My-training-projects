package ru.site.section3;

class ParameterizedClassInfo<T> {
	
	private T value; // Переменная не может быть статичной

	public ParameterizedClassInfo(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "[ " + value + " ]"; // Такие скобки нужно ставить, как как без скобок 1 переменная, и она дает ошибку, а 2 и более переменных уже не дают ошибку и можно без скобок обойтись.
	}
	
	public T getValue() {
		return value;
	}
	
//		public void testQ(ParameterizedClassInfo<String> info) {
//			String s = info.getValue();
//			System.out.println(s);
//		}

}
