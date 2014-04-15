package com.levifikri.java.learn.designpattern.structural.facade;

public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}