/**   
* @Title: MySecondThreadA.java 
* @Package cn.songzx.cyclicbarrier.second.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:28:46 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.second.extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MySecondThreadA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午12:28:46
 * 
 */
public class MySecondThreadA extends Thread {
	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017年11月12日下午12:29:20
	 * @Title: MySecondThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param cbRef
	 */
	public MySecondThreadA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	public void run() {
		try {
			System.out.println(Thread.currentThread().getName() + " begin =" + System.currentTimeMillis() + " 等待凑齐两个继续运行！");
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + "   end =" + System.currentTimeMillis() + " 已经凑齐两个继续运行！");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}

}
