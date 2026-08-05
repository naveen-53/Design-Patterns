package com.example.design.decorator;

public class SugarDecorator extends CoffeeDecorator{

	public SugarDecorator(Coffee coffee) {
		super(coffee);
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return coffee.getDescription()+" + Sugar";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost() + 10;
	}

}
