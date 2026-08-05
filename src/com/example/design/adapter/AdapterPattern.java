package com.example.design.adapter;


// client
public class AdapterPattern {

	public static void main(String [] args) {
		
		//adaptee
		AssignmentWork aw = new AssignmentWork();
		
		//adapter
		AssignmentAdapter aa = new AssignmentAdapter();
		
		aw.setPen(aa);
		aw.writeAssignment("assignment completed");
		
	}
}
