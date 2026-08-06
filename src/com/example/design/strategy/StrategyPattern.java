package com.example.design.strategy;

import java.util.Scanner;

public class StrategyPattern {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Payment Type : ");

        String type = sc.nextLine().toUpperCase();

        PaymentStrategy strategy = PaymentRegistry.getStrategy(type);

        strategy.pay();
        
        sc.close();
	}


}
