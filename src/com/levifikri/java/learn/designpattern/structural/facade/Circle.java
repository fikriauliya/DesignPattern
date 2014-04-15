package com.levifikri.java.learn.designpattern.structural.facade;

public class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}