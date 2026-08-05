package com.example.design.bridge;

public class SmartRemote implements Remote {
	
	TV tv;
	
	SmartRemote(TV tv){
		this.tv = tv;
	}

	@Override
	public void power() {
		tv.on();
		System.out.println("Voice control enabled");
		
	}
	

}