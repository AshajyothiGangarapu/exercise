package Thread1;

import java.io.IOException;

public class ThreadDemoTest {
	public static void main(String[] args) {
		
       
		Thread first = new Thread(new ThreadDemo("A ", "a ", 200));
		Thread second = new Thread(new ThreadDemo("B ", "b ", 300));
		Thread third = new Thread(new ThreadDemo("C ", "c ", 500));

		System.out.println("Press Enter when you have had enough...\n");
		first.setDaemon(true);
		second.setDaemon(true);
		third.setDaemon(true);
		first.start();

		second.start();

		third.start();
		try {

			System.in.read();
			System.out.println("Enter pressed...\n");

		} catch (IOException e) {

			e.printStackTrace();

		}

	}
}
