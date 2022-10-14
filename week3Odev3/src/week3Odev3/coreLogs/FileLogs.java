package week3Odev3.coreLogs;

import week3Odev3.entities.Products;

public class FileLogs implements IBaseLogs {
	Products products;
	

	public FileLogs(Products products) {
		
		this.products = products;
	}

	@Override
	public void log() {
		System.out.println("Dosyaya loglandý: " + products.getNameAdd());
		
	}

	
		
	

}
