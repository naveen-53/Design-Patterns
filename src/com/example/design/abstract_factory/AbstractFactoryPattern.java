package com.example.design.abstract_factory;

public class AbstractFactoryPattern {
	
	public static void main(String[] args) {

        GUIFactory factory;

        String os = "Windows";

        if (os.equalsIgnoreCase("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.paint();
        checkbox.check();
    }

}
