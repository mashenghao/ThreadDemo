package cn.demo2;

/**
 * 线程类，调用方法
 *
 * @author  mahao
 * @date:  2018年10月31日 下午2:52:11
 */
public class MyThread extends Thread{
	
	private Count count;
	
	public MyThread(Count count) {
		this.count= count;
	}
	
	@Override
	public void run() {
		/*
		 * 并发问题
		 */
		//count.add();
		/*
		 *1.加锁方法上 
		 */
		count.add3();
	}
}
