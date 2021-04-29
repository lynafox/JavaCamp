package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer anil = new IndividualCustomer();
		anil.customerNumber ="1416";
			
		
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber="1542155";
		
		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		CustomerManager customerManager = new CustomerManager();	
		
		Customer [] customers = {anil,hepsiBurada,abc};
		
		customerManager.addMultiple(customers);
				

	}

}
