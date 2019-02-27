package cn.demo2;


/**
 * 多线程并发，导致数据不安全
 *
 * @author mahao
 * @date: 2018年10月31日 下午2:50:56
 */
public class MainClass {

	/**
	 * 带线程并发问题
	 */
	public static void main(String args[]) {
		/*
		 * 模仿5个人同时干活
		 */
		Count c = new Count();
		for (int i = 0; i < 5; i++) {
			MyThread t = new MyThread(c);
			t.start();
		}
		// 等待线程执行结束
		try {
			Thread.sleep(3000);
		} catch (Exception e) {

		}
		System.out.println("工作结束后，数据为---" + c.num);
	}
}
