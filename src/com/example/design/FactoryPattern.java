package com.example.design;


public class FactoryPattern {
	
	public static void main (String args[]) {
		FactoryPattern factory = new FactoryPattern();
		Car car = factory.getCar("BMW");
		car.drive();
	}

	public Car getCar(String type){
		return type.equals("BMW") ? new BMW() : new Tesla();
    }
}


interface Car{
    void drive();
}


class BMW implements Car{
    public void drive(){System.out.println("BMW");}
}


class Tesla implements Car{
    public void drive(){System.out.println("Tesla");}
}



