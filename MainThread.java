package multithreading1;

public class MainThread implements Runnable {
	public static int count=0;
	public void run() {
		while(MainThread.count<=10) {
			try {
				System.out.println("My Thread "+ (++MainThread.count));
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println("Error occured" +e);
			}
		}
	}
	public static void main(String[] args) {
		MainThread king = new MainThread();
		Thread mythread = new Thread(king);
		mythread.start();
		while(MainThread.count<=10) {
			try {
				System.out.println("My Thread "+ (++MainThread.count));
				Thread.sleep(1000);
			} catch(Exception e) {
				System.out.println("Error occured" +e);
			}
		}
		System.out.println("Main Thread completed");
	}
	}


