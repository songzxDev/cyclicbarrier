/**   
* @Title: MyFifthRunA.java 
* @Package cn.songzx.cyclicbarrier.fifth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午1:20:55 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.test;

import java.util.concurrent.CyclicBarrier;

import cn.songzx.cyclicbarrier.fifth.extthread.MyFifthThreadA;
import cn.songzx.cyclicbarrier.fifth.service.MyFifthServiceA;

/**
 * @ClassName: MyFifthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午1:20:55
 * 
 */
public class MyFifthRunA {

	/**
	 * @Date: 2017年11月12日下午1:20:55
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		int parties = 4;
		CyclicBarrier cbRef = new CyclicBarrier(parties, new Runnable() {
			public void run() {
				System.out.println("都到了！");
			}
		});

		MyFifthServiceA service = new MyFifthServiceA(cbRef);
		
		MyFifthThreadA[] threadArray = new MyFifthThreadA[parties];
		for (int i = 0; i < threadArray.length; i++) {
			threadArray[i] = new MyFifthThreadA(service);
			threadArray[i].start();
		}
		
	}

}
