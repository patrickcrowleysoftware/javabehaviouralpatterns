package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.command.Broker;
import com.patrick.java.patterns.behavioural.command.BuyStock;
import com.patrick.java.patterns.behavioural.command.SellStock;
import com.patrick.java.patterns.behavioural.command.Stock;

public class CommandDemo {
	
	   public static void main(String[] args) {
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Broker broker = new Broker();
	      
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	   }
	}