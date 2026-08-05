package com.example.design.bridge;

public class SonyTv implements TV {

	@Override
	public void on() {
		System.out.println("Sony TV on");
		
	}

	@Override
	public void off() {
		System.out.println("Sony TV off");
	}

}