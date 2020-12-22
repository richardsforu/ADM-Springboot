package com.pricematrix;

//Dependency
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl class object created...");
	}
	
	/*
	 * Types of Objects in Java : 2 types
	 * -----------------------------------
	 * 1. Dependency class object : work independently. Never dependent on other objects
	 * 2. Dependent class object : always depends on dependency objects.
	 * 
	 */

	public double getItemPrice(String itemCode) {
		// code to fetch price of a given itemCode from database
		return 100.00;

	}

}
