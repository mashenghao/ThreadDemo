package cn.demo1;

/**
 * 线程API
 *
 * @author  mahao
 * @date:  2018年10月31日 下午4:13:24
 */
public class MainClass2 implements Runnable{
	
	public static void main(String[] args) throws Exception {
		MainClass2 MainClass2 = new MainClass2();
		Thread t1 = new Thread(MainClass2,"实现线程A");
		t1.start();
		Thread.sleep(10000);
	}

	@Override
	public void run() {
		Thread currentThread = Thread.currentThread();
		System.out.println("线程的名字为"+currentThread.getName());
		System.out.println("线程组中活跃的数量"+currentThread.activeCount()+Thread.activeCount());
		System.out.println("线程的id"+currentThread.getId());
		System.out.println("线程的优先级"+currentThread.getPriority());
		System.out.println("线程的状态"+currentThread.getState());
		System.out.println("线程的组"+currentThread.getThreadGroup());
		System.out.println("线程的守护线程"+currentThread.isDaemon());
	}
}
