package com.teja;

import java.util.logging.Level; 
import java.util.logging.Logger; 

public class Main {
	public static void main(String args[]) {
		Customer customer = new Customer(1000,2,4);
		Logger logger =  Logger.getLogger(Logger.GLOBAL_LOGGER_NAME); 
		logger.log(Level.INFO, "Simple Interest: " + customer.simpleInterest()  ); 
		logger.log(Level.INFO, "Compound Interest: " + customer.compoundInterest()); 
	}

}
