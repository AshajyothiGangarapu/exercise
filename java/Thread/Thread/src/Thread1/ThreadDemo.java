package Thread1;

public class ThreadDemo implements Runnable {
	private String firstName;
	private String secondName;
	private int aWhile;

	public ThreadDemo(String firstName, String secondName, int delay) {
		this.firstName = firstName;
		this.secondName = secondName;
		aWhile = delay;
		
	}

	public void run() {

		try {

			while (true) {
				System.out.print(firstName);
				Thread.sleep(aWhile);
				System.out.print(secondName + "\n");

			}

		} catch (InterruptedException e) {
			System.out.println(firstName + secondName + e);
		}

	}

}
