package com.levifikri.java.learn.designpattern.behavioral.visitor;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}