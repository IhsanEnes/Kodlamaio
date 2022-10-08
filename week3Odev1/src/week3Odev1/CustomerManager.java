package week3Odev1;

public class CustomerManager {
	private Customer customer;
	private ICreditMAnager iCreditManager;
	
	public CustomerManager(Customer customer,ICreditMAnager iCreditManager) {
		this.customer = customer;
		this.iCreditManager = iCreditManager;
	}

	public void save() {
		System.out.println("Müþteri kaydedildi. " + customer.getFirstName());
	}
	public void delete() {
		System.out.println("Müþteri kaydedildi. " + customer.getFirstName());
	}
	public void giveCredit() {
		iCreditManager.calculate();
		System.out.println("Kredi verildi. ");
	}
	
	

}
