package threads;

import java.util.Scanner;

public class threads {

	public static void main(String[] args) {

		System.out.println("1 " + Thread.currentThread().getName());

		Runnable r = () -> {
			System.out.println("2 " + Thread.currentThread().getName());
		};

		Thread t = new Thread(r);
		t.start();

		int i = 0;
		while (true) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
			i++;
			System.out.println("hej");
			if (i > 10000000) {
				break;
			}
		}

	}

}
