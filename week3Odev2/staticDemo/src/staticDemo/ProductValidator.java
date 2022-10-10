package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static blok çalýþtý");
	}
	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý");
	}
	public static boolean isValid(Product product) { // static yazýlýnca newlemeye gerek kalmýyor ama constructor gibi yapýcý methodlar çalýþmaz new lemeden. Bunun için static {} kullanýyourz ve burasý static methodu çaðrýlýnca çalýþýyor.
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
