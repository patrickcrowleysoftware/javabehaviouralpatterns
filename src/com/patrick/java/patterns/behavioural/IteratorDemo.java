package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.iterator.Iterator;
import com.patrick.java.patterns.behavioural.iterator.NameRepository;

public class IteratorDemo {
	
	   public static void main(String[] args) {
	      NameRepository namesRepository = new NameRepository();

	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();) {
	    	  
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 	
	   }
	}
