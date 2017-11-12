/**   
* @Title: MyThirdRunA.java 
* @Package cn.songzx.cyclicbarrier.third.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:42:07 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.third.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.third.extthread.MyThirdThreadA;

/**
 * @ClassName: MyThirdRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午12:42:07
 * 
 */
public class MyThirdRunA {

	/**
	 * @Date: 2017年11月12日下午12:42:07
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		CyclicBarrier cbRef = new CyclicBarrier(3);

		try {
			MyThirdThreadA threadA = new MyThirdThreadA(cbRef);
			threadA.start();
			Thread.sleep(500L);
			// 类CyclicBarrier具有屏障重置性，即parties的值可以重置为0
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			MyThirdThreadA threadB = new MyThirdThreadA(cbRef);
			threadB.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			MyThirdThreadA threadC = new MyThirdThreadA(cbRef);
			threadC.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		try {
			MyThirdThreadA threadD = new MyThirdThreadA(cbRef);
			threadD.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		try {
			MyThirdThreadA threadE = new MyThirdThreadA(cbRef);
			threadE.start();
			Thread.sleep(500L);
			System.out.println(cbRef.getNumberWaiting());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
