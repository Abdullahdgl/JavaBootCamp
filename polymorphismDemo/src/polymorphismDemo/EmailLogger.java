package polymorphismDemo;

public class EmailLogger extends BaseLogger{
	public void log(String Message) {
		System.out.println("Logged to Email : " + Message);
		
	}

}
