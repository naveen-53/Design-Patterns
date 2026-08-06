package com.example.design.command;

public class HoldLoanCommand implements LoanCommand {

	private LoanService loanService;
	private String loanId;
	
	public HoldLoanCommand(LoanService loanService, String loanId) {
		super();
		this.loanService = loanService;
		this.loanId = loanId;
	}

	@Override
	public void execute() {
		loanService.hold(loanId);	
	}
}
