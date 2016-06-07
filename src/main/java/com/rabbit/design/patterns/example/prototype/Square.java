package com.rabbit.design.patterns.example.prototype;

public class Square extends Shape {

	public Square() {
		type = "Square";
	}

	@Override
	void draw() {
		System.out.println("draw Square");
	}

}
