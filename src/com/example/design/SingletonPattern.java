package com.example.design;


public class SingletonPattern {
	
	private static SingletonPattern instance;
	private String name;
	
	public String getName() {	return name;	}

	public void setName(String name) {	this.name = name;	}

    private SingletonPattern() {}

    public static SingletonPattern getInstance() {

        if(instance == null)
            instance = new SingletonPattern();

        return instance;
    }
    
    public static void main(String args[]) {
    	SingletonPattern s1 = SingletonPattern.getInstance();
    	s1.setName("Naveen");
    	System.out.println("before assign 2nd name: "+s1.getName());
    	SingletonPattern s2 = SingletonPattern.getInstance();
    	s2.setName("Raja");

    	System.out.println(s1 == s2);
    	System.out.println(s1.getName());
    	System.out.println(s2.getName());
    	System.out.println(s1);
    	System.out.println(s2);
    }
}