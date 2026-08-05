package com.example.design.composite;

public class CompositePattern {
	
	public static void main(String args[]) {
		
		Employee emp1 = new Employee("Bahubali");
		Employee emp2 = new Employee("Veera Raghavan");
        Employee emp3 = new Employee("Rocky Bhai");

        Manager manager1 = new Manager("Manager Deva");
        manager1.add(emp1);
        manager1.add(emp2);
        manager1.showDetails();

        Manager manager2 = new Manager("Manager Surya");
        manager2.add(emp3);

        Manager ceo = new Manager("CEO");

        ceo.add(manager1);
        ceo.add(manager2);

        ceo.showDetails();
		
	}

}
