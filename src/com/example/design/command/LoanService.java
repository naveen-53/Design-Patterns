package com.example.design.command;


// Receiver
public class LoanService {

    public void approve(String loanId) {
        System.out.println("Loan Approved : " + loanId);
    }

    public void reject(String loanId) {
        System.out.println("Loan Rejected : " + loanId);
    }

    public void hold(String loanId) {
        System.out.println("Loan Put On Hold : " + loanId);
    }
}