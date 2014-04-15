package com.levifikri.java.learn.designpattern.behavioral.visitor;

public class Keyboard implements ComputerPart {
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}