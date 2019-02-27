package cn.demo2;

/**
 * 模仿一个干活
 *
 * @author  mahao
 * @date:  2018年10月31日 下午2:51:47
 */
public class Count {

	public int num = 0;

	/**带线程并发问题*/
	public void add() {
		try {
			Thread.sleep(5l);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		num =num + 1;
		System.out.println(Thread.currentThread().getName() + "  " + num);
	}
	
	/**
	 * 给方法加锁（synchronized）
	 */
	public synchronized void add1(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		num += 1;
		System.out.println(Thread.currentThread().getName() + "  " + num);
	}
	
	/**
	 * 给代码块加对象锁
	 */
	public void add2(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (this) {
			num += 1;
			System.out.println(Thread.currentThread().getName() + "  " + num);
		}
	}
	
	/**
	 * $$$$---给代码块加小对象锁----$$$$
	 */
	byte[] lock = new byte[1];
	
	public void add3(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		synchronized (lock) {
			num += 1;
			System.out.println(Thread.currentThread().getName() + "  " + num);
		}
	}
}
