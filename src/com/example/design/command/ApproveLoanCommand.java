package com.example.design.command;

public class ApproveLoanCommand implements LoanCommand{

	private LoanService loanService;
	private String loanId;
	
	public ApproveLoanCommand(LoanService loanService, String loanId) {
		super();
		this.loanService = loanService;
		this.loanId = loanId;
	}


	@Override
	public void execute() {
		loanService.approve(loanId);
		
	}

}
