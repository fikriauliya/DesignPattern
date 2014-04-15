package com.levifikri.java.learn.designpattern.structural.facade;

public class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}