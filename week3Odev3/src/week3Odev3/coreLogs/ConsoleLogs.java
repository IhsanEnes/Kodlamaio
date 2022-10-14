package week3Odev3.coreLogs;

import week3Odev3.entities.Products;

public class ConsoleLogs implements IBaseLogs {

Products products;
	

	public ConsoleLogs(Products products) {
		
		this.products = products;
	}


	@Override
	public void log() {
		System.out.println("Konsol loglandý: " + products.getNameAdd());
		
	}


	

	

}
