package com.patrick.java.patterns.behavioural.visitor;

public interface ComputerPart {
	   public void accept(ComputerPartVisitor computerPartVisitor);
	}
