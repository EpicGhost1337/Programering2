package threads;


 public class Counter {
	 
 	private static int counter = 0;
 	
 	public static synchronized int count() {
		counter++;
		System.out.println(counter);
		
		return counter;
	}
 }