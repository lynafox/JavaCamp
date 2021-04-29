package intro;

public class Main {

	public static void main(String[] args) {

		String internetSubeButonu = "İnternet Şubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.21;
		int vade = 36;
		boolean dustuMu = false;

		System.out.println(internetSubeButonu);

		if (dolarBugun < dolarDun) {

			System.out.println("Dolar Düştü Resmi");

		} else if (dolarBugun > dolarDun) {
			System.out.println("Dolar Yükseldi Resmi");
		}

		else {
			System.out.println("Dolar Eşit Resmi");
		}

		String[] krediler = { "Hızlı Kredi", "Mutlu emekeli kredisi", "Konut kredisi", "çiftçi kredisi", "msb kredisi",
				"meb kredisi", "Kültür Bakanlığı kredisi" };

		for (String kredi : krediler) {
			System.out.println(kredi);
		}

		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		//Değer tip direkt olarak bir değer yazılır ve bağı kopar
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		//Referans tip bir yeri referans olarak gösterir. O referansta olan değişkenlerden direkt etkilenir
		int[] sayilar1 = { 1, 2, 3, 4, 5 };
		int[] sayilar2 = { 10, 20, 30, 40, 50 };
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);

		//Stringler arkaplanda Char array tutulur fakat primitive olduğu için 5nci dillerde değermiş gibi tutulur.
		String sehir1 = "Ankara";
		String sehir2 = "İstanbul";
		sehir1 = sehir2;
		sehir2 = "izmir";
		System.out.println(sehir1);
		
	
	}
}
