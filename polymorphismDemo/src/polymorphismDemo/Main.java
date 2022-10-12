package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//Çok biçimlilik demektir. birbirlerinin referansını aralarında inheritanse varsa yerini tutar
		/*
		  BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new
		  EmailLogger(),new DatabaseLogger(), new ConsoleLogger()}; for(BaseLogger
		  logger:loggers) { logger.Log("Log mesajı");
		   }
		 
		 */
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
