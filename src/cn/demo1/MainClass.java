package cn.demo1;

import java.util.concurrent.FutureTask;

/**
 * Thread的API,以及创建介绍
 *
 * @author mahao
 * @date: 2018年10月31日 下午3:31:10
 */
public class MainClass {

	/**
	 * 三种多线程创建方法
	 * 
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// >>
		Thread t1 = new Thread(new ThreadA(), "实现runnable接口的多线程");
		t1.start();
		// >>
		ThreadB t2 = new ThreadB("继承Thread父类的线程");
		t2.start();
		// >>
		ThreadC t3 = new ThreadC();
		FutureTask<String> futureTask = new FutureTask<>(t3);
		new Thread(futureTask).start();
		System.out.println("主线程------------开始-");
		System.out.println(futureTask.get());
		System.out.println("-----------------------");
	}
}
