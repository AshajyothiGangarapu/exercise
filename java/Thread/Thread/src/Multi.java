public class Multi implements Runnable {
	public void run() {
		System.out.println("hellb");
	}

	public static void main(String[] args) {
		Multi multi = new Multi();
		Thread t1 = new Thread(multi);
		Thread t2 = new Thread(multi);
		t1.start();
		t2.start();

	}
}