package com.example.design.command;


// Invoker
public class LoanWorkflow {
	
	LoanCommand command;

	public void setCommand(LoanCommand command) {
		this.command = command;
	}
	
	public void process() {
		command.execute();
	}
	
	
	

}
