package oopNLayaredApp.dataAccess;

import oopNLayaredApp.entities.Product;

public class HibernateProductDao implements ProductDao {
	public void add(Product product) { // Paketten paket �a��r�rken o paket bu pakete import edilmeli. ��kan uyar�dan eklenebiliyor. Burada yapt�k !!!
		//Sadece ve sadece db eri�im kodlar� buraya yaz�l�r.../SQL bilmen gerek
		System.out.println("Hibernate ile veri taban�na eklendi. ");
	}

}
