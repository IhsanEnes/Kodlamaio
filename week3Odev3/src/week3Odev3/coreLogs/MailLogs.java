package week3Odev3.coreLogs;

import week3Odev3.entities.Products;

public class MailLogs implements IBaseLogs {

Products products;
	

	public MailLogs(Products products) {
		
		this.products = products;
	}

	@Override
	public void log() {
		System.out.println("Mail loglandý: " + products.getNameAdd());
		
	}

	
}
