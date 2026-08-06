package com.example.design.command;


// client
public class CommandPattern {
	
	public static void main(String args[]) {
		
		String loanId = "LR123456";
		
		LoanService service = new LoanService();
        LoanWorkflow workflow = new LoanWorkflow();
        LoanCommand approve = new ApproveLoanCommand(service, loanId);

        
        workflow.setCommand(approve);
        workflow.process();
		
	}

}
