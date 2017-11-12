/**   
* @Title: MyEighthRunA.java 
* @Package cn.songzx.cyclicbarrier.eighth.test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author Songzx songzx_2326@163.com   
* @date 2017年11月12日 下午2:29:44 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.eighth.test;

import cn.songzx.cyclicbarrier.eighth.extthread.MyEighthThreadA;
import cn.songzx.cyclicbarrier.eighth.extthread.MyEighthThreadB;
import cn.songzx.cyclicbarrier.eighth.service.MyEighthServiceA;

/**
 * @ClassName: MyEighthRunA
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author Songzx songzx_2326@163.com
 * @date 2017年11月12日 下午2:29:44
 * 
 */
public class MyEighthRunA {

	/**
	 * @Date: 2017年11月12日下午2:29:44
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param args
	 * @return void 返回值类型
	 */
	public static void main(String[] args) {
		try {
			MyEighthServiceA service = new MyEighthServiceA();
			MyEighthThreadA threadA = new MyEighthThreadA(service);
			threadA.setName("ThreadA");
			MyEighthThreadB threadB = new MyEighthThreadB(service);
			threadB.setName("ThreadB");
			// 线程C未实例化
			threadA.start();
			threadB.start();
			Thread.sleep(2000L);
			service.cyclicBarrier.reset();// reset()方法的作用是重置屏障，屏障被重置后2个线程出现了异常
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
