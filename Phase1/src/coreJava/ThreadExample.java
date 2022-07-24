package coreJava;

public class ThreadExample extends Thread{
	public void run(){
		System.out.println("Active thread name = "+Thread.currentThread().getName());
		System.out.println("Active thread priority= "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		ThreadExample th=new ThreadExample();
		ThreadExample th1=new ThreadExample();
		th.setPriority(MAX_PRIORITY);
		th1.setPriority(MIN_PRIORITY);
		th.start();
		th1.start();
		

	}

}
