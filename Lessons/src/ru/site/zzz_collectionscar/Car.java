package ru.site.collectionscar;

import java.util.ArrayList;

public class Car {
	
	Model model;
	Integer price;
	Color color;
	
	Car() {
	}
	
	Car(Model model, int price, Color color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return  model + " " + price + " " + color;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
