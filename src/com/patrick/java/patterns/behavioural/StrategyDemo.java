package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.strategy.Context;
import com.patrick.java.patterns.behavioural.strategy.OperationAdd;
import com.patrick.java.patterns.behavioural.strategy.OperationMultiply;
import com.patrick.java.patterns.behavioural.strategy.OperationSubtract;

public class StrategyDemo {
	   public static void main(String[] args) {
	      Context context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSubtract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	   }
	}
