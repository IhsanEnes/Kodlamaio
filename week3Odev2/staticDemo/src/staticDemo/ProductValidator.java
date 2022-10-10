package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static blok �al��t�");
	}
	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�");
	}
	public static boolean isValid(Product product) { // static yaz�l�nca newlemeye gerek kalm�yor ama constructor gibi yap�c� methodlar �al��maz new lemeden. Bunun i�in static {} kullan�yourz ve buras� static methodu �a�r�l�nca �al���yor.
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}

}
