package staticDemo;

public class ProductManager {
	public void add(Product product) {
		//ProductValidator validator = new ProductValidator(); ProductValidator static oldu�u i�in gerek yok
		if(ProductValidator.isValid(product)) {
		System.out.println("Eklendi...");
		}
		else {
			System.out.println("Eklenemedi...");
		}
	}
	
	ProductValidator  productValidator = new ProductValidator(); // buras� yap�c� bloklar� yani constructor� �al��t�r�r.

}
