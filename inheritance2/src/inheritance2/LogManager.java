package inheritance2;

public class LogManager {
	public void log(int logType) {
		if(logType == 1) {
			System.out.println("Veritabanında loglandı");
		}else if (logType == 2) {
			System.out.println("Dosyaya loglandı");
		}else {
			System.out.println("Email gönderildi");
		}
	}
}

//birbirinin alternatifi kodlar if le yönetilmez
//1-database
//2-file
//3-mail