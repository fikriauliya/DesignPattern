package com.levifikri.java.learn.designpattern.behavioral.visitor;

public class Monitor implements ComputerPart {
	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}
}