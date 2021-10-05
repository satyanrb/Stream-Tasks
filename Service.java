package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Service {
	
	public static List<Customer>	listCustomers = Arrays.asList(
			new Customer("Satya", "Narayana", "917382450148", "Hyderabad", 20000),
			new Customer("Ravi", "Kalluri", "91737292010", "Chennai", 40000),
			new Customer("Ashok", "Kalluri", "163782984", "USA", 80000),
			new Customer("Raja", "Mohan", "9170383749", "Bangalore", 80000),
			new Customer("Ramu", "Mohan", "9179393468", "Hyderabad", 40000),
			new Customer("Shubha", "G", "9144650148", "Hyderabad", 28000));

//	public static List<Customer> getTheCustomerInHyderabadWithAcctbalMoreThan2000() {
//		return Database.getAllCustomers()
//		.stream()
//		.filter(t -> t.getCity().equalsIgnoreCase("Hyderabad") && t.getAccountBal()> 20000)
//		.collect(Collectors.toList());
//	}
	
	public static List<String> listPhoneNumbers(String inputCityName, int inputAccountBalance){
		List<String> result = listCustomers.stream()
				.filter(t -> t.getCity().equalsIgnoreCase(inputCityName) && t.getAccountBal() > inputAccountBalance)
				.map(Customer::getPhonNumber)
				.collect(Collectors.toList());
	    return result;
	}
	public static void main(String[] args) {
		//System.out.println(getTheCustomerInHyderabadWithAcctbalMoreThan2000());
		System.out.println(listPhoneNumbers("Hyderabad", 2000));
	}
}
