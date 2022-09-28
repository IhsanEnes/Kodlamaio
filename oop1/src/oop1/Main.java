package oop1;

public class Main {

	public static void main(String[] args) {
		String message ="Ýndimli Ürünler";
		
		// product1 objesini Product class'ýnda tanýmladýk. Karþýsýndakilerde referanstýr.
		Product product1 = new Product();
		// class'ýmýzýn field'larýný set ettik.
		//Field'ler private olunca o class dýþýnda baþka classtan müdahale edemeyiz.
		
		/*product1.name = "Delonghi Kahve Makinesi";
		product1.imageUrl = "resim.jpg";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;*/
		
		
		// class'ýmýzýn field'larýný get ettik.
		//System.out.println(product1.name);

		product1.setName("Delonghi Kahve Makinesi");
		product1.setImageUrl("resim1.jpg");
		product1.setUnitPrice(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		
		Product product2 = new Product();
		product2.setName("Aid Kahve Makinesi");
		product2.setImageUrl("resim2.jpg");
		product2.setUnitPrice(8500);
		product2.setDiscount(8);
		product2.setUnitsInStock(4);
		
		Product[] products = {product1,product2};
		
		for(Product product:products) {
			System.out.println(product.getName());
			
		}
		
		
		
		System.out.println("--------------------------------");
		System.out.println("--------------------------------");
		System.out.println("Inheritance Dersi");
		
		//Inheritance, superclass
		
		//Customer superclass'ýndaki field'larý set ettik
		IndividualCustomer individualCustomer1 = new IndividualCustomer();
		individualCustomer1.setId(5858);
		individualCustomer1.setPhone("506");
		individualCustomer1.setCustomerNumber("06");
		
		//IndividualCustomer subclass'ýndaki field'larý set ettik
		individualCustomer1.setFirstName("Enes");
		individualCustomer1.setLastName("Ceylan");
		
		//Ýstediðin kadar subclass ekleyebilirsin
		
		
		System.out.println(individualCustomer1.getCustomerNumber() + " " + individualCustomer1.getFirstName());
		
		
		
		

	}

}
