package oopNLayaredApp.bussiness;



import oopNLayaredApp.core.logging.Logger;
import oopNLayaredApp.dataAccess.JdbcProductDao;
import oopNLayaredApp.dataAccess.ProductDao;
import oopNLayaredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao; // uyarýdan eklemeleri unutma !!!!!
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { // superi sildik, bir sürü logger gelebilir
		
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//Ýþ kurallarý yazýlýyor.
		if(product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyatý 10'dan küçük olamaz...");
		}
		
		/*JdbcProductDao productDao = new JdbcProductDao(); // JdbcProductDao bunuda ekledik uyarýdan.
		productDao.add(product);*/
		
		//ProductDao productDao = new JdbcProductDao(); // JdbcProductDao bunuda ekledik uyarýdan.
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}
		
		}
		
	}

