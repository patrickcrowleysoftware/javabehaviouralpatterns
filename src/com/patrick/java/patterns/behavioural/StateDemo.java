package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.state.Context;
import com.patrick.java.patterns.behavioural.state.StartState;
import com.patrick.java.patterns.behavioural.state.StopState;

public class StateDemo {
	
	   public static void main(String[] args) {
	      Context context = new Context();

	      StartState startState = new StartState();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	   }
	}