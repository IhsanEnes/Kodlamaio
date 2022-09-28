package oop1;

public class Main {

	public static void main(String[] args) {
		String message ="�ndimli �r�nler";
		
		// product1 objesini Product class'�nda tan�mlad�k. Kar��s�ndakilerde referanst�r.
		Product product1 = new Product();
		// class'�m�z�n field'lar�n� set ettik.
		//Field'ler private olunca o class d���nda ba�ka classtan m�dahale edemeyiz.
		
		/*product1.name = "Delonghi Kahve Makinesi";
		product1.imageUrl = "resim.jpg";
		product1.unitPrice = 7500;
		product1.discount = 7;
		product1.unitsInStock = 3;*/
		
		
		// class'�m�z�n field'lar�n� get ettik.
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
		
		//Customer superclass'�ndaki field'lar� set ettik
		IndividualCustomer individualCustomer1 = new IndividualCustomer();
		individualCustomer1.setId(5858);
		individualCustomer1.setPhone("506");
		individualCustomer1.setCustomerNumber("06");
		
		//IndividualCustomer subclass'�ndaki field'lar� set ettik
		individualCustomer1.setFirstName("Enes");
		individualCustomer1.setLastName("Ceylan");
		
		//�stedi�in kadar subclass ekleyebilirsin
		
		
		System.out.println(individualCustomer1.getCustomerNumber() + " " + individualCustomer1.getFirstName());
		
		
		
		

	}

}
