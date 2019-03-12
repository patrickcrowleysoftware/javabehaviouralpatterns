package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.observer.BinaryObserver;
import com.patrick.java.patterns.behavioural.observer.HexaObserver;
import com.patrick.java.patterns.behavioural.observer.OctalObserver;
import com.patrick.java.patterns.behavioural.observer.Subject;

public class ObserverDemo {
	   public static void main(String[] args) {
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");	
	      subject.setState(15);
	      System.out.println("Second state change: 10");	
	      subject.setState(10);
	   }
	}
