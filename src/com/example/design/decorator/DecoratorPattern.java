package com.example.design.decorator;

public class DecoratorPattern {
	
	public static void main(String args[]) {
		
		Coffee coffee = new PlainCoffee();
		
		coffee = new MilkDecorator(coffee);
		coffee = new SugarDecorator(coffee);
		
		System.out.println(coffee.getDescription());
		System.out.println(coffee.cost());
		
		
		Coffee coffee1 = new PlainCoffee();
		
		coffee1 = new MilkDecorator(coffee1);
		
		System.out.println(coffee1.getDescription());
		System.out.println(coffee1.cost());
			
		
	}

}
