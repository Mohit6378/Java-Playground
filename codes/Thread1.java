class MyThread extends Thread {
	private String threadName;

	MyThread(String name) {	
		threadName = name;
	}
//overrride the run method to define the task for the thread.
	public void run() {
		for(int i = 0; i < 6; i++) {
			System.out.println(threadName + ": Count " + i);
			try {
			//sleep for a while to simulate some work
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(threadName + "interrupted");
			}
		}
		System.out.println(threadName + "finished");
	}
}

public class Thread1 {
	public static void main(String[] args) {
		MyThread thread1 = new MyThread("Thread 1");
		MyThread thread2 = new MyThread("Thread 2");
		MyThread thread3 = new MyThread("Thread 3");
//Start the threads
		thread1.start();
		thread2.start();
		thread3.start();
//wait for all threads to finish
		try {
			thread1.join();
			thread2.join();
			thread3.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("All threads finished.");
	}
}

		