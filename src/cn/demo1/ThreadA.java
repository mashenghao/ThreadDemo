package cn.demo1;

/**
 * 1.实现Runnable接口；
 *
 * @author  mahao
 * @date:  2018年10月31日 下午3:36:21
 */
public class ThreadA implements Runnable{
	
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
