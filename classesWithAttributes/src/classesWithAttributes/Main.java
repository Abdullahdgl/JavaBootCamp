package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Leptop");
		product.setId(1);
		product.setDescription("Asus Leptop");
		product.setPrice(500);
		product.setStockAmount(3);
		
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.getKod());
	
	}

}
