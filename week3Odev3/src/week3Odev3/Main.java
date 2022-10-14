package week3Odev3;

import java.util.ArrayList;

import week3Odev3.coreLogs.FileLogs;
import week3Odev3.coreLogs.IBaseLogs;
import week3Odev3.dataAccess.IProductDao;
import week3Odev3.dataAccess.JdbcDao;
import week3Odev3.entities.Categories;
import week3Odev3.entities.Courses;
import week3Odev3.entities.Products;

public class Main {

	public static void main(String[] args) {
		Products products = new Courses();
		//Products products = new Categories();
		
		
		

		products.setNameAdd("java");
		products.setPrice(100.1);
		
		// tekrar class new lenirse fieldlar null geliyor. heap ucuyor galiba

		IBaseLogs iBaselog = new FileLogs(products);
		IProductDao iProductDao = new JdbcDao(products);
		week3Odev3.proccess.Process process = new week3Odev3.proccess.Process(products, iBaselog, iProductDao);
		process.stateOfCourse();



	}

}
