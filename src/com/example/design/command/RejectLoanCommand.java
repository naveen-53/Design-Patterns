package com.example.design.command;

public class RejectLoanCommand implements LoanCommand{

	
	private LoanService loanService;
	private String loanId;
	
	public RejectLoanCommand(LoanService loanService, String loanId) {
		super();
		this.loanService = loanService;
		this.loanId = loanId;
	}


	@Override
	public void execute() {
		loanService.reject(loanId);
		
	}
}
