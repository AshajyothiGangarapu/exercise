package Thread4;

public class TestCase {
	public static void main(String[] args) throws Exception{
		MyThread mt = new MyThread("asha");
		Thread.sleep(10000);
		mt.suspend();
		Thread.sleep(10000);
		mt.resume();
		Thread.sleep(10000);
		mt.resume();
		Thread.sleep(10000);
		mt.stop();
		
		
	}

}
