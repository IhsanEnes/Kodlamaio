package oopNLayaredApp.bussiness;



import oopNLayaredApp.core.logging.Logger;
import oopNLayaredApp.dataAccess.JdbcProductDao;
import oopNLayaredApp.dataAccess.ProductDao;
import oopNLayaredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao; // uyar�dan eklemeleri unutma !!!!!
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { // superi sildik, bir s�r� logger gelebilir
		
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		//�� kurallar� yaz�l�yor.
		if(product.getUnitPrice() < 10) {
			throw new Exception("�r�n fiyat� 10'dan k���k olamaz...");
		}
		
		/*JdbcProductDao productDao = new JdbcProductDao(); // JdbcProductDao bunuda ekledik uyar�dan.
		productDao.add(product);*/
		
		//ProductDao productDao = new JdbcProductDao(); // JdbcProductDao bunuda ekledik uyar�dan.
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
			
		}
		
		}
		
	}

