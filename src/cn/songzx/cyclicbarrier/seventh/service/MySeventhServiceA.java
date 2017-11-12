/**   
* @Title: MySeventhServiceA.java 
* @Package cn.songzx.cyclicbarrier.seventh.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����2:09:17 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.seventh.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MySeventhServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����2:09:17
 * 
 */
public class MySeventhServiceA {

	public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
		public void run() {
			System.out.println("������������������ﳹ�׽����ˣ�" + System.currentTimeMillis());
		}
	});

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " ׼����" + System.currentTimeMillis());
			if (Thread.currentThread().getName().equals("C")) {
				Thread.sleep(Integer.MAX_VALUE);
			}
			cyclicBarrier.await();
			System.out.println(Thread.currentThread().getName() + " ��ʼ��" + System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
