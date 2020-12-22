package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bill.BillingImpl;
import com.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		String[] cart1 = { "Item01", "Item02", "Item03" };
		String[] cart2 = { "Item01", "Item02" };
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		//PriceMatrixImpl price=new PriceMatrixImpl(); // Dependency object
		
		//-----------------------------------------

		//BillingImpl biller = new BillingImpl(); // Dependent object
		
		//biller.setPrice(price); // Injecting Dependency (price) to the dependent (biller) is called DI
		
		BillingImpl biller=ac.getBean(BillingImpl.class);
		
		double total = biller.getCartTotal(cart1);
		
		//------------------------------------------
		System.out.println("Cart1 Total is " + total);

		total = biller.getCartTotal(cart2);
		
		System.out.println("Cart2 Total is " + total);


	}

}
