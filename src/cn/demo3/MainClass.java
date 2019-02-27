package cn.demo3;

/**
 * 线程中断机制
 *
 * @author mahao
 * @date: 2018年11月5日 下午6:21:19
 */
public class MainClass extends Thread {

	public static void main(String[] args) throws Exception {
		MainClass t1 = new MainClass();
		t1.start();
		System.out.println("主线程开启----------");
		Thread.sleep(3000);
		t1.interrupt();
		System.out.println("中断执行的线程" + t1.isInterrupted());
		Thread.sleep(1000);
		System.out.println("jieushi *----");
	}

	@Override
	public void run() {

		boolean stop = false;
		while (!stop) {
			long time = System.currentTimeMillis();
			while((System.currentTimeMillis()-time)<1000){
				
			}
			/**
			 * 这里是手动中断线程，在其他线程中，设置中断标记，
			 * 当前线程中，判断这个标记，看是否让中断，则手动
			 * 终止程序。
			 */
			if(Thread.currentThread().isInterrupted()){
				break;
			}
			System.out.println("running-------");
		}
		System.out.println("线程中断生效------");
	}
}
