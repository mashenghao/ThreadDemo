package cn.demo1;

public class ThreadB extends Thread {

	public ThreadB(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
