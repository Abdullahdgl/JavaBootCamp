package polymorphismDemo;

public class FileLogger extends BaseLogger{
	public void log(String Message) {
		System.out.println("Logged to file : " + Message);
		
	}

}
