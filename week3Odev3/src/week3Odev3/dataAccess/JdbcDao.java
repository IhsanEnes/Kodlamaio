package week3Odev3.dataAccess;

import week3Odev3.entities.Products;

public class JdbcDao implements IProductDao {
Products products;
	

	public JdbcDao(Products products) {
		
		this.products = products;
	}


	@Override
	public void add() {
		System.out.println(products.getNameAdd() + ", JDBC ile eklendi.");
		
	}


	@Override
	public void delete() {
		System.out.println(products.getNameAdd() + ", JDBC ile silindi.");
		
	}


	@Override
	public void uptade() {
		System.out.println(products.getNameAdd() + ", JDBC ile güncelendi.");
		
	}


	

}
