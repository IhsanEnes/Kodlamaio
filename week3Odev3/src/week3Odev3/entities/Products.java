package week3Odev3.entities;

import java.util.ArrayList;

public class Products {
	ArrayList<String> name = new ArrayList<String>();
	private String nameAdd;

	public void db() {
		// overriding için
	}

	public void setPrice(Double priceAdd) {

		// overriding için
	}

	public double getPriceAdd() {

		return 0.1;
		// overriding için
	}

	public void setNameAdd(String nameAdd) {
		this.nameAdd = nameAdd;
	}

	public String getNameAdd() {

		return nameAdd;

	}

	public ArrayList<String> getName() {

		return name;

	}

	public void setName(String nameAdd) {

	}

}
