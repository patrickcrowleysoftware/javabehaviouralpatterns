package com.patrick.java.patterns.behavioural;

import com.patrick.java.patterns.behavioural.chainofresponsibility.AbstractLogger;
import com.patrick.java.patterns.behavioural.chainofresponsibility.ConsoleLogger;
import com.patrick.java.patterns.behavioural.chainofresponsibility.ErrorLogger;
import com.patrick.java.patterns.behavioural.chainofresponsibility.FileLogger;

public class ChainOfRespDemo {
	
	   private static AbstractLogger getChainOfLoggers(){

	      AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
	      AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
	      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

	      errorLogger.setNextLogger(fileLogger);
	      fileLogger.setNextLogger(consoleLogger);

	      return errorLogger;	
	   }

	   public static void main(String[] args) {
	      AbstractLogger loggerChain = getChainOfLoggers();

	      loggerChain.logMessage(AbstractLogger.INFO, 
	         "This is an information.");

	      loggerChain.logMessage(AbstractLogger.DEBUG, 
	         "This is an debug level information.");

	      loggerChain.logMessage(AbstractLogger.ERROR, 
	         "This is an error information.");
	   }
	}