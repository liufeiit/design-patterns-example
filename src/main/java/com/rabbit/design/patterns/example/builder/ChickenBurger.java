package com.rabbit.design.patterns.example.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Veg Burger";
	}

	@Override
	public float price() {
		return 25.7f;
	}

}
