package com.example.design.bridge;

public class BridgePattern {
	
	public static void main(String args[]) {
		
		TV tv = new SamsungTv();
		Remote remote = new SmartRemote(tv);
		
		remote.power();
	}
	

}
