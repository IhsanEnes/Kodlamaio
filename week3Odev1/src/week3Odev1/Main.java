package week3Odev1;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(58, "Enes", "Ceylan", "Ankara");
		Customer customer2 = new Customer(59, "Ýhsan", "Ceylan", "Ankara");
		Customer[] customers = { customer1, customer2 };
		//Person person1 = new Person(60, "Melo", "Ceylan", "Sivas", "12345");
		for (Customer customerArray : customers) {
			CustomerManager customerManager1 = new CustomerManager(customerArray,new TeacherCredit());
			customerManager1.save();
			customerManager1.delete();

		}
		//Sürekli if kullanýp spagatthi kod yazmak yerine inheritance ve interface kullanýmý ile daha düzgün ve idame ettirilebilir kod yazarýz.
		//Sürekli new kullanmak yerine method beslerken IoC Container kullanarak dependency injection'dan fayadalanabiliriz. ARASTIR.
		CustomerManager customerManager2 = new CustomerManager(new Person(60, "Melo", "Ceylan", "Sivas", "12345"),new TeacherCredit()); // Customer veya inheritancelardan biri verilebilir. Veya interface verilebilir.
		customerManager2.giveCredit();

	}

}
