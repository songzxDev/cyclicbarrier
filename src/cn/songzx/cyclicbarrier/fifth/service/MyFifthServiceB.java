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
public class MyFifthServiceB {

	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017年11月12日下午1:41:51
	 * @Title: MyFifthServiceB.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param cbRef
	 */
	public MyFifthServiceB(CyclicBarrier cbRef) {
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
				 * 模拟interrupt中断情形，程序运行结果，全部线程都进入了catch语句块，其中Thread-2线程进入了
				 * InterruptedException的catch语句块，
				 * 其他3个线程进入了BrokenBarrierException的catch语句块
				 * 类CyclicBarrier对于线程的中断Interrupt处理会使用全有或者全无的破坏模型(breakage
				 * model)，意思是 如果有一个线程由于中断或者超时提前离开了屏障点，
				 * 其他所有在屏障点等待的线程也会抛出BrokenBarrierException
				 * 或者InterruptedException异常，并且离开屏障点。
				 */
				Thread.currentThread().interrupt();
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

	public void testB() {
		// 比赛了一个赛段
		for (int i = 0; i < 1; i++) {
			beginRun(i + 1);
		}
	}
}
