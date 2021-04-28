package inheritance2;

public class EmailLogger extends Logger { //override basedeki kodu ezmek için.
	@Override
	public void log() {
		System.out.println("Email Yollandı");
	}
}
