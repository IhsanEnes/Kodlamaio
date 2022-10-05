package oopNLayaredApp;



import oopNLayaredApp.bussiness.ProductManager;
import oopNLayaredApp.core.logging.FileLogger;
import oopNLayaredApp.core.logging.Logger;
import oopNLayaredApp.core.logging.MailLogger;
import oopNLayaredApp.dataAccess.JdbcProductDao;
import oopNLayaredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"IPhone Xr", 11); //Burada UI'dan deðerleri girmiþ gibi kabul et.
		Logger[] loggers = {new MailLogger(), new FileLogger()}; // diziye ne eklersen onu yazýyor, ayný anda olsun diye array þeklinde yaptýk
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);  // dikkattttt interfacelerde referans odaklý çalýþýr yani implement edilen hibernate ve Jdbc klasslarý kullanýlabilir
		productManager.add(product1);

	}

}
