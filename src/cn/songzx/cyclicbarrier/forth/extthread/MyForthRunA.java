/**   
* @Title: MyForthRunA.java 
* @Package cn.songzx.cyclicbarrier.forth.extthread 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午1:00:39 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.forth.extthread;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.forth.service.MyForthServiceA;

/**
 * @ClassName: MyForthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午1:00:39
 * 
 */
public class MyForthRunA {

	/**
	 * @Date: 2017年11月12日下午1:00:39
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		/*
		 * 类CyclicBarrier的parties值从1到2，然后再恢复成0的过程，证明CyclicBarrier类的屏障点是可以复用的
		 * 线程ABCD每到达一个屏障点时的组合有可能时随机的，有可能A和B到达第一屏障，而到达第二屏障时的组合却是A和D，
		 * 因为线程A和D的sleep(long l)值较小，也就是sleep(long l)用时最少的互相组合，继续向下一个屏障行进。
		 */
		CyclicBarrier cbRef = new CyclicBarrier(2);

		MyForthServiceA service = new MyForthServiceA(cbRef);

		MyForthThreadA threadA = new MyForthThreadA(service);
		threadA.setName("ThreadA");
		threadA.start();

		MyForthThreadA threadB = new MyForthThreadA(service);
		threadB.setName("ThreadB");
		threadB.start();

		MyForthThreadA threadC = new MyForthThreadA(service);
		threadC.setName("ThreadC");
		threadC.start();

		MyForthThreadA threadD = new MyForthThreadA(service);
		threadD.setName("ThreadD");
		threadD.start();

	}

}
