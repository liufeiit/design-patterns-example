package com.rabbit.design.patterns.example.abfactory;

import com.rabbit.design.patterns.example.factory.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		if ("red".equals(color)) {
			return new Red();
		} else if ("blue".equals(color)) {
			return new Blue();
		} else if ("green".equals(color)) {
			return new Green();
		}
		
		return null;
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}

}
