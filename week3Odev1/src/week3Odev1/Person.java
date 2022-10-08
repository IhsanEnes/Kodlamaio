package week3Odev1;

public class Person extends Customer {
	private String nationalIdentity;

	public Person(int id, String firstName, String lastName, String city, String nationalIdentity) {
		super(id, firstName, lastName, city);
		this.nationalIdentity = nationalIdentity;

	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

}
