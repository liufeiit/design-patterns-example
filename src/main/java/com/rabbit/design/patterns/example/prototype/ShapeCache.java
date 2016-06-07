package com.rabbit.design.patterns.example.prototype;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ShapeCache {

	private static ConcurrentMap<String, Shape> cache = new ConcurrentHashMap<>();

	public static Shape getShape(String shapeId) {
		Shape cachedShape = cache.get(shapeId);
		return (Shape) cachedShape.clone();
	}

	// for each shape run database query and create shape
	// shapeMap.put(shapeKey, shape);
	// for example, we are adding three shapes

	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId("1");
		cache.put(circle.getId(), circle);

		Square square = new Square();
		square.setId("2");
		cache.put(square.getId(), square);

		Rectangle rectangle = new Rectangle();
		rectangle.setId("3");
		cache.put(rectangle.getId(), rectangle);
	}

}
