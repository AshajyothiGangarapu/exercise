package Thread2_3;

public class MyRunnable implements Runnable {
	String name;

	public MyRunnable(String name) {

		this.name = name;
	}

	public void run() {
		
			System.out.println(Thread.currentThread().getName()	);
		

	}

}
