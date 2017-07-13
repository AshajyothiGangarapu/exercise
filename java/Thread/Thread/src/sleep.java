
public class sleep implements Runnable {
	public void run(){
		for (int i=0;i<5;i++){
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				System.out.println(e);
			}
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) {
		sleep m = new sleep();
		Thread t1 = new Thread(m); 
		Thread t2 = new Thread(m); 
		
		t1.start();
		t2.start();
		

	}

}
  