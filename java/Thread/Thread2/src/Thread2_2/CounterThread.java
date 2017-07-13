package Thread2_2;

public class CounterThread extends Thread {
	String name;

	public CounterThread(String name) {

		this.name = name;
	}

	public void run() {

		int count = 0;

		while (true) {

			try {

				sleep(100);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			count++;
			if (count == 50) {
				count = 0;
				
			}
			System.out.println("the name of thread is "
					+ Thread.currentThread().getName() + "count is"+ count);

		}

	}
}
