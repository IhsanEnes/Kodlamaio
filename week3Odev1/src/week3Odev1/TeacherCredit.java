package week3Odev1;

public class TeacherCredit implements ICreditMAnager {  // Bir class birden fazla Interface'i implement edebilir.

	@Override
	public void calculate() {
		System.out.println("Öðretmen kredisi hesaplandý. ");
		
	}

	@Override
	public void save() {
		System.out.println("Öðretmen kredisi kaydedildi. ");
		
	}
	
	

}
