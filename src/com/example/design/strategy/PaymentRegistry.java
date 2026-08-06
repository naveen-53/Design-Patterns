package com.example.design.strategy;

import java.util.HashMap;

public class PaymentRegistry {
	
	public static final HashMap<String, PaymentStrategy> strategies = new HashMap<>();
	static {
		strategies.put("UPI", new UpiPayment());
		strategies.put("CARD", new CardPayment());	
	}
	
	public static PaymentStrategy getStrategy(String type) {
		return strategies.get(type);
	}

}
