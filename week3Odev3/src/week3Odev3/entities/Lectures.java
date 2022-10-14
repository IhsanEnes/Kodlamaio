package week3Odev3.entities;

import java.util.ArrayList;

public class Lectures extends Products {
	ArrayList <String> id = new ArrayList <String>();

	public ArrayList<String> getId() {
		return id;
	}
	public void db() {
		// veri tabaný gibi.
		id.add("1919");
		id.add("1923");
		id.add("1920");
		id.add("2022");
		id.add("2023");
		
	}

	public void setId(String idAdd) {
		//name için veri tabaný gibi daha önce girilen verileri tutuyorum.
		
		id.add(idAdd);
	}
	
	
	
	
	
	
	

}
