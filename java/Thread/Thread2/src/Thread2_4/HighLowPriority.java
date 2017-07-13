package Thread2_4;

public class HighLowPriority {
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Clicker high = new Clicker(5);
		high.thread.setPriority(Thread.NORM_PRIORITY + 2);
		Clicker low = new Clicker(5);
		low.thread.setPriority(Thread.NORM_PRIORITY - 2);
		high.start();
		low.start();
		try {
			Thread.currentThread().sleep(100);
		} catch (InterruptedException e) {

			System.err.println("main thread interrupted");
		}
		high.stop();
		low.stop();
		try {
			high.thread.join();

			low.thread.join();

		} catch (InterruptedException e) {

			System.out.println("InterruptedException caught");

		}

		System.out.println("Low-priority thread:" + low.click);

		System.out.println("High-priority thread:" + high.click);
	}

}
