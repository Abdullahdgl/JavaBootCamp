package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("EKLENDİ.");
		}
		System.out.println("Ürün bilgileri geçersiz .");
	}

}
