package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
		
		//25 sayısının asal olup olmadığını bulmak.
		int number = -2;
		int remainder = number % 2 ; //remainder kalandır. bir ve kendinden başka sayıyı bölene denir.
		 //System.out.println(remainder);
		 boolean isPrime = true;
		 
		 if(number==1) {
		
			 System.out.println("sayı asal değildir.");
			 return;
		 }
		 
		
		 if(number<1) {
			 System.out.println("geçersiz bir sayıdır.");
		 }
		 for(int i = 2; i <number; i++)
		 {
			 if(number % i ==0)
			 { 
				 isPrime=false;
				 
			 }
		 }
		 if(isPrime) {
			 System.out.println("asal sayıdır.");
		 }
		 
		 else {
			 System.out.println("sayı asal değildir.");
		 }
		 

	}

}
