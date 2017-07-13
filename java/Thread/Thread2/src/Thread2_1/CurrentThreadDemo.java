package Thread2_1;

public class CurrentThreadDemo extends Thread {
	public static void main(String[] args) {
		Thread thread1 = currentThread();
		System.out.println("the current thread name is    "
				+ Thread.currentThread());
		thread1.setName("changednamethread");
		System.out.println("the thread name after changing name is    "
				+ Thread.currentThread());
		for (int n = 5; n > 0; n--) {
			System.out.println(n);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

}
