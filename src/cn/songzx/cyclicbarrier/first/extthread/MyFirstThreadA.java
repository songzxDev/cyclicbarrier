/**   
* @Title: MyFirstThreadA.java 
* @Package cn.songzx.cyclicbarrier.first.extthread 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:17:01 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.first.extthread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyFirstThreadA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����12:17:01
 * 
 */
public class MyFirstThreadA extends Thread {

	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017��11��12������12:17:40
	 * @Title: MyFirstThreadA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param cbRef
	 */
	public MyFirstThreadA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	public void run() {
		try {
			Thread.sleep((int) (Math.random() * 1000));
			System.out.println(Thread.currentThread().getName() + " ���ˣ�" + System.currentTimeMillis());
			cbRef.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
