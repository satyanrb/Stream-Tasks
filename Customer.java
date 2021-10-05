package stream;

public class Customer {

	private String firstName;
	private String lastName;
	private String phonNumber;
	private String city;
	private int accountBal;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhonNumber() {
		return phonNumber;
	}
	public void setPhonNumber(String phonNumber) {
		this.phonNumber = phonNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAccountBal() {
		return accountBal;
	}
	public void setAccountBal(int accountBal) {
		this.accountBal = accountBal;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", phonNumber=" + phonNumber + ", city="
				+ city + ", accountBal=" + accountBal + "]";
	}
	public Customer(String firstName, String lastName, String phonNumber, String city, int accountBal) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phonNumber = phonNumber;
		this.city = city;
		this.accountBal = accountBal;
	}
	
	
}
