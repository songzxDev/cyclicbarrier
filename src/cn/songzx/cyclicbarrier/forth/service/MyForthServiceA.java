/**   
* @Title: MyForthServiceA.java 
* @Package cn.songzx.cyclicbarrier.forth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����12:53:50 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.forth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyForthServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����12:53:50
 * 
 */
public class MyForthServiceA {

	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017��11��12������12:54:24
	 * @Title: MyForthServiceA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param cbRef
	 */
	public MyForthServiceA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	public void beginRun() {
		long sleepValue = (int) (Math.random() * 10000);
		try {
			// ��һ�׶�
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + " begin�ܵ�һ�׶�" + (cbRef.getNumberWaiting() + 1));
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "   end�ܵ�һ�׶�" + (cbRef.getNumberWaiting()));
			// �ڶ��׶�
			Thread.sleep(sleepValue);
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + " begin�ܵڶ��׶�" + (cbRef.getNumberWaiting() + 1));
			cbRef.await();
			System.out.println(Thread.currentThread().getName() + " " + System.currentTimeMillis() + "   end�ܵڶ��׶�" + (cbRef.getNumberWaiting()));
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		}
	}
}
