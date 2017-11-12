/**   
* @Title: MySeventhServiceA.java 
* @Package cn.songzx.cyclicbarrier.seventh.service 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:09:17 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.seventh.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MySeventhServiceA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:09:17
 * 
 */
public class MySeventhServiceA {

	public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
		public void run() {
			System.out.println("★★★★★★★★★★★★★★★★★★彻底结束了！" + System.currentTimeMillis());
		}
	});

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " 准备！" + System.currentTimeMillis());
			if (Thread.currentThread().getName().equals("C")) {
				Thread.sleep(Integer.MAX_VALUE);
			}
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + " 开始！" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
