package com.rabbit.design.patterns.example.singleton;

public class Singleton {
	
	private static Singleton singleton = new Singleton();
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void showMsg() {
		System.out.println("Hello World");
	}
	
}
