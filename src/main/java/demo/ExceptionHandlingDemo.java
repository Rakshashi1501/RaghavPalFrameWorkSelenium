package demo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		
		
		try {

		System.out.println("Hello World");
		
		int i = 1/0;

		System.out.println("Completed");

	}
		
		catch(Exception e) {
			System.out.println("Inside catch block");
			System.out.println("Message is :" + e.getMessage());
			System.out.println("cause is :" + e.getCause());
			e.printStackTrace();
		}
		
		finally {
			System.out.println(" I am inside Finally block ");
		}
	}

}
