package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.visitor.Computer;
import com.patrick.java.patterns.behavioural.visitor.ComputerPart;
import com.patrick.java.patterns.behavioural.visitor.ComputerPartDisplayVisitor;

public class VisitorDemo {
	   public static void main(String[] args) {

	      ComputerPart computer = new Computer();
	      computer.accept(new ComputerPartDisplayVisitor());
	   }
	}
