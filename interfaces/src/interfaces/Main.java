package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new SmsLogger(),new EmailLogger(),new FileLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer anil = new Customer(1,"Anıl","Ağhan");
		customerManager.add(anil);
		
	}

}
