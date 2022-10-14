package week3Odev3.proccess;

import week3Odev3.coreLogs.IBaseLogs;
import week3Odev3.dataAccess.IProductDao;
import week3Odev3.entities.Products;

public class Process {
	/*private boolean stateOfCourse;
	private boolean stateOfCategory;
	private boolean stateOfPrice;*/
	Products products;
	IBaseLogs iBaseLogs;
	IProductDao iProductDao;
	public Process(Products products,IBaseLogs iBaseLogs,IProductDao iProductDao) {
		this.products = products;
		this.iBaseLogs = iBaseLogs;
		this.iProductDao = iProductDao;
	}
	

	
	public void stateOfCourse() {
		products.db();
		
		if(products.getPriceAdd() == 0) {
			System.out.println("Kurs fiyatý 0 olamaz.");
		}
		else if(products.getName().contains(products.getNameAdd())){
			System.out.println("Kurs ismi mevcut, ekleme yapýlamaz");
		}
		else {
			products.setName(products.getNameAdd());
			iProductDao.add();
			iBaseLogs.log();
		}
	}

}
