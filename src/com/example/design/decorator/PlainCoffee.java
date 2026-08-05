package com.example.design.decorator;

public class PlainCoffee implements Coffee{

	@Override
	public String getDescription() {
		return "Plain Coffee";
	}

	@Override
	public double cost() {
		return 100;
	}

}
