package multithreading1;

public class Threaddemo1 extends Thread {

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
		Threaddemo1 t1 = new Threaddemo1();
        Threaddemo1 t2 = new Threaddemo1();
        t1.setName("vikas");
        t2.setName("Gopi");
        t1.start();
        t2.start();

	}

}
