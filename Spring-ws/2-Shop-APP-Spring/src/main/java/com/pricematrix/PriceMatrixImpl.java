package com.pricematrix;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println("--- PriceMatrixImpl class object created...");
	}

	public double getItemPrice(String itemCode) {
		// code to fetch price of a given itemCode from database
		return 100.00;

	}

}
