package com.example.design.abstract_factory;

public class MacCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("Mac Checkbox Created");
    }
}