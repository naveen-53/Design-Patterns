package com.example.design.bridge;

public class BasicRemote implements Remote {
	
	TV tv;
	
	BasicRemote(TV tv){
		this.tv = tv;
	}

	@Override
	public void power() {
		tv.on();
		
	}
	

}
