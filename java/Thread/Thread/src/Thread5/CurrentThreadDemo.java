package Thread5;

public class CurrentThreadDemo extends Thread {
	public void run() {

		for (int i = 0; i < 5; i++) {
			printMyName();

		}
	}
	

	private void printMyName() {
		System.out.println("the thread name is    "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		CurrentThreadDemo ttsn = new CurrentThreadDemo();
		ttsn.setName("Created one");
		ttsn.start();
		Thread t2 = currentThread();
		t2.setName("main one");

		for (int i = 0; i < 5; i++) {
			ttsn.printMyName();

		}
	}
		
	}

