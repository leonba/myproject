//:Grp.java

public class Grp implements Runnable {
	public void run() {
		for (;;) {
			System.out.println("thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
	}
	public static void main(String[] args) {
		ThreadGroup g = new ThreadGroup("My Group");
		Runnable r = new Grp();
		Thread t = new Thread(g, r);
		t.start();
		t = new Thread(g, r);
		t.start();
		for (;;) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			g.suspend();
			System.out.println("thread " + Thread.currentThread().getName());
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				// TODO: handle exception
			}
			g.resume();
		}
	}
}