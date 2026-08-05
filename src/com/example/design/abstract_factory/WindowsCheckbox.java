package com.example.design.abstract_factory;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void check() {
        System.out.println("Windows Checkbox Created");
    }
}