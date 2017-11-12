/**   
* @Title: MyFirstRun.java 
* @Package cn.songzx.cyclicbarrier.first.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午12:20:57 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.first.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.first.extthread.MyFirstThreadA;

/**
 * @ClassName: MyFirstRun
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午12:20:57
 * 
 */
public class MyFirstRun {

	/**
	 * @Date: 2017年11月12日下午12:20:57
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		/*
		 * 设置最大为5个的parties同行者，也就是5个线程都执行了cbRef对象的await()方法后程序才可以继续
		 * 向下运行，否则这些线程彼此互相等待，一直呈阻塞状态。
		 */
		CyclicBarrier cbRef = new CyclicBarrier(5, new Runnable() {
			public void run() {
				System.out.println("全部都到了！");
			}
		});

		MyFirstThreadA[] threadArray = new MyFirstThreadA[5];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyFirstThreadA(cbRef);
		}
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i].start();
		}
	}

}
