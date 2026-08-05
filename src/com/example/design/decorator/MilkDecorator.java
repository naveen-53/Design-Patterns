package com.example.design.decorator;

public class MilkDecorator extends CoffeeDecorator{
	
	public MilkDecorator(Coffee coffee) {
		super(coffee);
		
	}

	@Override
	public String getDescription() {
		return coffee.getDescription()+" + Milk";
		
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return coffee.cost()+20;
	}

}
