package com.rabbit.design.patterns.example.abfactory;

import com.rabbit.design.patterns.example.factory.Shape;

public abstract class AbstractFactory {
	
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
	
}
