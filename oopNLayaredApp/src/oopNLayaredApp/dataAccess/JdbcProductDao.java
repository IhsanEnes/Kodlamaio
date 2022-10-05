package oopNLayaredApp.dataAccess;

import oopNLayaredApp.entities.Product;

//Dao: Data Access Object
public class JdbcProductDao implements ProductDao{
	public void add(Product product) { // Paketten paket �a��r�rken o paket bu pakete import edilmeli. ��kan uyar�dan eklenebiliyor. Burada yapt�k !!!
		//Sadece ve sadece db eri�im kodlar� buraya yaz�l�r.../SQL bilmen gerek
		System.out.println("JDBS ile veri taban�na eklendi. " + product.getName());
	}

}
