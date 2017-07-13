package Thread2_3;

public class TestClass {
	public TestClass() {
		Runnable runner = new MyRunnable("first");
		Thread t = new Thread(runner);
		t.setPriority(Thread.MIN_PRIORITY);
		t.start();
		MyRunnable runner1 = new MyRunnable("second");
		Thread t1 = new Thread(runner1);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();

	}
	public static void main(String[] args) {
		TestClass testclass = new TestClass();
	}
}
 