/**   
* @Title: MyForthServiceA.java 
* @Package cn.songzx.cyclicbarrier.forth.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:53:50 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.forth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyForthServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午12:53:50
 * 
 */
public class MyForthServiceA {

	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017年11月12日下午12:54:24
	 * @Title: MyForthServiceA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param cbRef
	 */
	public MyForthServiceA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	public void beginRun() {
		long sleepValue = (int) (Math.random() * 10000);
		try {
			// 第一阶段
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + " begin跑第一阶段" + (cbRef.getNumberWaiting() + 1));
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "   end跑第一阶段" + (cbRef.getNumberWaiting()));
			// 第二阶段
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + " begin跑第二阶段" + (cbRef.getNumberWaiting() + 1));
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "   end跑第二阶段" + (cbRef.getNumberWaiting()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
