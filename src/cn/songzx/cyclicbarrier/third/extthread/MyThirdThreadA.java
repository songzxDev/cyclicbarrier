/**   
* @Title: MyThirdThreadA.java 
* @Package cn.songzx.cyclicbarrier.third.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:40:01 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.third.extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/** 
* @ClassName: MyThirdThreadA 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author Songzx songzx_2326@163.com 
* @date 2017年11月12日 下午12:40:01 
*  
*/
public class MyThirdThreadA extends Thread {
	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017年11月12日下午12:40:33
	 * @Title: MyThirdThreadA.java
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param cbRef
	 */
	public MyThirdThreadA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}
	
	public void run() {
		try {
			cbRef.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
