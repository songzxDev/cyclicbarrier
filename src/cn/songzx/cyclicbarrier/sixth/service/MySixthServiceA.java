/**   
* @Title: MySixthServiceA.java 
* @Package cn.songzx.cyclicbarrier.sixth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����1:56:27 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.sixth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * @ClassName: MySixthServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����1:56:27
 * 
 */
public class MySixthServiceA {
	public CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
		public void run() {
			System.out.println("���׽����ˣ�" + System.currentTimeMillis());
		}
	});

	public void testMethodA() {
		try {
			System.out.println(Thread.currentThread().getName() + " ׼����" + System.currentTimeMillis());
			if (Thread.currentThread().getName().equals("Thread-0")) {
				System.out.println("Thread-0 ִ���� cyclicBarrier.await(5, TimeUnit.SECONDS)");
				/*
				 * ����await(long timeout, TimeUnit
				 * unit)�Ĺ����������ָ����ʱ���ڴﵽparties�������������
				 * �����������У�����������ֳ�ʱ���׳�TimeOutException�쳣��
				 */
				cyclicBarrier.await(5, TimeUnit.SECONDS);
			}
			if (Thread.currentThread().getName().equals("Thread-1")) {
				System.out.println("Thread-1 ִ���� cyclicBarrier.await(5, TimeUnit.SECONDS)");
				cyclicBarrier.await(5, TimeUnit.SECONDS);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			e.printStackTrace();
		} catch (TimeoutException e) {
			e.printStackTrace();
		}
	}
}
