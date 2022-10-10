package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator(); ProductValidator static olduðu için gerek yok
		if(ProductValidator.isValid(product)) {
		System.out.println("Eklendi...");
		}
		else {
			System.out.println("Eklenemedi...");
		}
	}
	
	ProductValidator  productValidator = new ProductValidator(); // burasý yapýcý bloklarý yani constructorý çalýþtýrýr.

}
