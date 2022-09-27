package contructor;

public class Product {
	private String name;
	private int id;
	private float price;
	
	//overloading constructors
	public Product(String name, int id, float price) {
		this.id = id;
		this.name = name;
		this.price = price;
		
	}
	
	public Product(String name, int id) {
		this.id = id;
		this.name = name;
		this.price = id*2;
		
	}
	
	public float getPrice() {
		return price;
	}

}
