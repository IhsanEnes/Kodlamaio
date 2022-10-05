package oopNLayaredApp.dataAccess;

import oopNLayaredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) { // Paketten paket çaðýrýrken o paket bu pakete import edilmeli. Çýkan uyarýdan eklenebiliyor. Burada yaptýk !!!
		//Sadece ve sadece db eriþim kodlarý buraya yazýlýr.../SQL bilmen gerek
		System.out.println("Hibernate ile veri tabanýna eklendi. ");
	}

}
