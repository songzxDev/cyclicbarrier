/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.cyclicbarrier.first.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:17:01 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.first.extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午12:17:01
 * 
 */
public class MyFirstThreadA extends Thread {

	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017年11月12日下午12:17:40
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param cbRef
	 */
	public MyFirstThreadA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println(Thread.currentThread().getName() + " 到了！" + System.currentTimeMillis());
			cbRef.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
