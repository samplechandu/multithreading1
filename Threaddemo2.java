package multithreading1;

public class Threaddemo2 implements Runnable {

		public void run()
	    {
	        for(int i=1;i<=5;i++)
	        {
	            System.out.println(i+ " "+Thread.currentThread().getName());
	            
	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	                e.printStackTrace(); }
	        }
	    }

		public static void main(String[] args) {
			Threaddemo1 c1 = new Threaddemo1();
	        Threaddemo1 c2 = new Threaddemo1();
	        c1.setName("vikas");
	        c2.setName("Gopi");
	        c1.start();
	        c2.start();

		}

	}


