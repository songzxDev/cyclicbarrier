/**   
* @Title: MyEighthServiceA.java 
* @Package cn.songzx.cyclicbarrier.eighth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:24:38 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.eighth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyEighthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:24:38
 * 
 */
public class MyEighthServiceA {
	public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
		public void run() {
			System.out.println("☆☆☆☆☆☆☆☆☆彻底结束了！☆☆☆☆☆☆☆☆☆" + System.currentTimeMillis());
		}
	});

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " 准备！" + System.currentTimeMillis());
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + " 结束！" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}
}
