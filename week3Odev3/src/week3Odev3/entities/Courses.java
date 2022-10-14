package week3Odev3.entities;

import java.util.ArrayList;

public class Courses extends Products {
	ArrayList <Double> price = new ArrayList <Double>();
	private double priceAdd;

	public ArrayList<Double> getPrice() {
		return price;
	}
	public void db() {
		// veri tabaný gibi.
		name.add("java");
		name.add("ceylan");
		name.add("phyton");
		name.add("C++");
		name.add("C#");
		price.add(100.1);
		price.add(100.2);
		price.add(100.3);
		price.add(100.4);
		price.add(100.5);
		
	}

	public void setPrice(Double priceAdd) {
		this.priceAdd = priceAdd;
		price.add(priceAdd);
		
	}
	
	public double getPriceAdd() {
		
		return priceAdd ;
		
	}
	
	
	
}
