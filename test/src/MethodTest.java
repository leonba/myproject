//:MethodTest.java

public class MethodTest {
	public static void main(String[] args) {
		FirstThread first = new FirstThread();
		SecondThread second = new SecondThread();
		first.start();
		second.start();
		try {
			System.out.println("Waiting for first thread to finish.");
			first.join();
			System.out.println("It's a long wait!");
			System.out.println("Waking up second thread...");
			second.resume();
			System.out.println("Waiting for second thread to finish.");
			second.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("I'm already finished too.");
	}
}

class FirstThread extends Thread {
	public void run() {
		try {
			System.out.println("First thread starts running");
			sleep(10000);
			System.out.println("First thread finishes running");
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
	}
}

class SecondThread extends Thread {
	public void run() {
		System.out.println("Second thread starts running");
		System.out.println("Second thread suspend itself");
		suspend();
		System.out.println("Second thread runs again and finishes running");
	}
}