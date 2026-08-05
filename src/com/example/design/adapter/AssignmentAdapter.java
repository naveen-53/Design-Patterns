package com.example.design.adapter;


//Adapter
public class AssignmentAdapter implements Pen {
	
	ParkerPen pen = new ParkerPen();

	@Override
	public void write(String str) {
		pen.mark(str);
		
	}

}
