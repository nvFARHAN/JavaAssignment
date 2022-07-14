package com.farhan.q1;

public class Main {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		ThreadA t1 = new ThreadA(a, b);
		ThreadB t2 = new ThreadB(a, b);

		t1.start();

		/*
		 * method 1_ we can use sleep method to suspend the main thread for some time in
		 * order to run t1 thread completely and then all the locks will be released.
		 */
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}

		/*
		 * method 2_ we can call the join method on t1 so that the main thread will wait
		 * for the t1 thread to complete and then t2 will start.
		 */
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		/*
		 * method 3_ we can use wait() and notify() method on the thread in order to
		 * prevent from the deadlock condition. for that we have to acquire the lock of
		 * object b in method funA to call notify() method so we have to use
		 * synchronized block Similarly we have to do the same in funB
		 */

		/*
		 * Make any of the functions in class A or B unsynchronized so that some lock
		 * will be available at any point in time.
		 */

		t2.start();
	}
}

/*
 * wait() method is used to suspend a synchronized tread unconditionally
 * notify() or notifyAll() methods are used to notify the waiting thread to move
 * to the runnable state. both these methods can be used inside a synchronized
 * method or a synchronized block only. eg. if we require an updated value which
 * is being updated by another thread, then we call wait on that method. Once
 * the update process is done, we can notify the thread to resume by calling
 * notify method.
 */