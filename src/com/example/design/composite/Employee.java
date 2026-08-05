package com.example.design.composite;


// leaf
public class Employee implements EmployeeRole {
	
	private String name;

	public Employee(String name){
		this.name=name;
		
	}

	@Override
	public void showDetails() {
		System.out.println(name +" is role was an Employee");
		
	}
	
	@Override
    public String toString() {
        return name;
    }
	

}
