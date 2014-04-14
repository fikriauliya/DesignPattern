package com.levifikri.java.learn.designpattern.creational.abstractfactory;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}