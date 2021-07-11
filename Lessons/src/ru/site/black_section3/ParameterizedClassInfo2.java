package ru.site.section3;

public class ParameterizedClassInfo2<T extends Number> {

	private T value;

	public ParameterizedClassInfo2(T value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "[ " + value + " ]";
	}

	public T getValue() {
		return value;
	}

}

interface test5 {}
interface test6 {}
