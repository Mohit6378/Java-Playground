//SecondThread class implements the interface Runnable.
class SecondThread implements Runnable {
	public void run() {
//try catch block
		try {
//moving thread t2 to the state timed-waiting
			Thread.sleep(100);
		} catch (InterruptedException ie) {
		ie.printStackTrace();
		}
		System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -" + Thread2.t1.getState());
//try-catch block
		try {
		Thread.sleep(200);
		} catch (InterruptedException ie) {
		ie.printStackTrace();
		}
	}
}

public class Thread2 implements Runnable {
	public static Thread t1;
	public static Thread2 obj;
//Main method
	public static void main(String[] args) {
//creating an object of the class Thread.State
		obj = new Thread2();
		t1 = new Thread(obj);
//Thread t1 is spawned currently in NEW state
		System.out.println("The state of thread t1 after spawning it: " + t1.getState());
//invoking the start() method on t1
		t1.start();
//t1 is now in RUNNABLE state
		System.out.println("The state of t1 after start() method: " + t1.getState());
	}

	public void run() {
		SecondThread myObj = new SecondThread();
		Thread t2 = new Thread(myObj);
//thread t2 is created and is currently in the NEW state
		System.out.println("t2 state after Spawning: " + t2.getState());
		t2.start();
// t2 moved to runnable state
		System.out.println("t2 state after start(): " + t2.getState());
//try-catch block
		try {
//moving t1 to timed-waiting state
			Thread.sleep(200);
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("t2 state after invoking sleep() on it: " + t2.getState());
//try-catch block
		try {
//waiting for t2 to complete its execution
			t2.join();
		} catch (InterruptedException ie) {
			ie.printStackTrace();
		}
		System.out.println("The state of t2 after completing its execution: " + t2.getState());
	}
}