package ru.site.section3;

class ParameterizedClassOtherPair<V> {
	private V value1;
	private V value2;

	public ParameterizedClassOtherPair(V value1, V value2) {
			this.value1 = value1;
		this.value2 = value2;
			}

	@Override
	public String toString() {
		return value1 + " " + value2;
	}

	public V getValue1() {
		return value1;
	}

	public V getValue2() {
		return value2;
	}
}
