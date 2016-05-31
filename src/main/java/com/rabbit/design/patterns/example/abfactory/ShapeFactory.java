package com.rabbit.design.patterns.example.abfactory;

import com.rabbit.design.patterns.example.factory.Circle;
import com.rabbit.design.patterns.example.factory.Rectangle;
import com.rabbit.design.patterns.example.factory.Shape;
import com.rabbit.design.patterns.example.factory.Square;

public class ShapeFactory extends AbstractFactory {

	@Override
	Color getColor(String color) {
		return null;
	}

	@Override
	Shape getShape(String shapeType) {
		if ("circle".equals(shapeType)) {
			return new Circle();
		} else if ("rectangle".equals(shapeType)) {
			return new Rectangle();
		} else if ("square".equals(shapeType)) {
			return new Square();
		}
		
		return null;
	}

}
