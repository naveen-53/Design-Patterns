package com.example.design.adapter;

public class AssignmentWork {
	
	Pen pen;

	public Pen getPen() {return pen;}
	public void setPen(Pen pen) {this.pen = pen;}
	
	void writeAssignment(String str) {
		pen.write(str);
	}

}
