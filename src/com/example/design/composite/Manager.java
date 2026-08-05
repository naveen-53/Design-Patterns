package com.example.design.composite;

import java.util.ArrayList;
import java.util.List;

// composite
public class Manager implements EmployeeRole {
	
	private String name;
	private List<EmployeeRole> employees = new ArrayList<>();	
	
	public Manager(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<EmployeeRole> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeRole> employees) {
		this.employees = employees;
	}

	public void add(EmployeeRole e) {
		employees.add(e);
		
	}

	@Override
	public void showDetails() {
		System.out.println(name +" is role was a Manager");
		System.out.println("Employees under Manager "+name);
		for(EmployeeRole e : employees) {
			
			System.out.println(e);
			
		}
	}
	
	@Override
	public String toString() {
		return name + " and Employee List "+ 
				employees;
	}

}
