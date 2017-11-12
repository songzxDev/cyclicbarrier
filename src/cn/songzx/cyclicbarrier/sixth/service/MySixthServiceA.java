/**   
* @Title: MySixthServiceA.java 
* @Package cn.songzx.cyclicbarrier.sixth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午1:56:27 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.sixth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName: MySixthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午1:56:27
 * 
 */
public class MySixthServiceA {
	public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
		public void run() {
			System.out.println("彻底结束了，" + System.currentTimeMillis());
		}
	});

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " 准备！" + System.currentTimeMillis());
			if (Thread.currentThread().getName().equals("Thread-0")) {
				System.out.println("Thread-0 执行了 cyclicBarrier.await(5, TimeUnit.SECONDS)");
				/*
				 * 方法await(long timeout, TimeUnit
				 * unit)的功能是如果在指定的时间内达到parties的数量，则程序
				 * 继续向下运行，否则如果出现超时，抛出TimeOutException异常。
				 */
				cyclicBarrier.await(5, TimeUnit.SECONDS);
			}
			if (Thread.currentThread().getName().equals("Thread-1")) {
				System.out.println("Thread-1 执行了 cyclicBarrier.await(5, TimeUnit.SECONDS)");
				cyclicBarrier.await(5, TimeUnit.SECONDS);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
