package threads;

import java.util.Scanner;

public class threads {
      
	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		
	//	Runnable r = new Runnable() {
			
		//	@Override
		//	public void run() {
				
			//	System.out.println("Hello from " + Thread.currentThread().getName());
				
		//	}
	//	};
		
		Runnable r = () -> {
			System.out.println("Hello from " + Thread.currentThread().getName());
		};
		
		//MyTread t = new MyTread();
	    //t.start();
		
		Thread t2 = new Thread(r);
		t2.setName("Dö");
		System.out.println(t2.getState());
		t2.start();
		System.out.println(t2.getState());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
		System.out.println(t2.getState());
		
	}
	
}

class MyTread extends Thread{
	
	public void run(){
		while(true){
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			System.out.println("hej");
		}
	}
}
