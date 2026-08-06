package com.example.design.adapter;


//Adapter
public class AssignmentAdapter implements Pen {
	
	ParkerPen pen ;

	@Override
	public void write(String str) {
		if(str != null) {
			pen = new ParkerPen();
			pen.mark(str);
		}
		
		
	}

}
