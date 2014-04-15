package com.levifikri.java.learn.designpattern.behavioral.observer;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}