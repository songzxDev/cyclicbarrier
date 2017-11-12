/**   
* @Title: MyFifthServiceA.java 
* @Package cn.songzx.cyclicbarrier.fifth.service 
* @Description: TODO(��һ�仰�������ļ���ʲô) 
* @author Songzx songzx_2326@163.com   
* @date 2017��11��12�� ����1:11:59 
* @version V1.0   
*/
package cn.songzx.cyclicbarrier.fifth.service;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName: MyFifthServiceA
 * @Description: TODO(������һ�仰��������������)
 * @author Songzx songzx_2326@163.com
 * @date 2017��11��12�� ����1:11:59
 * 
 */
public class MyFifthServiceA {
	private CyclicBarrier cbRef;

	/**
	 * @Date: 2017��11��12������1:12:55
	 * @Title: MyFifthServiceA.java
	 * @Description: TODO(������һ�仰�����������������)
	 * @param cbRef
	 */
	public MyFifthServiceA(CyclicBarrier cbRef) {
		super();
		this.cbRef = cbRef;
	}

	private void beginRun(int count) {
		try {
			System.out.println(Thread.currentThread().getName() + " ���� �ڵȴ������˶����˿�ʼ���ܣ�");
			if (Thread.currentThread().getName().equals("Thread-2")) {
				System.out.println("thread-2 �����ˣ�");
				Thread.sleep(5000L);
				/*
				 * ģ���쳣���Σ��ӳ������н���Ͽ�����һ���̳߳����쳣�����������̼߳����ȴ�������Ӱ������������
				 */
				Integer.parseInt("a");
			}
			cbRef.await();
			System.out.println("�����ˣ���ʼ�ܣ�");
			System.out.println(Thread.currentThread().getName() + " �����յ㣬�������ڡ�" + count + "�����Σ�");
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			System.out.println("������InterruptedException e " + cbRef.isBroken());// ����isBroken()��ѯ�������Ƿ�����״̬
			e.printStackTrace();
		} catch (BrokenBarrierException e) {
			System.out.println("������BrokenBarrierException e " + cbRef.isBroken());
			e.printStackTrace();
		}
	}

	public void testA() {
		// ������һ������
		for (int i = 0; i < 1; i++) {
			beginRun(i + 1);
		}
	}
}
