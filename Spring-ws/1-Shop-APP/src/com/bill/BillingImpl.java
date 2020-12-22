package com.bill;

import com.pricematrix.PriceMatrixImpl;

//Dependent
public class BillingImpl {
	
	/*
	 * Design Issues
	 * ---------------------------
	 * --> Too many dependency class objects.
	 * `    --> Perfomenace application goes down, memory issues
	 * 
	 * Why this issue happened?
	 * --------------------------
	 * --> Dependent class itself creating dependency class objects directly.
	 * 
	 * What is the solution?
	 * -----------------------
	 * --> Do not create dependency class objects in dependent class directly. 
	 *     instead, use techniques like JNDI look up
	 *     JNDI location is tightly coupled with dependent class.
	 *     
	 * 
	 * What is the best solution?
	 * ------------------------------
	 * -> do not create, or find, instead ask some one (container) to inject. This is called IoC
	 * 
	 * In how many ways IoC Can be handled?
	 * ----------------------------------------
	 * -> using dependency injection management (DI)
	 * 
	 * What is Dependency Injection?
	 * ---------------------------------
	 * -> Injecting dependency object to the dependent object is called DI
	 * 
	 * In how many ways DI can be implemented? : 2 ways
	 * -------------------------------------------------
	 * 
	 * way - 1: Using setter based DI
	 * way - 2: Using constructor based DI
	 * 
	 * 	 way - 1: Using setter based DI
	 * -------------------------------------
	 * 1. Defined Dependency object ref in the dependent class at class level.
	 * 2. Create setter for the ref created.
	 */
	
	private PriceMatrixImpl price; 
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}



	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl();
		

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
