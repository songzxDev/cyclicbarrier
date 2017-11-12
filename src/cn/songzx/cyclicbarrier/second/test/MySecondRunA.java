/**   
* @Title: MySecondRunA.java 
* @Package cn.songzx.cyclicbarrier.second.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:32:05 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.second.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.second.extthread.MySecondThreadA;

/**
 * @ClassName: MySecondRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午12:32:05
 * 
 */
public class MySecondRunA {

	/**
	 * @Date: 2017年11月12日下午12:32:05
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			// 问题1：如果线程个数和parties个数不同，即线程的个数大于parties的个数，能否批量处理呢？
			CyclicBarrier cbRef = new CyclicBarrier(2, new Runnable() {
				public void run() {
					System.out.println("全来了！");
				}
			});
			for (int i = 0; i < 4; i++) {
				/*
				 * 从运行效果上看，可以实现分批处理：
				 * 
				 * Thread-0 begin =1510461266385 等待凑齐两个继续运行！
				 * 
				 * Thread-1 begin =1510461268397 等待凑齐两个继续运行！
				 * 
				 * 全来了！
				 * 
				 * Thread-1 end =1510461268397 已经凑齐两个继续运行！
				 * 
				 * Thread-0 end =1510461268397 已经凑齐两个继续运行！
				 * 
				 * Thread-2 begin =1510461270411 等待凑齐两个继续运行！
				 * 
				 * Thread-3 begin =1510461272424 等待凑齐两个继续运行！
				 * 
				 * 全来了！
				 * 
				 * Thread-3 end =1510461272424 已经凑齐两个继续运行！
				 * 
				 * Thread-2 end =1510461272424 已经凑齐两个继续运行！
				 */
				MySecondThreadA threadA = new MySecondThreadA(cbRef);
				threadA.start();
				Thread.sleep(2000L);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
