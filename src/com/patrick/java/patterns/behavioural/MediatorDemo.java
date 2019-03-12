package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.mediator.User;

public class MediatorDemo {
	
	   public static void main(String[] args) {
		   
		      User robert = new User("Robert");
		      User john = new User("John");

		      robert.sendMessage("Hi! John!");
		      
		      john.sendMessage("Hello! Robert!");
		   }
		}