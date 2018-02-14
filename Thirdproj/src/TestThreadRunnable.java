import java.time.LocalDateTime;

/**
 * 
 */

/**
 * @author User
 *
 */
public class TestThreadRunnable implements Runnable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(
				"This is currently running on the main thread, " + "the id is: " + Thread.currentThread().getId());
		TestThreadRunnable worker = new TestThreadRunnable();
		Thread thread = new Thread(worker); //default main thread
		thread.start();
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);// thread are independent, parallel run
		t7.start();
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt + ":Main finished running...");
	}
	@Override
	public void run() {
		LocalDateTime ldt = LocalDateTime.now(); //magic word
		System.out.println(
				ldt + ": This is currently running on the separate thread, " + "the id is: " + Thread.currentThread().getId());

	}
}
