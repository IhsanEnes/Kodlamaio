package week3Odev1;

public class Company extends Customer { // Bir class sadece bir class'ý inherit edebilir.
	private String taxNumber;

	public Company(int id, String firstName, String lastName, String city, String taxNumber) {
		super(id, firstName, lastName, city);
		this.taxNumber = taxNumber;
	}

	public String getTaxNumber() {
		return taxNumber;
	}

	public void setTaxNumber(String taxNumber) {
		this.taxNumber = taxNumber;
	}

}
