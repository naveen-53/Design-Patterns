package com.example.design.abstract_factory;

public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("Windows Button Created");
    }
}