package interfaces;

public class CustomerManager {
	// i� kodlar� yaz�l�r
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
		
	}

}
