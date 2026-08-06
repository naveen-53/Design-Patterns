package com.example.design.strategy;

public class UpiPayment implements PaymentStrategy{

	@Override
	public void pay() {
		System.out.println("Paid by UPI");
		
	}

}
