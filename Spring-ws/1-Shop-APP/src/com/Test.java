package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrixImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item01", "Item02" };
		
		PriceMatrixImpl price=new PriceMatrixImpl(); // Dependency object
		
		//-----------------------------------------

		BillingImpl biller = new BillingImpl(); // Dependent object
		
		biller.setPrice(price); // Injecting Dependency (price) to the dependent (biller) is called DI
		
		double total = biller.getCartTotal(cart1);
		
		//------------------------------------------
		System.out.println("Cart1 Total is " + total);

		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total is " + total);

	}

}
