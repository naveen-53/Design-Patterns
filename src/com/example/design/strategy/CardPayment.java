package com.example.design.strategy;

public class CardPayment implements PaymentStrategy{

	@Override
	public void pay() {

		System.out.println("Paid by card");
	}

}
