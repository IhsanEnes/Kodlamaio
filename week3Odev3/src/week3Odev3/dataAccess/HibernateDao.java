package week3Odev3.dataAccess;

import week3Odev3.entities.Products;

public class HibernateDao implements IProductDao {
Products products;
	

	public HibernateDao(Products products) {
		
		this.products = products;
	}


	@Override
	public void add() {
		System.out.println(products.getNameAdd() + ", Hibernate ile eklendi.");
		
	}


	@Override
	public void delete() {
		System.out.println(products.getNameAdd() + ", Hibernate ile silindi.");
		
	}


	@Override
	public void uptade() {
		System.out.println(products.getNameAdd() + ", Hibernate ile güncellendi.");
		
	}

	

}
