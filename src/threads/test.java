package threads;


public class test {
	
	public static void main(String[] args) {
		
		Runnable r = () -> {
			for(int i = 0; i < 5; i++){
				   System.out.print(Counter.count());
			}
		};
		
		for(int i = 0; i < 10; i++){
			new Thread(r).start();
		}
	}

}


/*Fråga 3 - Det blev att det blir högre tal än att loppa till 5*/