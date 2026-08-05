package com.example.design.abstract_factory;

public class MacButton implements Button {

    @Override
    public void paint() {
        System.out.println("Mac Button Created");
    }
}