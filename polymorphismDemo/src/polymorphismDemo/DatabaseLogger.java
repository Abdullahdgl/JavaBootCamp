package polymorphismDemo;

public class DatabaseLogger extends BaseLogger{
	public void log(String Message) {
		System.out.println("Logged to database : " + Message);
		
	}

}
