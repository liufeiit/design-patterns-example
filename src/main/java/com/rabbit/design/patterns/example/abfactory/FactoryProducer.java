package com.rabbit.design.patterns.example.abfactory;

public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}

		return null;
	}

}
