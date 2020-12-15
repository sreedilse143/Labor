package javaAdvanced;

public class JavaThread extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaThread t = new JavaThread();
		t.start();
		//t.start();	Exception in thread "main" java.lang.IllegalThreadStateException
		System.out.println("Thread.start() gives java.lang.IllegalThreadStateException when run twice");
		
		t.run();
		t.run();
		
		System.out.println("Thread.run() doesnot give any Exception when run twice");

		t.function();

	}

	public void run() {
		System.out.println("Current thread name: " + Thread.currentThread().getName());
		System.out.println("run() method called");
	}

	void function() {
		for (StackTraceElement ste : Thread.currentThread().getStackTrace()) {
		    System.out.println(ste);
		}
		System.out.println(Thread.currentThread().getStackTrace()[2].getClassName());
	}

}
