package com.rabbit.design.patterns.example.prototype;

public class Rectangle extends Shape {

	public Rectangle() {
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}

}
