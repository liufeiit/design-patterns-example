package com.rabbit.design.patterns.example.factory;

public class Main {
	
	public static void main(String[] args) {
		ShapeFactory f = new ShapeFactory();
		Circle c = (Circle) f.getShape("circle");
		c.draw();
		Square s = (Square) f.getShape("square");
		s.draw();
		Rectangle r = (Rectangle) f.getShape("rectangle");
		r.draw();
	}
	
}
