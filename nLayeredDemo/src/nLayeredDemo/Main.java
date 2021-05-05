package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		
		
		//ToDo: Spring IoC ile çözülecek.
		ProductService productService = new ProductManager(new AbcProductDao());
		Product product = new Product(1,2,"Elma",12,50);
		productService.add(product);
		
		//Eğer ki business katmanından geçemezse hata döner. geçerse dataAccess layerına geçen
		
	}

}