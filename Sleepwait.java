package multithreading1;

public class Sleepwait {
	private static Object LOCK = new Object();

	public static void main(String[] args) {
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName() + " is woke up after"
					+ "1 second of sleep");
			synchronized (LOCK) {
				LOCK.wait(2000);
				System.out.println("object is woke up after wait of 2 seconds");
			}
		} catch (InterruptedException e) {
			System.out.println("Error occured" +e);
		}

	}

}
