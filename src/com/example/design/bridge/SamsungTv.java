package com.example.design.bridge;

public class SamsungTv implements TV {

	@Override
	public void on() {
		System.out.println("Samsung TV on");
		
	}

	@Override
	public void off() {
		System.out.println("Samsung TV off");
	}

}
