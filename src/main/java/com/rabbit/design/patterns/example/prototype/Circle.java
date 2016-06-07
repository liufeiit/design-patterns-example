package com.rabbit.design.patterns.example.prototype;

public class Circle extends Shape {

	public Circle() {
		type = "Circle";
	}

	@Override
	void draw() {
		System.out.println("draw Circle");
	}

}
