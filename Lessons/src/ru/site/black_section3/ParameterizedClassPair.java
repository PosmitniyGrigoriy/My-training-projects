package ru.site.section3;

class ParameterizedClassPair<V1, V2> {
	
	private V1 value1;
	private V2 value2;

	public ParameterizedClassPair(V1 value1, V2 value2) {
		this.value1 = value1;
		this.value2 = value2;
	}

	@Override
	public String toString() {
		return value1 + " " + value2;
	}

	public V1 getValue1() {
		return value1;
	}

	public V2 getValue2() {
		return value2;
	}
	
}
