/**   
* @Title: MySeventhRunA.java 
* @Package cn.songzx.cyclicbarrier.seventh.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:15:49 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.seventh.test;

import cn.songzx.cyclicbarrier.seventh.extthread.MySeventhThreadA;
import cn.songzx.cyclicbarrier.seventh.extthread.MySeventhThreadB;
import cn.songzx.cyclicbarrier.seventh.extthread.MySeventhThreadC;
import cn.songzx.cyclicbarrier.seventh.service.MySeventhServiceA;

/**
 * @ClassName: MySeventhRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:15:49
 * 
 */
public class MySeventhRunA {

	/**
	 * @Date: 2017年11月12日下午2:15:49
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MySeventhServiceA service = new MySeventhServiceA();
			MySeventhThreadA threadA = new MySeventhThreadA(service);
			threadA.setName("A");
			threadA.start();

			MySeventhThreadB threadB = new MySeventhThreadB(service);
			threadB.setName("B");
			threadB.start();

			MySeventhThreadC threadC = new MySeventhThreadC(service);
			threadC.setName("C");
			threadC.start();

			Thread.sleep(2000L);
			// 方法getParties()的作用是取得parties的个数
			System.out.println("屏障对象的parties个数为：" + service.cyclicBarrier.getParties());
			// 方法getNumberWaiting()的作用是有几个线程已经到达屏障点
			System.out.println("在屏障处等待的线程个数为：" + service.cyclicBarrier.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
