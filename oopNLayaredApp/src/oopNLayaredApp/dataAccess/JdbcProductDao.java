package oopNLayaredApp.dataAccess;

import oopNLayaredApp.entities.Product;

//Dao: Data Access Object
public class JdbcProductDao implements ProductDao{
	public void add(Product product) { // Paketten paket çaðýrýrken o paket bu pakete import edilmeli. Çýkan uyarýdan eklenebiliyor. Burada yaptýk !!!
		//Sadece ve sadece db eriþim kodlarý buraya yazýlýr.../SQL bilmen gerek
		System.out.println("JDBS ile veri tabanýna eklendi. " + product.getName());
	}

}
