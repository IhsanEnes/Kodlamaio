package contructor;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product("Asus", 58, 600);
		System.out.println("Fiyat: " + product1.getPrice());
		
		Product product2 = new Product("Asus", 58);
		System.out.println("Fiyat: " + product2.getPrice());

	}

}
