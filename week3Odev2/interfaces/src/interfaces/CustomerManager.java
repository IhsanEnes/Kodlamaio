package interfaces;

public class CustomerManager {
	// iþ kodlarý yazýlýr
	private ICustomerDal customerDal;
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	public void add() {
		customerDal.add();
		
	}

}
