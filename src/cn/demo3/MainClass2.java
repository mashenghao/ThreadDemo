package cn.demo3;

public class MainClass2 extends Thread {

	public static void main(String[] args) throws Exception {
		MainClass2 t1 = new MainClass2();
		t1.start();
		System.out.println("主线程开启----------");
		Thread.sleep(3000);
		t1.interrupt();
		System.out.println("中断执行的线程" + t1.isInterrupted());
		Thread.sleep(3000);
		System.out.println("主线程  ----");
	}

	public void run() {

		boolean stop = false;
		while (!stop) {
			/**
			 * 当线程设置为中断状态时，如果该线程为可中断状态，则会
			 * 立即唤醒该线程，同时抛出一个InterruptedException
			 * 异常，则可以在异常哪儿终止程序，或者进行其他业务逻辑。
			 */
			try {
				System.out.println("sdsss-----" + Thread.currentThread().isInterrupted());
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			System.out.println("running-------");
		}
		System.out.println("线程中断生效------");
	}
}
