package cn.demo1;

import java.util.concurrent.Callable;

/**
 * 实现了callable的接口
 *
 * @author mahao
 * @date: 2018年10月31日 下午3:43:25
 */
public class ThreadC implements Callable<String> {

	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		System.out.println(Thread.currentThread().getName());
		return "这是实现了callable的接口";
	}

}
