package com.rabbit.design.patterns.example.factory;

/**
 * 构建性模式
 * @author Ethan Finch
 */
public class ShapeFactory {
	
	public Shape getShape(String shapeType) {
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
