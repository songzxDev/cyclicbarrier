/**   
* @Title: MyEighthServiceA.java 
* @Package cn.songzx.cyclicbarrier.eighth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:24:38 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.eighth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyEighthServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:24:38
 * 
 */
public class MyEighthServiceA {
	public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
		public void run() {
			System.out.println("����������׽����ˣ�����������" + System.currentTimeMillis());
		}
	});

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " ׼����" + System.currentTimeMillis());
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + " ������" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}

	}
}
