package oop1;

public class Main {

	public static void main(String[] args) {
		// oop nesne yönelimli programlama anlamına nesne güdümlü programlama
		// ne işe yarıyor peki?
		/*
		 * fonsyonel bir yapıya sahiptir.
		 * 
		 */

		String mesaj = "Vade Oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("image1.jpg");
		

		Product product2 = new Product();
		product2.setName("Smeg Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("image2.jpg");
	

		Product product3 = new Product();
		product3.setName("Kitchen Kahve Makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("image3.jpg");

		
	Product[] products = {product1,product2,product3};
	
	System.out.println("<ul>");
	for (Product product : products) {
		System.out.println("<li>" + product.getName() + "</li>");
	}
	
	System.out.println("</ul>");
	
	IndividualCustomer individualCustomer = new IndividualCustomer();
	individualCustomer.setId(1);
	individualCustomer.setPhone("05442130823");
	individualCustomer.setCustomerNumber("12345");
	individualCustomer.setFirstName("Abdullah");
	individualCustomer.setLastName("Dağlı");
	
	CorporateCustomer corporateCustomer = new CorporateCustomer();
	corporateCustomer.setId(2);
	corporateCustomer.setCompanyName("kodlama.io");
	corporateCustomer.setPhone("05333333333");
	corporateCustomer.setTaxNumber("1111111111");
	corporateCustomer.setCustomerNumber("54321");
	
	Customer[] customers ={individualCustomer,corporateCustomer};
	
	
	

	}

}
