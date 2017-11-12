/**   
* @Title: MyFifthServiceA.java 
* @Package cn.songzx.cyclicbarrier.fifth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午1:11:59 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyFifthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午1:11:59
 * 
 */
public class MyFifthServiceA {
	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017年11月12日下午1:12:55
	 * @Title: MyFifthServiceA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param cbRef
	 */
	public MyFifthServiceA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	private void beginRun(int count) {
		try {
			System.out.println(Thread.currentThread().getName() + " 到了 在等待其他人都到了开始起跑！");
			if (Thread.currentThread().getName().equals("Thread-2")) {
				System.out.println("thread-2 进来了！");
				Thread.sleep(5000L);
				/*
				 * 模拟异常情形，从程序运行结果上看，有一个线程出现异常报错，则其他线程继续等待，并不影响程序的主流程
				 */
				Integer.parseInt("a");
			}
			cbRef.await();
			System.out.println("都到了，开始跑！");
			System.out.println(Thread.currentThread().getName() + " 到达终点，并结束第【" + count + "】赛段！");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("进入了InterruptedException e " + cbRef.isBroken());// 方法isBroken()查询此屏障是否处于损坏状态
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			System.out.println("进入了BrokenBarrierException e " + cbRef.isBroken());
			e.printStackTrace();
		}
	}

	public void testA() {
		// 比赛了一个赛段
		for (int i = 0; i < 1; i++) {
			beginRun(i + 1);
		}
	}
}
