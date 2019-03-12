package com.patrick.java.patterns.behavioural.command;

public class BuyStock implements Order {
	
	   private Stock abcStock;

	   public BuyStock(Stock abcStock){
	      this.abcStock = abcStock;
	   }

	   public void execute() {
	      abcStock.buy();
	   }
	}
