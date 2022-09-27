package classesWithField;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		/*product.id = 5858;
		product.name = "Asus";
		product.description = "Laptop";
		product.price = 232;*/
		
		product.setId(58);
		product.setName("Asus");
		product.setDescription("Laptop");
		product.setPrice(5858);
		
		System.out.println("Ürün kodu: " + product.getKod());
		
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);

	}

}
