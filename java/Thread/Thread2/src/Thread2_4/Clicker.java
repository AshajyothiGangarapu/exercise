package Thread2_4;

public class Clicker implements Runnable{
	int click;
	Thread thread;
	private volatile boolean running = true;
	
	public Clicker(int p){
		thread= new Thread();
		thread.setPriority(p);
		
	}
	public void run() {

		while (running) {

		click++;//Increment the variable click.

		}

		}

		public void stop() {

		running = false;

		}

		public void start() {

		thread.start();
		
		
	}
	

}
