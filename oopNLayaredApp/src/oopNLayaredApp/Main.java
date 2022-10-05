package oopNLayaredApp;



import oopNLayaredApp.bussiness.ProductManager;
import oopNLayaredApp.core.logging.FileLogger;
import oopNLayaredApp.core.logging.Logger;
import oopNLayaredApp.core.logging.MailLogger;
import oopNLayaredApp.dataAccess.JdbcProductDao;
import oopNLayaredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1,"IPhone Xr", 11); //Burada UI'dan de�erleri girmi� gibi kabul et.
		Logger[] loggers = {new MailLogger(), new FileLogger()}; // diziye ne eklersen onu yaz�yor, ayn� anda olsun diye array �eklinde yapt�k
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);  // dikkattttt interfacelerde referans odakl� �al���r yani implement edilen hibernate ve Jdbc klasslar� kullan�labilir
		productManager.add(product1);

	}

}
