package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.template.Cricket;
import com.patrick.java.patterns.behavioural.template.Football;
import com.patrick.java.patterns.behavioural.template.Game;

public class TemplateDemo {
	
	   public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      
	      System.out.println();
	      
	      game = new Football();
	      game.play();		
	   }
	}