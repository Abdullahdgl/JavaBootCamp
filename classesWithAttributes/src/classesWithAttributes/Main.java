package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Leptop","Asus Leptop", 3000,2,"Siyah");//parametreli constrator
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());
	
	}

}
